<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>Order Form</title>
    <script type="text/javascript" src="/js/OrderForm.js"></script>
    <link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />


	<spring:url value="/css/ProductCatalogue.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring Boot</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li><a href="/">Home</a></li>
			<li><a href="/productcatalogue">Product Page</a></li>
			<li class="active"><a href="#">Order Form</a></li>
		</ul>
	</div>
	</div>
	</nav>
	<div class="container" align="center">
        <h1>Order Form<br></h1>
        <form>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input id="firstName" type="text" class="form-control" name="firstName" placeholder="First Name">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                <input id="secondName" type="text" class="form-control" name="secondName" placeholder="Second Name">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                <input id="emailAddress" type="text" class="form-control" name="emailAddress" placeholder="Email Address">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                <input id="phoneNumber" type="text" class="form-control" name="phone Number" placeholder="Phone Number">
            </div>
        </form>
        <br><br>
        <table class="table table-borderless" align="center">
            <thead>
                <th class="gold">Gold</th>
                <th class="silver">Silver</th>
                <th class="bronze">Bronze</th>
            </thead>
            <tbody>
            <td><input type="text" class="form-control" /></td>
            <td><input type="text" class="form-control" /></td>
            <td><input type="text" class="form-control" /></td>
            </tbody>
        </table>
        <br><button type="button" onclick=processOrder(document)>Submit Order</button>
    </div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</body>

</html>
