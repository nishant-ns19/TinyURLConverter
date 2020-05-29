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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        h1{
            font-family: "Corsiva Hebrew";
        }
        h2{
            font-family: "Corsiva Hebrew";
            margin-bottom: 0px;
        }
        div input[type=submit]{
            border-radius: 4px;
            border: black inset;
        }
        body{
            width: available;
        }
        div{
            text-align: center;
        }
        .bg{
            background: black;
            border: 2px inset steelblue;
            color: white;
        }
        table,th,td{
            margin-left: auto;
            margin-right: auto;
            text-align: center;
            border-collapse: separate;
            border: 2px solid red;
            font-family: "Andale Mono";
            font-size: large;
        }
        td,th{
            padding: 4px;
        }
        th{
            font-family: "Corsiva Hebrew";
            color: blue;
            background: whitesmoke;
        }
        tr:hover {
            background-color:#f5f5f5;
        }
    </style>
</head>
<div class="jumbotron jumbotron-fluid bg">
    <h1 class="display-4">RESULTS</h1>
</div>

<table>
    <tr>
        <th>URL</th>
        <th>TINY URL</th>
    </tr>
    <%Iterator itr;%>
    <% List data= (List)request.getAttribute("result");
        for (itr=data.iterator(); itr.hasNext(); )
        {
    %>
    <tr>
        <%URLs obj=(URLs) itr.next();%>
        <td><%=obj.getUrl()%></td>
        <td><%=obj.getId()%></td>
    </tr>
    <%}%>
</table>
<div class="bg" style="margin-bottom: 0;position: fixed;bottom: 0;width: 100%;height: 100px">
    <form action="index.jsp" method="get" style="position: absolute;top: 22px;width: 100%;margin-bottom: 0">
        <input type="submit" value="HOME" class="btn btn-success btn-lg" style="width: 100%">
    </form>
</div>
</body>
</html>
