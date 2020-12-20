<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>


<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>



	<form action="accCrtd" method="post">
		<div class="container">
			<div class="row">

				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>


				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">Create Account</h1>
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

						<div class="form-group">
							<label for="adhaarNo" class="control-label">Adhaar Number</label>
							<input type="text" class="form-control" name="aadhar"
								placeholder="Adhaar">
						</div>

						<div class="form-group">
							<label for="pan" class="control-label">PAN Number</label> <input
								type="text" class="form-control" name="pan" placeholder="PAN">
						</div>

						<div class=" form-group">
							<label for="mobile" class="control-label">Mobile Number</label> <input
								type="text" class="form-control" name="mobile"
								placeholder="Mobile Number">
						</div>
						
						
						<button onclick="myFunction()">Create Account</button>
						<script>
							function myFunction(){
								
								alert("Your Account creation is successful. you can login now.");
							}
						</script>

					</div>
				</div>
			</div>
		</div>


	</form>

</body>
</html>