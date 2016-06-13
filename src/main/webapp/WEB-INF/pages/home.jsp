<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div>
    <c:choose>
        <c:when test="${name!=null}">
            <p>Hello ${name}!</p>
        </c:when>
        <c:otherwise>
            <p>Hello guest!</p>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>
