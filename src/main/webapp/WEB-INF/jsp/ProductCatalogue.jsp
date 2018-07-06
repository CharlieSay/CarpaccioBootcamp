<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>Product Catalogue</title>
    <%--<script type="text/javascript" src="/js/getText.js"></script>--%>
    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />


    <spring:url value="/css/ProductCatalogue.css" var="springCss" />
    <link href="${springCss}" rel="stylesheet" />

    <c:url value="/css/HomePage.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Carpaccio</a>
        </div>
        <div class="collapse navbar-collapse" id="navbar">
            <ul class="nav navbar-nav">
                <li>
                    <a href="/">Home</a>
                </li>
                <li class="active">
                    <a href="#">Product Page</a>
                </li>
                <li>
                    <a href="/orderform">Order Form</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <h1 align="center">Product Catalogue</h1>
    <table align="center" class="table table-borderless">
        <thead>
        <tr>
            <th class="gold">Gold : &pound;${goldPrice}</th>
            <th class="silver">Silver : &pound;${silverPrice}</th>
            <th class="bronze">Bronze : &pound;${bronzePrice}</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td id="GoldItemList">
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">10 x 8 Prints <span class="badge badge-primary badge-pill">2</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">5 x 7 Prints <span class="badge badge-primary badge-pill">4</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Wallet Prints <span class="badge badge-primary badge-pill">4</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Keyring Prints <span class="badge badge-primary badge-pill">4</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Bookmarks <span class="badge badge-primary badge-pill">2</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Sheet Sticker Prints<span class="badge badge-primary badge-pill">1</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Fridge Magnets<span class="badge badge-primary badge-pill">2</span></li>
                </ul>
            </td>
            <td id="SilverItemList">
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">10 x 8 Prints <span class="badge badge-primary badge-pill">1</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">5 x 7 Prints <span class="badge badge-primary badge-pill">3</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Wallet Prints <span class="badge badge-primary badge-pill">4</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Keyring Prints <span class="badge badge-primary badge-pill">4</span></li>
                </ul>
            </td>
            <td id="BronzeItemList">
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">5 x 7 Prints <span class="badge badge-primary badge-pill">3</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Wallet Prints <span class="badge badge-primary badge-pill">4</span></li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Keyring Prints <span class="badge badge-primary badge-pill">4</span></li>
                </ul>
            </td>
        </tr>
        </tbody>
    </table>
</div><!-- /.container -->
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript">
</script>
</body>
</html>