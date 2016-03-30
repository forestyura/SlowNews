<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News Page</title>
    <link rel=stylesheet type="text/css" href="style.css">
</head>
<body>
<div class="page">
    <%@include file="Header.jsp"%>
    <div class="content">
       <c:forEach items="${News}" var="news">
            <div class="news">
                <form name="news" method="post">
                <h1 name="name">${news.name}</h1>
                <img name="img" src="${news.image}">
                <p name="data">
                    ${news.data}
                </p>
                <button>Add to archive</button>
                </form>
                <hr>
            </div>
        </c:forEach>

    </div>

</div>
<%@include file="Footer.jsp"%>
</body>
</html>
