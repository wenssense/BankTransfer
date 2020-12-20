<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
  body{
        background-image: url('https://thumbs.dreamstime.com/b/online-shopping-internet-banking-hand-holding-payment-cards-laptop-keyboard-background-concept-unfocused-191466681.jpg');
       width:100px;
       height:900px;
        position:absolute;
         background-size:cover;
         padding-top:0px;
        background-repeat:no-repeat;
       }
   button{
    background-color: white;
    border-radius: 5px;
    padding:10px 25px;
     }
  button:hover{
  	background-color: aqua;
  	}
    a:hover{
    color:black;
    }
   a{
    color:blue;
    text-decoration:none;
    }
  table{
  border-spacing:20px;
  } 
  td{
  padding:5px;
color:white;
font-size:15px;  }
  input[type=text]{
  font-size:15px;}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<hr>
	<div align="center">
		<form action="saveNewCard" method="post" modelAttribute="card">
			<table border="0">
				<tr>
					<td><form:hidden path="id" /></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td>Mobile No. :</td>
					<td><input type="text" name="mobile"></td>
				</tr>
				<tr>
					<td>Employment Type:</td>
					<td><input type="text" name="empType"></td>
				</tr>
				<tr>
					<td>Employer Name:</td>
					<td><input type="text" name="empName"></td>
				</tr>
				<tr>
					<td>Monthly Income:</td>
					<td><input type="text" name="monthIncome"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Apply" /></td>
				</tr>
			</table>


		</form>
	</div>
</body>
</html>