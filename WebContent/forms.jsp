<%@ include file="header.jsp"%>
<html>
<head>
<title>Home</title>

</head>
<body>
	<div id="breadcrumbs">
		You are here: <a href="index.jsp">Home</a> > <a href="user.jsp?id=<%=user%>"><%=/*CONTROLLER.GETPERSONNAME(user)*/user %>HI</a> > <i>Forms</i>
		<%@ include file="loginbar.jsp"%>
	</div>
	
	<div id="container">
		view incomplete form create employment request create employment
	contract
	
	</div>
</body>
</html>
<%
	if (user == null || user.equals(""))
	{
		session.setAttribute("error",
				"Cannot access page: Not logged in");
		//session.removeAttribute("user");
		//response.sendRedirect("index.jsp");
	}
%>