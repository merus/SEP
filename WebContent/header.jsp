<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="edu.uts.sep.model.*"%>
<<<<<<< HEAD
	<link rel="stylesheet" type="text/css" href="style.css" />
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
	<link rel="stylesheet" type="text/css" href="style.css" />
=======
>>>>>>> origin/matt
<link rel="stylesheet" type="text/css" href="style.css" />
>>>>>>> ba09fe7d5cb4c440ae980e793f205b9abc5da91b

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
		<a href="login.jsp">Log In</a>
	</div>

	<%
		}
		else
		{
	%>
	<!--BEGIN Nav Bar logged In -->
	<div id="nav">
		<div id="userstatus"><%=s%>
			- <a href="createarticle.jsp">New Article</a> - <a
				href="author.jsp?author=<%=s%>">Author Profile</a> - <a
				href="logout.jsp">Log Out</a>
		</div>
		<%
			}
		%>
		<div id="title">
			<a href="index.jsp">SEP Enrollment System</a>
		</div>
		<a href="category.jsp?cat=news">News</a> | <a
			href="category.jsp?cat=sports">Sports</a> | <a
			href="category.jsp?cat=business">Business</a> | <a
			href="category.jsp?cat=politics">Politics</a> | <a
			href="category.jsp?cat=technology">Technology</a> | <a
			href="category.jsp?cat=travel">Travel</a>
	</div>
	<br />
<<<<<<< HEAD

	<!--END Navigation Bar-->
=======
<<<<<<< HEAD
	<!--END Navigation Bar-->
=======
	<!--END Navigation Bar-->
>>>>>>> 61174877e61bc83b78f7e8d9a113e414465e7fb2
>>>>>>> origin/matt
>>>>>>> ba09fe7d5cb4c440ae980e793f205b9abc5da91b
