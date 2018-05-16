<!DOCTYPE html>

<html lang="en" xmlns:c="http://java.sun.com/xml/ns/javaee">
<head>
    <title>youWhat</title>
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

    <input id="regPlate" name="regPlate" type="text" style="text-line-through-color:eblack" value="Batty"
           onblur="if (this.value == '') {this.value = 'Batty';}"
           onfocus="if (this.value == 'Batty') {this.value = '';}"/>
    <button type="button" onclick="changeText(regPlate.value)">Submit</button>
</div>
<!-- /.container -->

<script type="text/javascript"
        src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</body>

</html>
