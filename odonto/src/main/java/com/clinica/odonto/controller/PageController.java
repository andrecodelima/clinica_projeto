package com.clinica.odonto.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/home"})
public class PageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PageController() {
        super();
     }
    
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String address = request.getServletPath();

		switch (address) {
		
		case "/home":
			Home(request, response);
			break;
	 
			
			
		}
		

	}
	
	
	//Home
    public void Home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.sendRedirect("index.jsp");
 		 
	}
	
	
	 

}
