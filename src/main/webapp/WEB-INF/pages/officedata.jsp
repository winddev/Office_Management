<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <link rel="shortcut icon" href="http://localhost:8080/favicon.ico" type="image/x-icon">

  <!-- Custom styles for this template -->
  <link href="/resources/css/bootstrap-theme.css" rel="stylesheet">

  <!-- Bootstrap core CSS -->
  <link href="/resources/css/bootstrap.css" rel="stylesheet">


  <title>Office Management</title>

</head>
<body>

<!-- Fixed navbar -->
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <span class="active_logo navbar-brand">Office Management</span>
    </div>
    <div class="collapse navbar-collapse navbar-right">
      <ul class="nav navbar-nav">
        <li><a href="<c:url value="/"/>">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </div><!--/.nav-collapse -->
  </div>
</div>

<div class="jumbotron">
  <div class="container">
    <h1>Office Details</h1>
      <table class="table">
        <thead>
        <tr>
          <th>ID</th>
          <th>Name of company</th>
          <th>Adress of company</th>
          <th>Number of emloyers</th>
        </tr>
        </thead>

        <tr>
          <td>${office.id}</td>
          <td>${office.companyName}</td>
          <td>${office.compamyAdress}</td>
          <td>${office.numbersOfEmployers}</td>
        </tr>
      </table>
  </div>

  <footer>
    <div class="navbar navbar-inverse">
      <div class="container">
        <p class="text-muted" align="center">Yevheniy(c) 2017</p>
      </div>
    </div>
  </footer>

</div>

<%--<div class="clearfix"></div>--%>



</body>
</html>


