<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
welcome ${cname} to the library management system

<table border="1">
    <thead>
    <th>ISBN</th>
    <th>Book Name</th>
    <th>Category</th>
    <th>Publication Date</th>
    <th>Quantity</th>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td> <c:out value="${book.ISBN}"/></td>
            <td><c:out value="${book.BookName}"/></td>
            <td><c:out value="${book.Category}"/></td>
            <td><c:out value="${book.PublicationDate}"/></td>
            <td><c:out value="${book.Quantity}"/></td>
        </tr>
    </c:forEach>

    </tr>
    </tbody>
</table>
</body>
</html>