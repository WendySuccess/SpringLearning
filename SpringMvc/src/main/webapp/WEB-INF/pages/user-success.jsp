<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
    crossorigin="anonymous">
</head>
<body>
<div class ="container">

<div class="card" style="width: 18rem;">
  <div class="card-header">
    user details
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item">Hello , ${user.firstName} </li>
    <li class="list-group-item">Your email id :  ${user.email} </li>
  </ul>
</div>

 <!-- JavaScript Bundle with Popper -->
    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
        </div>
       
</body>
</html>