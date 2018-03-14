<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 24.12.17
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet" href="web/templates/Stylesheet.css" type="text/css"/>



    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<div class="Welcome"><h1>Welcome to user panel</h1></div>

<div class="LogPanel">
    <img src="web/img/LogPane.png">

</div>
<div class="LogInput">
    <input class="Login" type="text" placeholder="Imię i nazwisko">


</div>
<div class="LogInputPanel">
    <img src="web/img/input.png">
</div>
<div class="PassInput">

    <input class="Password" type="password" placeholder="Hasło">
</div>
<div class="PassInputPanel">
    <img src="web/img/input.png">
</div>
<div class="RegButt">
    <a href="register.jsp">Rejestracja</a>
</div>

<script src="static/angular.min.js"></script>
<script src="static/js/app.js"></script>
</body>
</html>