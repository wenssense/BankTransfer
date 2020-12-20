<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<h2>Card List...</h2>

	<div class="panel-body">
		<table class="table table-striped table-bordered">
			<tr>
				<th>Customer ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Valid UPTO</th>
				<th>CVV</th>
				<th>Card Number</th>
				<th>Type</th>
			</tr>

			<c:forEach var="tempCard" items="${cards}">

				<tr>
					<td>${tempCard.id}</td>
					<td>${tempCard.firstname}</td>
					<td>${tempCard.lastname}</td>
					<td>${tempCard.expDate}</td>
					<td>${tempCard.cvv}</td>
					<td>${tempCard.cardNo}</td>
					<td>${tempCard.type}</td>
				</tr>


			</c:forEach>

		</table>
	</div>
</body>
</html>