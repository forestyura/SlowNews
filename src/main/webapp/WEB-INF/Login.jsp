<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <link rel=stylesheet type="text/css" href="style.css">
</head>
<body>
<div class="page">
    <%@include file="Header.jsp"%>
    <div class="content">
        <div class="login">
            <h1>Log in</h1>
            Username
            <input id="username" type="text">

            Password
            <input id="password" type="password" >
            <p><button>Log in</button></p>
        </div>
    </div>
</div>
<%@include file="Footer.jsp"%>
</body>
</html>
