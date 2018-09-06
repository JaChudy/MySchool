<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 05.09.18
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wszyscy użytkownicy</title>
</head>
<body>
    <table>
        <tr>
            <th>Imię</th>
            <th>Nazwisko</th>
            <th>Email</th>
            <th>Login</th>
            <th>Typ</th>
            <th>Akcja</th>
        </tr>

            <c:forEach items="${allUser}" var="user">
                <tr>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td>${user.login}</td>
                    <td>${user.type}</td>
                    <td><a href="/user/edit/${user.id}">
                        <input type="submit" value="Edit"/>
                    </a>
                        <a href="/user/delete/${user.id}">
                            <input type="submit" value="Usuń"/>
                        </a></td>
                </tr>
            </c:forEach>

    </table>
</body>
</html>
