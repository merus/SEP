<%@ include file="header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%
	String name;
	try
	{
		String id = request.getParameter("id");
		name = CONTROLLER.findAuthorByID(Integer.parseInt(id));
	}
	catch (Exception e)
	{
		name = null;
	}
	finally{}

	if (name != null)
		out.print("<title>" + name + "'s Information</title>");
%>
</head>
<body>
	<%
		/*
		 * If the id specified in the get request doesn't match an author
		 * Redirect to index page
		 */
		if (name == null)
		{
			session.setAttribute("error", "Error: no such user");
			response.sendRedirect("index.jsp");
		}
		else
		{
	%>
	<div id="breadcrumbs">
		You are here: <a href="index.jsp">Home</a> > <i>User: <%=name%></i>
		<%@ include file="loginbar.jsp"%>
	</div>
	<div id="container">
		<h2 class="center"><%=name%></h2>
		<p>
			<b>Email:</b>
			<%=CONTROLLER.GETEMAIL(id)%></p>
		<p>
			<b>DOB:</b>
			<%=CONTROLLER.GETDOB(id)%></p>
		<!--End main container tag below.-->
		<br />
		<%
			}
		%>
	</div>

</body>
</html>