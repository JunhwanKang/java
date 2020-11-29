<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.TimeZone"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Date d1 = new Date();
	TimeZone tz;
	tz = TimeZone.getTimeZone(request.getParameter("timezone")); // 지역
	SimpleDateFormat df = new SimpleDateFormat(request.getParameter("format")); //시간
	
// 	 df.setTimeZone(tz);
   
	out.print(df.format(d1));
	
// 	System.out.println(TimeZone.getTimeZone(request.getParameter("timezone")));
// 	System.out.println(request.getParameter("timezone"));
%>
