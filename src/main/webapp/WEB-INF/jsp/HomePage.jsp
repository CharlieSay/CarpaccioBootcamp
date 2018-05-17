<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>Carpaccio</title>
    <%--<script type="text/javascript" src="/js/getText.js"></script>--%>
    <link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
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
            <li class="active"><a href="#">Home</a></li>
            <li><a href="/productcatalogue">Product Page</a></li>
            <li><a href="/orderform">Order Form</a></li>
		</ul>
	</div>
	</div>
	</nav>

	<div class="container">
		<h1>CARPACCIO</h1>
		<h2>Contact</h2>
		<h3>Email : James@Carpaccio.com</h3>
		<h3>Telephone : 0161 669 9888</h3>
		<h2>Address</h2>
		<h3>Carpaccio plc<br>1 Tony Wilson Place<br>Manchester<br>M15 4FN</h3>
	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</body>

</html>
