<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	
	<h3>Money Transfer History here....</h3>
	<table class="table table-striped table-bordered">
		<tr>
			<th>Beneficiaty</th>
			<th>AccountNo</th>
			<th>Amount</th>
			<th>Transaction Date</th>
		</tr>

		<!-- loop over and print each row in table -->
		<c:forEach var="list" items="${listMoney}">
			<tr>
				<td>${list.toUserName}</td>
				<td>${list.toAccNo}</td>
				<td>${list.transferAmount}</td>
				<td>${list.transactionDate}</td>
			</tr>
		</c:forEach>
	</table>
	<h3>Mobile Recharge History here....</h3>
	<table class="table table-striped table-bordered">
		<tr>
			<th>Number</th>
			<th>Amount</th>
			<th>Time</th>
		</tr>

		<!-- loop over and print each row in table -->
		<c:forEach var="temp" items="${rech}">
			<tr>
				<td>${temp.mobile}</td>
				<td>${temp.amount}</td>
				<td>${temp.transactionDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
