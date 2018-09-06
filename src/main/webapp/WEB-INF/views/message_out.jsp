<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 05.09.18
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Skrzynka nadawcza</title>
</head>
<body>

<ol>
    <c:forEach items="${messageOut}" var="message">
        <li>Tytuł ${message.title} <br/>
            Treść ${message.messageBody} <br/>
            Odbiorce ${message.receiver.firstName} ${message.receiver.lastName}</li>
    </c:forEach>
</ol>
</body>
</html>
