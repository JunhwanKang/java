package com.icia.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class SumSevelt extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1 = request.getParameter("val1");
		String str2 = request.getParameter("val2");
		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str2);
		response.setContentType("text/html; charset=utf-8");
		//boilerplate
		PrintWriter out = response.getWriter();
		int sum = i1+i2;
		out.print(i1 + "+" + i2 + "="+ sum);
	}

}
