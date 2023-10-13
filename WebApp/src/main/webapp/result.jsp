<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 13/10/2023
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1> New Book has been added!</h1>
<td>Tytuł: ${book.getTitle()}</td><br><br>
<td>Author: ${book.getAuthor()}</td><br><br>
<td>isbn: ${book.getIsbn()}</td><br><br>

</body>
</html>
