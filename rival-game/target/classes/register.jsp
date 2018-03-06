<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 02.03.18
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="web/templates/Stylesheet.css" type="text/css"/>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
<div id="RegisterPane" >
    <form action="register" method="post">
        <img class="RegPane" src="web/img/RegisterPane.png">
        <img class="NameImput" src="web/img/input.png">
        <input id="Name" class="Name" type="text" name="name" type="text" placeholder="Imie"><br>

        <input id="Surname" class="Surname" type="text" name="surname" type="text" placeholder="Nazwisko"><br>
        <img class="SurnameInput" src="web/img/input.png">
        <label>
            <SELECT class="Project" name="project" type="text" style="width: 120px;">
                <OPTION>Reklamacje</OPTION>
                <OPTION>Infolinia</OPTION>
                <OPTION>BO</OPTION>
            </SELECT>
        </label><br>
        <img class="ProjectInput" src="web/img/input.png">
        <label>
            <select class="Group" name="group" type="text" style="width: 120px;">
                <option>Olsztyn</option>
                <option>Gdańsk</option>
                <option>Białystok</option>
            </select>
        </label><br>
        <img class="GroupInput" src="web/img/input.png">

        <input class="submit" ng-click="fetch()" type="submit">
    </form>
</div>
</body>
</html>