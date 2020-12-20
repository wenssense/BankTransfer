<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
  body{
        background-image: url('https://www.firstcommercebankonline.com/assets/images/NoCrop_800x800/2db7024808bb4440a28cdda7cbbdceed.jpg');
        width: 100%;
        height: 100%;
        position:absolute;
         background-size:cover;
         padding-top:55px;
        background-repeat:no-repeat;
       }
   button{
    background-color: white;
    border-radius: 5px;
    padding:10px 25px;
     }
  button:hover{
  	background-color: aqua;
  	}
    a:hover{
    color:black;
    }
   a{
    color:blue;
    text-decoration:none;
    }
  table{
  border-spacing:20px;
  } 
  td{
  padding:30px;
  }
</style>
<meta charset="ISO-8859-1">
<title>Pay Bills here</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">

<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<form action="recharge" method="post">   <!-- ////////////////////////////////////////////////////////////////////////// -->
		<div class="container">
			<div class="row">

				<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>


				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">Pay Bills</h1>
						<br>

						<div>
							<button type="submit" class="btn btn-outline-warning">Recharge Mobile</button>
						</div>

					</div>
				</div>
			</div>
		</div>
</body>
</html>