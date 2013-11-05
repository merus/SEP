<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="edu.uts.sep.model.*"%>

<link rel="stylesheet" type="text/css" href="style.css" />
<%
	session.setAttribute("s", "HELLO");
	String s = (String) session.getAttribute("s");
%>
<%
	if (s != null)
	{
%>
<!--BEGIN Nav Bar not logged In -->
<div id="nav">
	<div id="userstatus">
		<a href="login.jsp">Log In</a> | 
		<a href="register.jsp">Register</a> 
	</div>

	<%
		}
		else
		{
	%>
	<!--BEGIN Nav Bar logged In -->
	<div id="nav">
		<div id="userstatus"><%=s%>
			- <a href="todo.jsp">My Account</a> - <a

				href="logout.jsp">Log Out</a>
		</div>
		<%
			}
		%>
		<div id="title">
			<a href="index.jsp">SEP Enrollment System</a>
		</div>
		<a href="login.jsp?">Login</a> | <a
			href="register.jsp">Register</a> | <a
			href="category.jsp?cat=business">Subjects</a> | <a
			href="category.jsp?cat=politics">Contracts</a>
	</div>
	<br />
</div>
<!--END Navigation Bar-->
