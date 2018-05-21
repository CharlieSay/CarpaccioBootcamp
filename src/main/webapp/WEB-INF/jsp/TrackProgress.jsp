
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
<c:url value="/css/HomePage.css" var="jstlCss" />
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
            <li><a href="/orderform">Order Form</a></li>
            <li class="active"><a href="#">Track Progress</a></li>
		</ul>
	</div>
	</div>
	</nav>

	<div class="container">
        <h1 class="display-2"align="center">Track Progress</h1>
        <h3>List : ${allOrders}</h3>
	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</body>

</html>
