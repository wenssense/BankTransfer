<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Beneficiary Details added successfully....</h2>
	<h4>Do you want to see the list of beneficiaries..??</h4>
	<div style="width: 400px;">
		<div style="float: left; width: 130px">
			<form:form action="home" cssClass="form-horizontal" method="get"
				modelAttribute="customer">

				<input type="submit" value="yes">

			</form:form>
		</div>
		<div style="float: right; width: 225px">
			<form:form action="no" cssClass="form-horizontal" method="get"
				modelAttribute="customer">

				<input type="submit" value="no">

			</form:form>
		</div>
	</div>

</body>
</html>