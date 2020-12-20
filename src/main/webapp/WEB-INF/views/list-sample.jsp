<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list-sample</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Beneficiary Details added successfully.</h2>
			<hr />

			<input type="button" value="Add Beneficiary"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> 
				
			<input type="button" value="Manage Beneficiary"
				onclick="window.location.href='listManage'; return false;"
				class="btn btn-primary" />
			
			<input type="button" value="Home"
				onclick="window.location.href='index'; return false;"
				class="btn btn-primary" /> <br /> <br />
			
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Beneficiary List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>Name of Beneficiary</th>
							<th>Account Number</th>
							<th>IFSC code</th>
						</tr>

						<!-- loop over and print our customers -->
						<c:forEach var="tempCustomer" items="${customers}">

							<!-- construct an "update" link with customer id -->
							<c:url var="updateLink" value="/customer/updateForm">
								<c:param name="customerId" value="${tempCustomer.id}" />
							</c:url>

							<!-- construct an "delete" link with customer id -->
							<c:url var="deleteLink" value="/customer/delete">
								<c:param name="customerId" value="${tempCustomer.id}" />
							</c:url>

							<tr>
								<td>${tempCustomer.firstName}</td>
								<td>${tempCustomer.lastName}</td>
								<td>${tempCustomer.email}</td>
							</tr>

						</c:forEach>

					</table>

				</div>
			</div>
		</div>

	</div>


</body>
</html>