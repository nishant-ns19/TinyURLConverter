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

  </style>
</head>
<body>
<div class="jumbotron jumbotron-fluid bg">
  <h1 class="display-4">URL CONVERTER</h1>
</div>

  <form action="UrlToTinyServlet" method="post" >
    <div class="form-group" style="margin: 5px">
      <h2 style="text-align: left">URL:</h2>
      <input type="text" name="url" class="form-control"/>
    </div>
    <div style="text-align: center;">
      <input type="submit" value="Submit" class="btn btn-primary" style="margin-top: 5px">
    </div>


  </form>

<form action="TinyToUrlServlet" method="get">
  <div class="form-group" style="margin: 5px">
    <h2 style="text-align: left">TINY URL:</h2>
  <input type="text" name="tiny" class="form-control"/>
  </div>
  <div style="text-align: center;">
    <input type="submit" value="Submit" class="btn btn-primary" style="margin-top: 5px">
  </div>
</form>

<div class="bg" style="margin-bottom: 0;position: fixed;bottom: 0;width: 100%;height: 100px">
  <form action="DisplayAllServlet" method="get" style="position: absolute;top: 22px;width: 100%;margin-bottom: 0">
      <input type="submit" value="Show Complete Database" class="btn btn-success btn-lg" style="width: 100%">
  </form>
</div>

</body>
</html>

