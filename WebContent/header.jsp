<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="edu.uts.sep.model.*"%>

<link rel="stylesheet" type="text/css" href="style.css" />


<%
	String error = (String) session.getAttribute("error");
	String user = (String) session.getAttribute("user");
%>
<div class="error">
	<%
		if (error != null)
		{
			out.print(error);
			session.removeAttribute("error");
		}
		else
			out.print("</br>");
	%>
</div>
<div id="nav">
	<div id="title">
		<a href="index.jsp">SEP Enrollment System</a>
	</div>
	<a href="https://www.uts.edu.au">University of Technology Sydney</a>
</div>
<br />
<!--END Navigation Bar-->
