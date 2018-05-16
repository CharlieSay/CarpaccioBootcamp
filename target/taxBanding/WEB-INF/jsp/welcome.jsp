<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>test</title>
    <script type="text/javascript" src="/js/getText.js"></script>
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
					<li><a href="#">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="topText">
			<h1>Message : ${message}</h1>
			<h2>Random Number : ${numberRand}</h2>
		</div>

		<form action='#' method="post">
			Reg Plate <input type="text" placeholder="Reg Plate" id="regPlate"/>
			<br>Year        <input type="text" placeholder="Year Made" id="yearRegistered"/>
			<br>Emissions <input type="text" placeHolder="Emissions" id="emissions"/>
			<br><button type="button" onclick="documentPass(document)">Submit</button>
		</form>
		<%--<input id="regPlate" name="regPlate" type="text" style="text-underline: aqua"value="Reg Plate Here"--%>
			   <%--onblur="if (this.value == '') {this.value = 'Reg Plate Here';}"--%>
			   <%--onfocus="if (this.value == 'Reg Plate Here') {this.value = '';}"/>--%>
		<%--<button type="button" onclick="documentPass(document)">Submit</button>--%>
	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</body>

</html>
