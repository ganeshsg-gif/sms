package com.cargo.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javazoom.upload.MultipartFormDataRequest;
import javazoom.upload.UploadBean;

public class TestSrv  extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		try
		{
				UploadBean bean=new UploadBean();
				bean.setFolderstore("C:\\ganesh");
				bean.setOverwrite(false);
				
				MultipartFormDataRequest nreq=new MultipartFormDataRequest(req);
				bean.store(nreq);
				
				pw.println("Files are uploaded successfully");
				
		}
		catch(Exception e)
		{
			pw.println("File not uploaded successfully");
		}
		
		pw.close();
	}
}

























