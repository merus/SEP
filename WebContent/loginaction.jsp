<%@ include file="header.jsp"%> 
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	boolean login = true;

	if (login)
	{
		session.setAttribute("user", id);
		response.sendRedirect("index.jsp");
	}
	else
	{
		session.setAttribute("login", "Login Credentials Incorrect");
		response.sendRedirect("login.jsp");
	}
%>