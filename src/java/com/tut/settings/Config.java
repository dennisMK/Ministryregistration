package com.tut.settings;

import org.xmappr.Element;
import org.xmappr.RootElement;

@RootElement("config")
public class Config {

	@Element("updir")
	public String uploadDir;
	
	@Element("flsz")
	public int maxFileSize;
	
	@Element("msz")
	public int maxMemSize;


	public String getUploadDir() {
		return uploadDir;
	}


	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}


	public int getMaxFileSize() {
		return maxFileSize;
	}


	public void setMaxFileSize(int maxFileSize) {
		this.maxFileSize = maxFileSize;
	}


	public int getMaxMemSize() {
		return maxMemSize;
	}


	public void setMaxMemSize(int maxMemSize) {
		this.maxMemSize = maxMemSize;
	}
	
	

}
