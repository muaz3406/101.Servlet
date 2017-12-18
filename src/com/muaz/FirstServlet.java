package com.muaz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("here in do post");
		response.setContentType("text/hmtl");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		RequestDispatcher rd = null;
		
		if (name.equals("muaz")) {
			out.print("Hello muaz");
			rd = request.getRequestDispatcher("/success.html");
			rd.forward(request, response);
		}else{
			out.print("Hello you are not muaz");
			rd = request.getRequestDispatcher("/error.html");
			rd.forward(request, response);
		}
	}

}
