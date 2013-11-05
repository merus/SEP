<div id="userstatus">
	<%
		if (user == null)
		{
	%>
	<!--BEGIN Nav Bar not logged In -->
	<a href="login.jsp">Log In</a>
	<%
		}
		else
		{
	%>
	<!--BEGIN Nav Bar logged In -->
	<%=/*CONTROLLER.getName(id)*/user%>HI - <a href="forms.jsp">Forms</a>
	- <a href="logout.jsp">Log Out</a>
	<%
		}
	%>
</div>