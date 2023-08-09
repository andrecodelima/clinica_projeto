package com.clinica.odonto.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clinica.odonto.model.Exame;
import com.clinica.odonto.services.ExameServices;

 
@WebServlet(urlPatterns = { "/insertExame"})
public class ExameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public ExameController() {
        super();
       
    }
 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String address = request.getServletPath();

		switch (address) {
		
		case "/insertExame":
			newExame(request, response);
			break;

			
//		case "/deleteClient":
//			delClient(request, response);
//			break;
//			
//		case "/updateClient":
//			try {
//				updateClient(request, response);
//			} catch (ServletException | IOException | SQLException e) {
//				 
//				e.printStackTrace();
//			}
//			break;	
			
			
		}
		


	}
    
 
	public void newExame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Exame exame = new Exame(
								request.getParameter("inputNome"),
								Integer.parseInt(request.getParameter("idPaciente"))
										

							   );
		
		if(ExameServices.insert(exame)) {
			response.getWriter().append("Cadastrado com sucesso");
			System.out.println("Cadastrado");
		}else {
			response.getWriter().append("Falha no cadastro");
			System.out.println("Erro");


		}
	}
}
