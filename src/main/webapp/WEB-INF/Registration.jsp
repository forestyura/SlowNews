<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp"%>
    <div class="content">
        <div class="registration">
            <h1>Sign up</h1>
            <form action="/view/registration" method="post">
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

            <p><button id="registration-button">Accept</button></p>
            </form>
        </div>
    </div>
