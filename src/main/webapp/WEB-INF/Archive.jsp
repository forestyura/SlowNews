<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp"%>
    <div class="content">
        <c:forEach items="${ArchiveNews}" var="news">
            <div class="news">
                <h1>${news.title}</h1>
                <img src="${news.image}">
                <p>
                        ${news.description}
                </p>
                <div class="news-date">
                        ${news.pubDate}
                </div>
                <hr>
            </div>
        </c:forEach>

    </div>
