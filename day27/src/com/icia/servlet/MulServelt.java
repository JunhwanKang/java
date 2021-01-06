package com.icia.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mul")
public class MulServelt extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("val1"));
		int num2 = Integer.parseInt(request.getParameter("val2"));
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(num1+"*"+num2+"="+(num1*num2));
	}

}
