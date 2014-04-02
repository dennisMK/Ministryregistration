package com.tut.servlets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.xmappr.Xmappr;

import com.tut.hibernate.Attachment;
import com.tut.hibernateUtil.HibernateUtil;
import com.tut.settings.Config;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Session _SESS;
	private boolean isMultipart;
	private String filepath;
	private int maxFileSize = 50 * 1024 * 1024;
	private int maxMemSize = 4*1024*1024;
	private File file;
	private String curr_item = "";
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		filepath = getConfig().getUploadDir();
		maxFileSize = getConfig().getMaxFileSize();
		maxMemSize = getConfig().getMaxMemSize();
		_SESS = HibernateUtil.getSessionFactory().openSession();
		_SESS.close();
	}

	
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		
		if(_SESS.isOpen())
			_SESS.close();
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().print(" Bad request sent :/ ");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		_SESS =HibernateUtil.getSessionFactory().openSession();
		
		try {
			curr_item = PasswordHash.createHash("curr_item");
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		isMultipart = ServletFileUpload.isMultipartContent(request);
		if(!isMultipart)
		{
			response.getWriter().print(" Bad request sent :/ ");
			return;
		}
		
		Attachment attach = new Attachment();
		attach.setIdentifier(curr_item);
		
		
		response.getWriter().print(curr_item);
		
		ProgressListener progressListener = new ProgressListener(){	
			
			
			  public void update(long pBytesRead, long pContentLength, int pItems) {
				  
				  	
				  	
			       System.out.println("We are currently reading item " + pItems + "("+curr_item+")");
			       if (pContentLength == -1) {
			           System.out.println("So far, " +  pBytesRead + " bytes have been read.");
			       } else {
			           System.out.println("So far, " + pBytesRead + " of " + pContentLength
			                              + " bytes have been read.");
			       }
			   }
			   
			   
			};
		
		DiskFileItemFactory factory = new DiskFileItemFactory(maxMemSize, new File(filepath));
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		upload.setSizeMax(maxFileSize);
		upload.setProgressListener(progressListener);
		
		try 
		{
			
			List<FileItem> items = upload.parseRequest(request);
			
			for (FileItem item : items) 
			{
				
				if(!item.isFormField())
				{					
					File uploadedFile = new File(filepath+"/"+item.getName());
					attach.setName(item.getName());
					attach.setType(item.getContentType());
					
					_SESS.beginTransaction();
					_SESS.save(attach);
					_SESS.getTransaction().commit();
					
					item.write(uploadedFile);
				}
				
			}
			
			_SESS.close();
		
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	private Config getConfig()
	{
		Reader reader = null;
		
		try {
			reader = new FileReader(getServletContext().getRealPath("/WEB-INF/config/upload_config.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Xmappr xml = new Xmappr(Config.class);
		Config test = (Config) xml.fromXML(reader);
		
		return test;
	}
	
	
	
}
