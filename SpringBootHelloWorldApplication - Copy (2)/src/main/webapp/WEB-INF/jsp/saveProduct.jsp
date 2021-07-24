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
   <c:if test="${addProductSuccess}">
            <div>Successfully added/update Product. </div>
        </c:if>
    	 <c:choose>
	 		<c:when test="${edit}">
	 		 <c:url var="new_url" value="/Product/new"/>
	 		</c:when>
	 		 <c:otherwise>
	 		 	 <c:url var="new_url" value="/Product/edit-{id}"/>
	 		  </c:otherwise>
 		</c:choose>
        <form:form action="${new_url}" method="post" modelAttribute="product">
        <form:label path="id">Product id: </form:label> <form:input type="text" path="id"   disabled="true"/></br>
        	<form:label path="Productname">Product name: </form:label> <form:input type="text" path="Productname"/></br>
        	<form:label path="price">Product price: </form:label> <form:input type="number" path="price"/></br>
        	<form:label path="ProductCategory">Product Category: </form:label> 
        	<form:select type="number" path="ProductCategory" items="${ProductCategory}"  itemValue="id" itemLabel="name" class="form-control input-sm" />
 		  <c:choose>
	 		<c:when test="${edit}">
	 			<input type="submit" value="Update"/>
	 		</c:when>
	 		 <c:otherwise>
	 		 	<input type="submit"  value="New"/>
	 		  </c:otherwise>
 		</c:choose>
        </form:form>
</div>
<%@ include file="Footer.html" %>
</body>
</html>