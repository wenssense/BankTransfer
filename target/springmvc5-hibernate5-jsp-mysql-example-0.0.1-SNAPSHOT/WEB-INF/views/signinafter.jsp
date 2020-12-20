<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<hr>
	<div align="center">
		<div style="width: 400px;">
			<div style="float: left; width: 130px">
				<form action="login">													
					<input type="submit" value="Existing Customer" class="btn btn-primary">
				</form>
			</div>

			<div style="float: right; width: 225px">
				<form action="accountcreation" method="post">												
					<input type="submit" value="New Customer" class="btn btn-primary">
				</form>
			</div><br><br><br>
			
		</div>
	</div>
</body>
</html>