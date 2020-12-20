<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here</title>

<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<form action="dashboard" method="post">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">Log In Here</h1>
						<br>

						<div class=" form-group">
							<label for="email" class="control-label">Email</label> 
							<input type="email" class="form-control" name="email"
								placeholder="email id">
						</div>

						<div class="form-group">
							<label for="password" class="control-label">Password</label> <input
								type="password" class="form-control" name="password"
								placeholder="password">
						</div>

						<div>
							<button type="submit" class="btn btn-outline-warning">Log In</button>
						</div>

					</div>
				</div>
			</div>
		</div>


	</form>

</body>
</html>