<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 05.09.18
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Skrzynka odbiorcza</title>
</head>
<body>
${messageIn}
    <ol>
        <c:forEach items="${messageIn}" var="message">
            <li>Tytuł ${message.title} <br/>
                Treść ${message.messageBody} <br/>
                Nadawca ${message.sender.firstName} ${message.sender.lastName}</li>
        </c:forEach>
    </ol>

</body>
</html>
