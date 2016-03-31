<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Archive Page</title>
    <link rel=stylesheet type="text/css" href="style.css">
</head>
<body>
<div class="page">
    <%@include file="Header.jsp"%>
    <div class="content">
        <c:forEach items="${ArchiveNews}" var="news">
            <div class="news">
                <h1>${news.name}</h1>
                <img src="${news.image}">
                <p>
                        ${news.data}
                </p>
                <hr>
            </div>
        </c:forEach>

    </div>
</div>
<%@include file="Footer.jsp"%>
</body>
</html>
