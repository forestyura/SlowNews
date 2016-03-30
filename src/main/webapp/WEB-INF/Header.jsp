<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="header">
    <div class="title"><a href="/" title="SlowNews" rel="home">SlowNews</a></div>
    <nav class="site-navigation">
        <li><a href="/news">News</a></li>
        <li><a href="/archive">Archive</a></li>
        <li><a href="/login">Login</a></li>
        <li><a href="/registration">Registration</a></li>
    </nav>
</div>

<div class="hello-message">
    Добро пожаловать,
    <c:if test="${LoginUsers!=null}">
        ${LoginUsers}
        <form  class="logout-form" action="logout" method="post">
            <button class="logout-button">Log out</button>
        </form>
    </c:if>

    <c:if test="${LoginUsers==null}">
        гость
    </c:if>
</div>
