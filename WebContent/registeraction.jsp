<%@ include file="header.jsp"%> 
<%
	String email = request.getParameter("email");
	String firstname = request.getParameter("firstname");
	String lastname = request.getParameter("lastname");
	String password = request.getParameter("password");
	String passwordconfirmation = request.getParameter("passwordconfirmation");

	
	if (password != passwordconfirmation)
	{
		session.setAttribute("register", "The password entered did not match");
		response.sendRedirect("login.jsp");
	}
		else 		
		{
			
			//make account	
//Person person = newPerson(firstname, lastname, email, password);
			
			
			
			
		
			
			//login in to user created
			//session.setAttribute("Person", person);
			response.sendRedirect("index.jsp");
		}
	



%>