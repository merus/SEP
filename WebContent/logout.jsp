<%@ include file="header.jsp"%> 
<%@ include file="loginbar.jsp"%> 
<html> 
	<%
		//If no one is logged in then redirec to index and print error
		if(user==null)
		{
			session.setAttribute("error", "Error: not logged in");
			response.sendRedirect("index.jsp");
		}
		//Remove author from the session, redirect to index and show logout message
		else{
			session.removeAttribute("user");
			session.setAttribute("error", "You have been logged out");
			response.sendRedirect("index.jsp");
		}
	%>
</html>