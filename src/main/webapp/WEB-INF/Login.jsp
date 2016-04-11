<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title id="page-title">Login Page</title>
    <link rel=stylesheet type="text/css" href="style.css">
</head>
<body>
<div class="page">
    <%@include file="Header.jsp"%>


    <div class="content">
        <div class="login">
            <h1>Sign in</h1>
            <form name="login" method="post">
            Username
            <input type="text" name="username">
            Password
            <input type="password" name="password">
            <p><button >Log in</button></p>
            </form>
        </div>
    </div>
</div>
<%@include file="Footer.jsp"%>
</body>
</html>
