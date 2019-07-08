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
    <title>Книги</title>
</head>
<body>
<h2>Books</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>countPage</th>
        <th>year</th>
    </tr>
    <c:forEach var="book" items="${booksList}">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.countPage}</td>
            <td>${book.year}</td>
            <td>
                <a href="/editPage/${book.id}">edit</a>
                <a href="/delete/${book.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<title>edit</title>


<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new book</a>
<h2><a href="/">Назад</a></h2>
</body>
</html>
