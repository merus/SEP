		<%
			if (s != null) {
		%>
			<!--BEGIN Nav Bar not logged In -->
			<div id="nav">
			<div id="userstatus">
				<a href="login.jsp">Log In</a>
			</div>

		<%
			} else {
		%>
			<!--BEGIN Nav Bar logged In -->
			<div id="nav">
			<div id="userstatus"><%=s %> - 
				<a href="createarticle.jsp">New Article</a> - 
				<a href="author.jsp?author=<%=s%>">Author Profile</a> - 
				<a href="logout.jsp">Log Out</a>
			</div>
		<%
			}
		%>
			<div id="title"><a href="index.jsp">SEP Enrollment System</a></div>
			<a href="category.jsp?cat=news">News</a> | 
			<a href="category.jsp?cat=sports">Sports</a> | 
			<a href="category.jsp?cat=business">Business</a> | 
			<a href="category.jsp?cat=politics">Politics</a> | 
			<a href="category.jsp?cat=technology">Technology</a> | 
			<a href="category.jsp?cat=travel">Travel</a>
			</div>
			<br/>
 			<!--END Navigation Bar-->