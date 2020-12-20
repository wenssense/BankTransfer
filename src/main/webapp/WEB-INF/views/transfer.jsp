<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>save Beneficiary</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h2 class="text-center">Transfer Form</h2>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Hi ${transferForm.loggedUser}</div>
				</div>
				<div class="panel-body">
					<%-- <form:form action="transAmount" commandName="transferForm" cssClass="form-horizontal"
						method="post">  --%>

					<!-- need to associate this data with customer id -->
					<div class="form-group">
						<label>Name of Beneficiary is ${transferForm.benefic}</label> 
						
					</div>
					<div class="form-group">
						<label>Your Available balance is ${transferForm.available}</label> 
						
					</div>
					
					<form:form action="transAmount" modelAttribute ="tranForm"
						method="post">
						<form:hidden path="beneficiaryId" value="${transferForm.beneficiaryId}"/>
						<form:label path="choosedAmount">Transfer Amount</form:label>
						<form:input path="choosedAmount"/>
						<form:button value="submit">Submit</form:button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>