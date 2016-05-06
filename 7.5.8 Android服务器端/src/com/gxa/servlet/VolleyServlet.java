package com.gxa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/volley.do")
public class VolleyServlet extends HttpServlet {

	private static final long serialVersionUID = 113441442278726217L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		System.out.println("username = " + username + " address = " + address);
		PrintWriter out = response.getWriter();
		out.println(username+"--"+address);
		out.flush();
		out.close();
	}
	
}
