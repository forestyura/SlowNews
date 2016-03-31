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

                <h1>${news.name}</h1>
                <img src="${news.image}">
                <p>
                    ${news.data}
                </p>
                <c:if test="${LoginUsers!=null}">
                    <form name="news" method="post">
                        <input type="hidden" name="name" value="${news.name}">
                        <input type="hidden" name="data" value="${news.data}">
                        <input type="hidden" name="image" value="${news.image}">
                    <button>Add to archive</button>
                    </form>
                </c:if>
                <hr>
            </div>
        </c:forEach>

    </div>

</div>
<%@include file="Footer.jsp"%>
</body>
</html>
