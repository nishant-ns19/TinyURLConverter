<%--
  Created by IntelliJ IDEA.
  User: nishant
  Date: 10/05/20
  Time: 12:06 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Web App</title>
</head>
<body>
<h1 align="center">WEB APP</h1>

<p>
<form action="UrlToTinyServlet" method="post">
  <strong>URL: </strong>
  <input type="text" name="url"/>
  <input type="submit" value="submit">
</form>
</p>
<p>
<form action="TinyToUrlServlet" method="get">
  <strong>Tiny URL: </strong>
  <input type="text" name="tiny"/>
  <input type="submit" value="submit">
</form>
</p>
<p>
<form action="DisplayAllServlet" method="get">
  <strong>To view the database click here-></strong>
  <input type="submit" value="View All">
</form>
</p>
</body>
</html>

