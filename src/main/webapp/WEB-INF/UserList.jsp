<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List Page</title>
    <link rel=stylesheet type="text/css" href="style.css">
</head>
<body>
<div class="page">
    <%@include file="Header.jsp"%>
    <div class="content">
        <c:forEach items="${Users}" var="user">
           <p>
               Username: <b>${user.username}</b>
               E-mail: <b>${user.email}</b>
               Password: <b>${user.password}</b>
           </p>
        </c:forEach>
    </div>
</div>
<%@include file="Footer.jsp"%>
</body>
</html>
