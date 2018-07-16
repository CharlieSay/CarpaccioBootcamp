<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>Order Form</title>
    <script type="text/javascript" src="/js/OrderForm.js"></script>
    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />


    <spring:url value="/css/ProductCatalogue.css" var="springCss" />
    <link href="${springCss}" rel="stylesheet" />

    <c:url value="/css/HomePage.css" var="jstlCss"/>
    <link href="${jstlCss}" rel="stylesheet"/>
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
                <li class="active">
                    <a href="#">Order Form</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div align="center" class="container">
    <h1>Order Form<br></h1>
    <form>
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> <input class="form-control" id="firstName" name="firstName" placeholder="First Name" type="text">
        </div>
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> <input class="form-control" id="secondName" name="secondName" placeholder="Second Name" type="text">
        </div>
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span> <input class="form-control" id="emailAddress" name="emailAddress" placeholder="Email Address" type="text">
        </div>
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span> <input class="form-control" id="phoneNumber" name="phone Number" placeholder="Phone Number" type="text">
        </div>
    </form><br>
    <br>
    <form>
        <table align="center" class="table table-borderless">
            <thead>
            <tr>
                <th class="gold">Gold</th>
                <th class="silver">Silver</th>
                <th class="bronze">Bronze</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <div class="form-group">
                        <select class="form-control" id="goldOrder">
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                        </select>
                    </div>
                </td>
                <td>
                    <div class="form-group">
                        <select class="form-control" id="silverOrder">
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                        </select>
                    </div>
                </td>
                <td>
                    <div class="form-group">
                        <select class="form-control" id="bronzeOrder">
                            <script>
                                document.addEventListener("change", function(){
                                    $(document).ready(function(){
                                        checkContents(document)
                                    });
                                });
                            </script>
                    <option>0</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                        </select>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </form><button class="btn btn-primary" id="submit" onclick="processOrder(document)" type="button">Submit Order</button>
    <h2></h2>
    <div id="orderNumber">
        <h2></h2>
    </div>
</div><!-- /.container -->
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript">
</script>
</body>
</html>