<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.07.2019
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Authors</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
    <c:forEach var="author" items="${authorsList}">
    <tr>
        <td>${author.id}</td>
        <td>${author.fullName}</td>
    <td>
            <a href="/editPage/${author.id}">edit</a>
            <a href="/delete/${author.id}">delete</a>
        </td>
    </tr>
    </c:forEach>
<h2><a href="/">Назад</a> </h2>
</body>
</html>
