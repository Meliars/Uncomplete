<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 02.03.18
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="app">
<head>
    <link rel="stylesheet" href="web/templates/RegSheet.css" type="text/css"/>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body ng-controller="RegisterController as regControl">
<div id="RegisterPane" >
    <form action="register">
        <img class="RegPane" src="web/img/RegisterPane.png">
        <img class="LoginInput" src="web/img/input.png">
        <input class="Login" type="text" ng-model="regControl.characters.login" placeholder="Login"></br>

        <img class="NameInput" src="web/img/input.png">
        <input id="Name" class="Name" name="name" type="text" ng-model="regControl.characters.nameEmployer" placeholder="Imie"><br>

        <img class="PassInput" src="web/img/input.png">
        <input class="Password" id="password" type="password" ng-model="regControl.characters.password" placeholder="Hasło"><br>

        <input class="PassMessage" id="passMessage" disabled="disabled" type="text" ng-model="passInputMessage">
        <img class="RePassInput" src="web/img/input.png">
        <input class="RePassword" id="rePassword" type="password" ng-model="regControl.characters.rePassword" placeholder="Powtórz hasło"><br>


        <input id="Surname" class="Surname" name="surname" type="text" ng-model="regControl.characters.surnameEmployer" placeholder="Nazwisko"><br>
        <img class="SurnameInput" src="web/img/input.png">
        <label>
            <SELECT class="Project" name="project" ng-model="regControl.characters.projectEmployer" style="width: 120px;">
                <OPTION>Reklamacje</OPTION>
                <OPTION>Infolinia</OPTION>
                <OPTION>BO</OPTION>
            </SELECT>
        </label><br>
        <img class="ProjectInput" src="web/img/input.png">
        <label>
            <select class="Group" name="group" ng-model="regControl.characters.groupEmployer" style="width: 120px;">
                <option>Olsztyn</option>
                <option>Gdańsk</option>
                <option>Białystok</option>
            </select>
        </label><br>
        <img class="GroupInput" src="web/img/input.png">

        <input class="submit" type="submit" ng-click="regControl.addUser(regControl.characters)"/>
    </form>
</div>
<script type="text/javascript" src="web/templates/bower_components/angular/angular.js"></script>
<script type="text/javascript" src="web/templates/js/app.js"></script>
</body>
</html>