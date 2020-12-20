<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Dashboard</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>


	<h2>Welcome to World Bank!</h2>
	
	<div align="right">
		<div style="float: right; width: 130px">
			<form action="logout" method="post">
				<input type="submit" value="Logout" class="btn btn-primary">
			</form>
		</div>
		<div style="float: right; width: 225px">
			<form action="contactus">
				<input type="submit" value="Contact Us" class="btn btn-primary">
			</form>
		</div>
	</div>

	<br />
	<hr>
	Account balance is : ${bal}
	<div style="display: flex; justify-content: center;">
		<%-- <form action="showForm">
			<input type="submit" value="Add Beneficiary" class="btn btn-primary">
		</form> --%>
		<form action="listContact">
			<input type="submit" value="Contacts" class="btn btn-primary">
		</form>
		<form action="listManage">
			<input type="submit" value="Manage Beneficiary"
				class="btn btn-primary">
		</form>
		<br /> <br /> <br />

		<form action="apply">
			<input type="submit" value="Apply New Card" class="btn btn-primary">
		</form>
		<form action="existingCard">
			<input type="submit" value="Existing Card" class="btn btn-primary">
		</form>
		<form action="loan">
			<!--     ---------------------------------------------- -->
			<input type="submit" value="loans" class="btn btn-primary">
		</form>

		<form action="bills">
			<!--     ---------------------------------------------- -->
			<input type="submit" value="Bills" class="btn btn-primary">
		</form>
		<form action="history">
			<!--     ---------------------------------------------- -->
			<input type="submit" value="History" class="btn btn-primary">
		</form>
	</div>
</body>
</html>
