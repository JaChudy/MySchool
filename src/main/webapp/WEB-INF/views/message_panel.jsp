<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="Tytuł" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 05.09.18
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wyślij Wiadomość</title>
</head>
<body>
    <form:form method="post" modelAttribute="message">
        <from:hidden path="sender.id" value="${userId}"/>
        Tytuł: <form:input path="title"/><br/>
        Treść: <form:textarea path="messageBody" rows="20" cols="20"/><br/>
        Odbiorcy: <form:select path="receiver.id" items="${allUser}"
    itemLabel = "firstName" itemValue="id" /><br/>
        <input type="submit" value="Wyślij"/>
    </form:form>
</body>
</html>
