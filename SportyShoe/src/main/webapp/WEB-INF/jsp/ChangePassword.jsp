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
            <div>Successfully update Password. </div>
        </c:if>
    	 
	 		 <c:url var="new_url" value="/User/ChangePassword"/>
	 		
        <form:form action="${new_url}" method="post" modelAttribute="user">
      
         <form:input type="text" path="username" class="form-control" placeholder="username" ></form:input>
       		   <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
              	<input type="submit"  value="Update"/>
	
        </form:form>
</div>
<%@ include file="Footer.html" %>
</body>
</html>