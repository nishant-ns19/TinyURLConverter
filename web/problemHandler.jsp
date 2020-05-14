<%--
  Created by IntelliJ IDEA.
  User: nishant
  Date: 12/05/20
  Time: 2:27 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error and Exception Handling</title>
</head>
<body>
<%
    Integer statusCode=(Integer)request.getAttribute("code");
    String message=(String)request.getAttribute("message");
    if(statusCode==500){
%>
        <h2><strong>Exception Details</strong></h2>
        <strong>Message: </strong><%=message%>
<%  }
    else{ %>

        <h2>Error Details</h2>
        <strong>Status Code: </strong> <%=statusCode%>
        <br/>
        <strong>Requested page not available</strong>
<%}
%>
<br/>
<a href="index.jsp">Home</a>

</body>
</html>
