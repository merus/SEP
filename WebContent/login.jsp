<%@ include file="header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<%
	String error = (String) session.getAttribute("login");
%>
</head>
<body>
	<div id="breadcrumbs">
		You are here: <a href="index.jsp">Home</a> > <i>Login</i>
	</div>
	<div id="auth-container">
		<br />
		<h1 id="title">Login</h1>
		<form action="loginaction.jsp" method="POST">
			<table align="center">
				<tbody>
					<tr>
						<td>ID</td>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td></td>
						<td><input class="submit" type="submit" value="Login"></td>
					</tr>
					<tr>
						<td colspan="2" class="error">
							<%
								if(error != null)
								{
									out.print(error);
									session.removeAttribute("login");
								}
								else
								{
									out.print("<br>");
								}
							%>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
		<br />
	</div>
</body>
</html>