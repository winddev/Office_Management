<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

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

  <title>Books Page</title>


</head>
<body>

<!-- Fixed navbar -->
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <span class="active_logo navbar-brand">Office Management</span>
    </div>
    <div class="collapse navbar-collapse navbar-right" id="navbar-collapse">
      <ul class="nav navbar-nav">
        <li><a href="<c:url value="/"/>">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </div><!--/.nav-collapse -->
  </div>
</div>


<div class="jumbotron" style="padding-bottom: 120px">
  <div class="container">
    <h1>Office List</h1>
    <div class="layer1">
      <c:if test="${!empty listOffice}">
        <table class="table table-striped table-bordered">
          <thead>
          <tr>
            <th>ID</th>
            <th>Name of company</th>
            <th>Adress of company</th>
            <th>Number of emloyers</th>
            <th>Edit</th>
            <th>Delete</th>
          </tr>
          </thead>

          <c:forEach items="${listOffice}" var="office">
            <tr>
              <td>${office.id}</td>
              <td><a href="/officedata/${office.id}">${office.companyName}</a></td>
              <td>${office.compamyAdress}</td>
              <td>${office.numbersOfEmployers}</td>
              <td><a href="<c:url value='/edit/${office.id}'/>">Edit</a></td>
              <td><a href="<c:url value='/remove/${office.id}'/>">Delete</a></td>
            </tr>
          </c:forEach>
        </table>
      </c:if>

      <div class="layer1">
        <br>
        <c:url var="addAction" value="/offices/add"/>
        <form:form action="${addAction}" commandName="office">
          <h3>Add company</h3>
          <table class="table table-bordered">
            <c:if test="${!empty office.companyName}">
              <tr>
                <td>
                  <form:label path="id">
                    <spring:message text="ID"/>
                  </form:label>
                </td>
                <td>
                  <form:input path="id" readonly="true" size="8" disabled="true"/>
                  <form:hidden path="id"/>
                </td>
              </tr>
            </c:if>
            <tr>
              <td>
                <form:label path="companyName">
                  <spring:message text="Name of company"/>
                </form:label>
              </td>
              <td>
                <form:input path="companyName"/>
              </td>
            </tr>
            <tr>
              <td>
                <form:label path="compamyAdress">
                  <spring:message text="Adress of company"/>
                </form:label>
              </td>
              <td>
                <form:input path="compamyAdress"/>
              </td>
            </tr>
            <tr>
              <td>
                <form:label path="numbersOfEmployers">
                  <spring:message text="Number of emloyers"/>
                </form:label>
              </td>
              <td>
                <form:input path="numbersOfEmployers"/>
              </td>
            </tr>
            <tr>
              <td colspan="2">
                <c:if test="${!empty office.companyName}">
                  <input type="submit"
                         value="<spring:message text="Edit Office"/>"/>
                </c:if>

                <c:if test="${empty office.compamyAdress}">
                  <p class="btn" role="button" href="/offices">
                    <input type="submit"
                           value="<spring:message text="Add Office"/>"/> </p>
                </c:if>

              </td>
            </tr>
          </table>
        </form:form>
      </div>
    </div>
  </div>
  </div>






</body>
</html>
