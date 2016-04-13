<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Header.jsp"%>
    <div class="content" >
       <c:forEach items="${News}" var="news">
            <div class="news">

                <h1>${news.title}</h1>
                <img src="${news.image}">
                <p>
                    ${news.description}
                </p>
                <div class="news-date">
                    ${news.pubDate}
                </div>
                <c:if test="${LoginUsers!=null}">
                    <form id="news-form" name="news" method="post">
                        <input type="hidden" id="title" name="title" value="${news.title}">
                        <input type="hidden" name="description" value="${news.description}">
                        <input type="hidden" name="image" value="${news.image}">
                        <input type="hidden" name="pubDate" value="${news.pubDate}">
                    <button id="add-to-archive">Add to archive</button>
                    </form>
                </c:if>
                <hr>
            </div>
        </c:forEach>

    </div>
