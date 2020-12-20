<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>


<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>

	<form action="sign" method="post">
		<div class="container">
			<div class="row">

				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>


				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">SignUp</h1>
						<br>

						<div class="form-group">
							<label for="firstName" class="control-label">First Name</label> <input
								type="text" class="form-control" name="firstname"
								placeholder="first name">
						</div>

						<div class="form-group">
							<label for="lastName" class="control-label">Last Name</label> <input
								type="text" class="form-control" name="lastname"
								placeholder="last name">
						</div>

						<div class=" form-group">
							<label for="email" class="control-label">Email</label> <input
								type="email" class="form-control" name="email"
								placeholder="email">
						</div>

						<div class="form-group">
							<label for="password" class="control-label">Password</label> <input
								type="password" class="form-control" name="password"
								placeholder="password">
						</div>
						
						<button onclick="myFunction()">Sign Up</button>
						<script>
							function myFunction(){
								
								alert("Your Sign Up is successfull. you can Sign in now.");
							}
						</script>
						
					</div>
				</div>
			</div>
		</div>


	</form>

</body>
</html>