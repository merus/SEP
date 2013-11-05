<%@ include file="header.jsp"%> 
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String person = null;// = XXX.login(id, password);

	if (person == null)
	{
		session.setAttribute("login", "Login Credentials Incorrect");
		response.sendRedirect("login.jsp");
	}
	else
	{
		session.setAttribute("Person", person);
		response.sendRedirect("index.jsp");
	}
%>