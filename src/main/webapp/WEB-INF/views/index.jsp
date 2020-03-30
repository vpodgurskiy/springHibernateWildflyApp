<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>People Manager</title>
</head>
<body>
<div align="center">
    <h2>People Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" />
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/new">New People</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Last name</th>
            <th>Age</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${listPeople}" var="people">
            <tr>
                <td>${people.id}</td>
                <td>${people.name}</td>
                <td>${people.lastName}</td>
                <td>${people.age}</td>
                <td>${people.address}</td>
                <td>
                    <a href="/edit?id=${people.id}">Edit</a>

                    <a href="/delete?id=${people.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>