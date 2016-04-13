<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp"%>
<div class="content" >
        <div class="login">
            <h1>Sign in</h1>
            <form name="/login" method="post">
            Username
            <input type="text" name="username">
            Password
            <input type="password" name="password">
            <p><button id="login-button">Log in</button></p>
            </form>
        </div>
</div>
