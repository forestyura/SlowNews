<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
