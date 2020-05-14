<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.nishant.app.URLs" %><%--
  Created by IntelliJ IDEA.
  User: nishant
  Date: 10/05/20
  Time: 6:30 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Query result</title>
</head>
<h1 align="center">RESULT</h1>
<br/>
<table align="center" border="5px">
    <tr>
        <td align="center"><strong>URL</strong></td>
        <td align="center"><strong>TINY URL</strong></td>
    </tr>
    <%Iterator itr;%>
    <% List data= (List)request.getAttribute("result");
        for (itr=data.iterator(); itr.hasNext(); )
        {
    %>
    <tr>
        <%URLs obj=(URLs) itr.next();%>
        <td><u><%=obj.getUrl()%></u></td>
        <td><u><%=obj.getId()%></u></td>
    </tr>
    <%}%>
</table>
<p align="center">
    <a href="index.jsp">Home</a>
</p>
</body>
</html>
