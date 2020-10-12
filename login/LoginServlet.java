package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserDetails;
import services.LoginValidation;
import services.LoginValidationImplementation;


public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/Html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		UserDetails userDetails = new UserDetails(userName, password);
		HttpSession session = request.getSession();
		LoginValidation loginValidation = new LoginValidationImplementation();
		UserDetails user = loginValidation.validation(userDetails);
		if(user!=null) {
			session.setAttribute("user", user);
			request.getRequestDispatcher("/com.view/Profile.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/Home.jsp").include(request, response);
			out.println("<h3>"+"please enter valid credentials"+"</h3>");
		}
	}

}
