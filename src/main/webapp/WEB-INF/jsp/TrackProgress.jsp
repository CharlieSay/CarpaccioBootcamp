<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>Carpaccio</title>
    <%--<script type="text/javascript" src="/js/getText.js"></script>--%>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
    <script type="text/javascript" src="/js/StatusPage.js"></script>
    <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
    <c:url value="/css/HomePage.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body onload="formLoad()">
<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Spring Boot</a>
        </div>
        <div class="collapse navbar-collapse" id="navbar">
            <ul class="nav navbar-nav">
                <li>
                    <a href="/">Home</a>
                </li>
                <li>
                    <a href="/productcatalogue">Product Page</a>
                </li>
                <li>
                    <a href="/orderform">Order Form</a>
                </li>
                <li class="active">
                    <a href="#">Track Progress</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <h1 align="center" class="display-2">Track Progress</h1>
    <label for="orderId">Order ID :</label>
    <input type="text" class="form-control" id="orderId">
    <button type="button" class="btn btn-success" onclick="showForm()">Success</button>
    <div id="userSection">
        <h3>First Name : ${firstName}</h3>
        <h3>Second Name : ${secondName}</h3>
        <h3>Phone Number : ${phoneNumber}</h3>
        <h3>Email Address : ${emailAddress}</h3>
        <h3>Order Progress : ${orderProgress}</h3>
    </div>
</div><!-- /.container -->
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>