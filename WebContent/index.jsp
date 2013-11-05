<%@ include file="header.jsp"%> 
<html>
<head>
<!-- CARLIN... FUCK YEAH! -->
	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<%
	session.setAttribute("s", "HELLO");
	String s = (String) session.getAttribute("s");
%>

</head>
<body>
	<%@ include file="navbar.jsp"%> 
	<div id="breadcrumbs">You are here: Home</div>
	<!-- Print out the short text of the articles.  With the most recently created at the top -->
	<div id="container">
	</div>
</body>
</html>