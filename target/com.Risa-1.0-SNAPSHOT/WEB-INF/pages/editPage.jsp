<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 07.07.2019
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty book.name}">
        <title>Add</title>
    </c:if>
    <c:if test="${!empty book.name}">
        <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty book.name}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty book.name}">
    <c:url value="/editPage" var="var"/>
</c:if>
<form action="${var}" method="POST">
    <c:if test="${!empty book.name}">
        <input type="hidden" name="id" value="${book.id}">
    </c:if>
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <label for="countPage">CountPage</label>
    <input type="text" name="countPage" id="countPage">
    <label for="year">Year</label>
    <input type="text" name="year" id="year">

    <c:if test="${empty book.name}">
        <input type="submit" value="Add new film">
    </c:if>
    <c:if test="${!empty book.name}">
        <input type="submit" value="Edit film">
    </c:if>
</form>
</body>
</html>
