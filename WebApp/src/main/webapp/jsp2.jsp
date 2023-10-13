<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 13/10/2023
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MVC12</title>
</head>
<body>
<c:forEach begin="${start}" end="${end}" var="number">
  ${number}

</c:forEach>
</body>
</html>
