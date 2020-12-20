<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
  body{
        background-image: url('https://image.freepik.com/free-vector/bank-icon-with-circuit-background-concept_41921-12.jpg');
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
  color:white;
  } 
  td{
  padding:1px;
  }
  
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:white">You are Successfully applied for card...</h1>
   <hr />

   <table class="table table-striped table-bordered">
    <tr>
     <td><strong>First Name </strong>: ${card.firstname}</td>
    </tr>
    <tr>
     <td><strong>Last Name </strong> : ${card.lastname}</td>
    </tr>
    <tr>
     <td><strong>City </strong> : ${card.city}</td>
    </tr>
    <tr>
     <td><strong>Mobile No. </strong>: ${card.mobile}</td>
    </tr>
    <tr>
     <td><strong>Employment Type </strong>: ${card.empType}</td>
    </tr>
    <tr>
     <td><strong>Employer Name </strong>: ${card.empName}</td>
    </tr>
    <tr>
     <td><strong>Monthly Income </strong>: ${card.monthIncome}</td>
    </tr>
   </table>

<form action="existingCard">
	<input type= "submit" value="Existing Card">
</form>

</body>
</html>