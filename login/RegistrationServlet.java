package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserDetails;
import services.RegistrationService;
import services.RegistrationServiceImplementation;

public class RegistrationServlet extends HttpServlet {
	RegistrationService registrationService = new RegistrationServiceImplementation();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/Html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		UserDetails userDetails = new UserDetails(userName, password, firstName, lastName, gender, age);
		if(registrationService.getNewUserDetails(userDetails)) {
			request.getRequestDispatcher("/Home.jsp").include(request, response);
			out.println("<h3>"+"SUCCESSFULLY CREATED"+"</h3>");
		}
		else {
			request.getRequestDispatcher("/Home.jsp").include(request, response);
			out.println("<h1>"+"FAILED TO CREATE YOUR ACCOUNT PLEASE TRY AGAIN"+"</h1>");
		}
	}

}
