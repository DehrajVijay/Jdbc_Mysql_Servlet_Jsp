package com.registerservlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class DisplayServlet extends HttpServlet {

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		// out.println("Connected with RegisterServlet");
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String select_course = request.getParameter("select_course");
		String cond = request.getParameter("condition");
		// we can also store the data in database with the help of JDBC.
		if (cond != null) {
			if (cond.equals("checked")) {
				out.print("<h2>Name :" + name + "</h2>");
				out.print("<h2>Password:" + password + "</h2>");
				out.print("<h2>Email :" + email + "</h2>");
				out.print("<h2>Gender:" + gender + "</h2>");
				out.print("<h2>Course :" + select_course + "</h2>");

			} else {

			}

		} else
			out.print("<h2>You did not accept the terms and conditions.</h2>");

	}

}
