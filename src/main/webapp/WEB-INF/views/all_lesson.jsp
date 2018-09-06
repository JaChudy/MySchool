<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 06.09.18
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lekcje</title>
</head>
<body>
<table>
    <tr>
        <th>Dzień</th>
        <th>Od</th>
        <th>Do</th>
        <th>Uczniowie</th>

    </tr>

    <c:forEach items="${allLesson}" var="lesson">
        <tr>
            <td>${lesson.lessonDay}</td>
            <td>${lesson.hourStart}</td>
            <td>${lesson.hourEnd}</td>
            <td>wyświetl listę uczniów którzy mają tą lekcje</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
