<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Data</title>
</head>
<body>
<table border="1">
<thead>
<tr>
<th>Book Id</th>
<th>Book Name</th>
<th>Book Price</th>
</tr>
</thead>
<tbody>
<c:forEach items="${books}" var="book">
<tr>
<td>${book.bookId}</td>
<td>${book.bookName}</td>
<td>${book.bookPrice}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>