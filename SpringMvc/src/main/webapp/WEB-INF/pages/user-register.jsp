<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- CSS only -->
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

<div class ="container">

<div class="card" style="width: 18rem;">
  <div class="card-header">
    user register
  </div>
 <form:form action= "${pageContext.request.contextPath}/users/userRegistration" method="post" modelAttribute = "UserObj">
 	<div class="form-group">
 		<label for="firstName">First Name</label>
 		<form:input path = "firstName" cssClass = "form-control"/>
 	</div>
 	
 	 	<div class="form-group">
 		<label for="lastName">Last Name</label>
 		<form:input path = "lastName" cssClass = "form-control"/>
 	</div>
 	
 	 	 	<div class="form-group">
 		<label for="email">Email</label>
 		<form:input path = "email" cssClass = "form-control"/>
 	</div>
 	
 	 	 	<div class="form-group">
 		<label for="username">User Name</label>
 		<form:input path = "username" cssClass = "form-control"/>
 	</div>
 	
 	 	 	 	<div class="form-group">
 		<label for="password"> password</label>
 		<form:input path = "password" cssClass = "form-control"/>
 	</div>
 	
 	 	 	 	 	<div class="form-group">
 		<form:button cssClass="btn btn-success">Submit</form:button>
 	</div>
 </form:form>
</div>
 
 
 
 <!-- JavaScript Bundle with Popper -->
    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
        </div>
</body>
</html>