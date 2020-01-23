<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous"> -->
  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
<title>Home Page</title>
</head>
<body>
   <div class="container text-center">
     <h1>Welcome to E-Store</h1>
     <p> Browse all Products here</p>
   </div>  
   
<nav class="navbar navbar-inverse">
  <div class="container-fluid">  
     <a class="navbar-brand" href="#">Logo</a> 
      <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#myNavbar" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
     </button> 	
      
      <div class="collapse navbar-collapse" id="myNavbar">
         <ul class="nav navbar-nav mr-auto">
            <li class="active">
               <a class="nav-link" href="#">Home<span class="sr-only">(current)</span></a></li> 
            <li><a class="nav-link" href="/products/all">Products</a></li>
            <li><a class="nav-link" href="#">Deals</a></li>
            <li><a class="nav-link" href="#">Stores</a></li>
            <li><a class="nav-link" href="#">Contact Us</a></li>
         </ul>
        <ul class="nav navbar-nav navbar-right">
           <li><a class="nav-link" href="/user/login"><span class="glyphicon glyphicon-user"></span>Your Account </a></li>
           <li><a class="nav-link" href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart </a></li>         
        </ul> 
      </div>
   </div>   

</nav>      

   
<!--  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script> -->
<!--  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script> -->
<!--  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script> -->
<!--  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> --> 
</body>

</html>