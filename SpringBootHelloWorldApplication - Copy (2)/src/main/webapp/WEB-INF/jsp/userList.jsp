<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<%@ include file="Header.html" %>
<body>
<div style="
    padding-top: 50px;
    padding-left: 20px;
">

<form:form action="/User/search" method="post" modelAttribute="user">
<label for="search_input">Search:</label> 
  <form:input path="username" />
    </input> 	<input type="submit"  value="Search"/>
                         </form:form>
  <table class="table">
           <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
       
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
</div>
<%@ include file="Footer.html" %>
</body>
</html>