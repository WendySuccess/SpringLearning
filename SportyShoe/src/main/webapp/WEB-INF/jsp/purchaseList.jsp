<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script>
function myFunction() {
  // Declare variables
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[3];
    if (td) {
      txtValue = td.textContent || td.innerText;
    //  if (txtValue.toUpperCase().indexOf(filter) > -1) {
    if (txtValue.toUpperCase()=== filter ||filter ==="") {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }

}
  
function myFunction2() {
	  // Declare variables
	  debugger
	  var input, filter, table, tr, td, i, txtValue,dateTo,dateTo;
	  dateTo = document.getElementById("mydateTo");
	  dateFrom = document.getElementById("mydateFrom");
	  //filter = input.value.toUpperCase();
	   dateTo =dateTo.value;
	   dateFrom =dateFrom.value;
	  table = document.getElementById("myTable");
	  tr = table.getElementsByTagName("tr");
	  debugger
	  // Loop through all table rows, and hide those who don't match the search query
	  for (i = 0; i < tr.length; i++) {
	    td = tr[i].getElementsByTagName("td")[1];
	    if (td) {
	      txtValue = td.textContent || td.innerText;
	    //  if (txtValue.toUpperCase().indexOf(filter) > -1) {
	    	 debugger
	    if (txtValue> dateFrom && txtValue<dateTo) {
	        tr[i].style.display = "";
	      } else {
	        tr[i].style.display = "none";
	      }
	    }
	  }

	}
</script>
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

   <input type="date" id="mydateFrom" onchange="myFunction2()" placeholder="From Date">
    <input type="date" id="mydateTo" onchange="myFunction2()" placeholder="To Date">                      
 <input type="text" id="myInput" onkeyup="myFunction()" placeholder="by Product Category">
  <table class="table" id="myTable">
           <thead>
                <tr>
                    <th>Purchase Id</th>
                    <th>DateIssued</th>
       				<th>product name</th>
       				<th>product Category</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${purchase}" var="purchase">
                    <tr>
                        <td>${purchase.id}</td>
                        <td>${purchase.dateIssued}</td>    
                        <td>${purchase.products.iterator().next().productname}</td> 
                        <td>${purchase.products.iterator().next().productCategory.iterator().next().name}</td>  
                    </tr>
                </c:forEach>
            </tbody>
        </table>
</div>
<%@ include file="Footer.html" %>
</body>
</html>