<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html lang="en">
<head>
	<title>MPCS</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link href='http://fonts.googleapis.com/css?family=Carme' rel='stylesheet' type='text/css'>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  
	<link rel="stylesheet" type="text/css" href="mpcsstyle.css">
	
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
      <a class="navbar-brand" href="home.html">MPCS</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="#"></a></li>
        <li><a href="#"></a></li> 
        <li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>
		<li><a href="#"></a></li>		
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span></span> Login</a></li>
		<li><a href="register.html"><span class="glyphicon glyphicon-user"></span></span> Register</a></li>
      </ul>
    </div>
  </div>
</nav>

<header>
<div id="main" class="container">
    <h1>Mountain Photo Collection System</h1>      
    <p>Enter your email and password to log in MPCS.</p>
</div>

<div class="container">
  <div class="panel panel-default">
  <div class="panel-heading"><h2>Login</h2></div>
  
  <div class="panel-body">
	<form class="form-horizontal" role="form">
    
	<div class="form-group">
		<label class="control-label col-sm-2" for="email">Email:</label>
		<div class="col-sm-10">
			<input type="email" class="form-control" id="email" placeholder="Your email address">
		</div>
	</div>
	
	<div class="form-group">
		<label class="control-label col-sm-2" for="password">Password:</label>
		<div class="col-sm-10">
			<input type="password" class="form-control" id="password" placeholder="Your password">
		</div>
	</div>
	
	<button type="submit" class="btn btn-default">Login</button>
  
  </form>
  </div>
  
  </div>
</div>
</header>
</body>