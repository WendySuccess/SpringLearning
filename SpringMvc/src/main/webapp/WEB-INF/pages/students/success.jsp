<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello ${student.name}!!</h3>
	<h4>You have selected below courses: </h4>
	<c:forEach var="course" items="${student.courses}">
		<c:out value="${course}" /> <br/>
	</c:forEach>
	<h4>You have selected below batches:</h4>
	<c:forEach var="batch" items="${student.batches}">
		<c:out value="${batch}" /> <br/>
	</c:forEach>
	
</body>
</html>
