<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 13/10/2023
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MVC13</title>
</head>
<body>
<h1>Add a Book</h1>

<form action="mvc13" method="post">

  <label for="name">Book Title:</label>
  <input type="text" id="name" name="bookTitle"><br><br>

  <label for="author">Author:</label>
  <input type="text" id="author" name="authorName"><br><br>

  <label for="isbn">isbn:</label>
  <input type="number" id="isbn" name="isbn" min="0" max="9999999999999" step="1">

  <input type="submit" value="Submit">

</form>

</body>
</html>
