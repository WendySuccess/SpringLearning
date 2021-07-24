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
<a class="btn btn-primary btn-sm" href="/Product/new" role="button">New</a>
  <table class="table">
           <thead>
                <tr>
                    <th>Id</th>
                    <th>Product Name</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${products}" var="product">
                    <tr>
                        <td>${product.id}</td>
                        <td>${product.productname}</td>
                        <td>${product.price}</td>
                   
                        <td><a href="<c:url value='/Product/edit-${product.id}' />" 
                        class="btn btn-success custom-width">edit</a></td>
                        <td><a href="<c:url value='/Product/delete-${product.id}' />" 
                        class="btn btn-danger custom-width">delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
</div>
<%@ include file="Footer.html" %>
</body>
</html>