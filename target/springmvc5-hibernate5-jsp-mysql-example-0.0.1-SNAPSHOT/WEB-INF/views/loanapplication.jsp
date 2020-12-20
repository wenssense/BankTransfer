<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Customer</title>
</head>
<body>
	<div align="center">
		<h2>Register for Loan</h2>
		<form:form action="save" method="post">
				<label>Name:</label>
				<input type="text"  name="name" placeholder="name here">
				<br />
				
					<label>Email:</label>
					<input type="email"  name="email" placeholder="email here">
				<br>
					<label>Address:</label>
					<input type="text"  name="address" placeholder="address here">
				<br>
			   <label>Loan Amount:</label>
					<input type="text"  name="loanamount"
								placeholder="loan amount here">
				<br>
				<br>
					<button onclick="myFunction()">Apply for Loan</button>
					<script>
						function myFunction() {
							alert("Your loan request has been successful");
						}
					</script>
		</form:form>
	</div>
</body>
</html>