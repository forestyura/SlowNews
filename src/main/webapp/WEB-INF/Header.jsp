<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="header">
    <div class="title"><a href="/" title="SlowNews" rel="home">SlowNews</a></div>
    <nav class="site-navigation">
        <li><a href="/news">News</a></li>
        <c:if test="${LoginUsers!=null}">
            <li><a href="/archive">Archive</a></li>
        </c:if>
        <li><a href="/login">Login</a></li>
        <c:if test="${LoginUsers==null}">
            <li><a href="/registration">Registration</a></li>
        </c:if>
    </nav>
</div>
<div class="weather-on-header">
    ${Weather}
</div>
<div class="hello-message">
    Hello,
    <c:if test="${LoginUsers!=null}">
        ${LoginUsers}!
        <form  class="logout-form" action="logout" method="post">
            <button class="logout-button">Log out</button>
        </form>
    </c:if>

    <c:if test="${LoginUsers==null}">
        guest!
    </c:if>
</div>
