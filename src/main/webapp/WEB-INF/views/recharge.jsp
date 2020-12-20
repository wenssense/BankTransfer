<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>


<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>

	<form action="rechargedone" method="post">
		<!-- ////////////////////////////////////////////////////////////////////////// -->
		<div class="container">
			<div class="row">

				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>


				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">Recharge Mobile</h1>
						<br>

						<div class=" form-group">
							<label for="mobile" class="control-label">Mobile Number</label> <input
								type="text" class="form-control" name="mobile"
								placeholder="mobile number">
						</div>

						<div class="form-group">
							<label for="amount" class="control-label">Amount For Recharge</label> <input
								type="text" class="form-control" name="amount"
								placeholder="amount">
						</div>
						
						<button onclick="myFunction()" class="btn btn-outline-warning">Recharge</button>
						<script>
							function myFunction() {
								alert("Your recharge done successfully.");
							}
						</script>

					</div>
				</div>
			</div>
		</div>


	</form>

</body>
</html>