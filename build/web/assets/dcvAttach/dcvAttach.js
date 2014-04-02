/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){

		dcvAttach_init();
	
        moveProgressBar();
        // on browser resize...
        $(window).resize(function() {
            moveProgressBar();
        });
        
        $("#dcvAttach_add").live("click",function(){
            
           $("#dcvAttach_fbench").append("<input class='file' type=file>");
           $("#dcvAttach_fbench").children(":last-child").click();
            
        });
        
        $(".file").live("change",function(){
           
           var file = $(this)[0].files[0];
           var id = Math.random().toString(36).substring(7);
           
           $("#dcvAttach_pbench").append("<div id=\""+id+"\"  class=\"row-fluid attachment progress-wb\"><div class=\"span4 progress-word\" >"+file.name+"</div><div class=\"span4\">   <div class=\"progress-wrap progress\" data-progress-percent=\"0\"><div class=\"progress-bar progress\"></div>  </div>   </div><div class=\"span1 progress-del-disabled\">X</div></div>")
           
           var xhr = new XMLHttpRequest();
           
           xhr.addEventListener('progress', function(e) 
           {
                var done = e.position || e.loaded, total = e.totalSize || e.total;
                var percent = (Math.floor(done/total*1000)/10);
                updateBar(id,percent);
                moveProgressBar();
           }, false);
            
           if ( xhr.upload ) 
           {
               xhr.upload.onprogress = function(e) 
               {
                    var done = e.position || e.loaded, total = e.totalSize || e.total;
                    var percent = (Math.floor(done/total*1000)/10);                                        
                    updateBar(id,percent);
                    moveProgressBar();
               };
           }
           
           xhr.onreadystatechange = function(e) 
           {
               if ( 4 == this.readyState && this.status == 200 ) 
               {
                   completeBar(id,this.responseText);
               }
           };           
           
           var msg = new FormData;
           msg.append('attachment',file);
           
           xhr.open('post', "upload", true);
           xhr.send(msg);
           
        });
        
        $(".progress-del").on("mouseenter",function(){
           
            $(this).siblings(".progress-word").addClass("for_deletion");
                     
        });
 
        $(".progress-del").on("mouseleave",function(){
           
            $(this).siblings(".progress-word").removeClass("for_deletion");
                     
        });
        
});



function moveProgressBar() 
{ 
       $('.progress-wrap').each(function(){

            console.log("moveProgressBar");
            var getPercent = ($(this).data('progress-percent') / 100);
            var getProgressWrapWidth = $(this).width();
            var progressTotal = getPercent * getProgressWrapWidth;
            var animationLength = 200;           
                      
            $(this).children(".progress-bar").stop().animate({
                left: progressTotal
            }, animationLength);
           
       }); 
}

function updateBar(id,percent)
{
    $("#"+id).find(".progress-wrap").data("progress-percent",percent);    
}

function completeBar(id,val)
{
	$("#"+id).attr("data-atch_id",val)
	$("#"+id).find(".progress-del-disabled").attr("data-atch_id",val);
    $("#"+id).find(".progress-del-disabled").removeClass("progress-del-disabled").addClass("progress-del")
}

function dcvAttach_init()
{
	
	$("#dcvAttach_controls").html("        <div class=\"row-fluid\">            <div class=\"span1\" id=\"dcvAttach_add\">            </div>            <div class=\"span1 dcvAttach_no_box\">                <span id=\"dcvAttach_no\">(3)</span>            </div>            <div class=\"span1 dcvAttach_del\">X</div>        </div>");
	$("#dcvAttach_workArea").html("        <div id=\"dcvAttach_pbench\">        </div>                <div id=\"dcvAttach_fbench\">                    </div>");
	
}