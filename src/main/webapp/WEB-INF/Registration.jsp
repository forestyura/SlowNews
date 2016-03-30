<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
    <link rel=stylesheet type="text/css" href="style.css">
</head>
<body>
<div class="page">
    <%@include file="Header.jsp"%>
    <div class="content">
        <div class="registration">
            <h1>Registration</h1>
            Username
            <input id="username" type="text">
            <br>
            E-mail
            <input id="e-mail" type="text">
            <br>
            Password
            <input id="password" type="password" >
            Confirm password
            <input id="confirm-password" type="password" >

            <p><button>Accept</button></p>
        </div>
    </div>
</div>
<%@include file="Footer.jsp"%>
</body>
</html>
