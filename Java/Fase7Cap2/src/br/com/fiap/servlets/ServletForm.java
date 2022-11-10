package br.com.fiap.servlets;

import java.io.IOException;


@WebServlet("/exemplo")
public class ServletForm extends HttpServlet {
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			if(login.equals("userx") && senha.equals("12345")) {
				response.sendRedirect("sucesso.html");
			} else {
				response.sendRedirect("acesso_negado.html");
			}
		}
	
	}
