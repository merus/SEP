<%@ include file="header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<%
	String error = (String) session.getAttribute("login");
%>
</head>
<body>
	<div id="breadcrumbs">
		You are here: <a href="index.jsp">Home</a> > <i>Register</i>
	</div>
	<div id="auth-container">
		<br />
		<h1 id="title">Register new account</h1>
		<form action="registeraction.jsp" method="POST">
			<table align="center">
				<tbody>
					<tr>
						<td>Email</td>
						<td><input type="email" name="id"></td>
					</tr>
				
										<tr>
						<td>First Name</td>
						<td><input type="text" name="firstname"></td>
					</tr>
						<tr>
						<td>Last Name</td>
						<td><input type="text" name="lastname"></td>
					</tr>
						<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
										<tr>
						<td>Password Confirmation</td>
						<td><input type="password" name="passwordconfirmation"></td>
					</tr>
					<tr>
						<td></td>
						<td><input class="submit" type="submit" value="Register"></td>
					</tr>
					<tr>
						<td colspan="2" class="error">
							<%
								if(error != null)
								{
									out.print(error);
									session.removeAttribute("register");
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