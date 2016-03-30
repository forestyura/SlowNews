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
            <form action="registration" method="put">
            Username
            <input type="text" name="username">
            <br>
            E-mail
            <input type="text" name="e-mail">
            <br>
            Password
            <input type="text"name="password">
            Confirm password
            <input type="text" name="confirm-password">

            <p><button>Accept</button></p>
            </form>
        </div>
    </div>
</div>
<%@include file="Footer.jsp"%>
</body>
</html>
