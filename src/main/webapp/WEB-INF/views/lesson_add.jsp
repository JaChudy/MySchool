<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 06.09.18
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj lekcje</title>
</head>
<body>
    <form:form method="post" modelAttribute="lesson">
        Dzień tygodnia: <form:radiobuttons path="lessonDay" items="${dayOfWeek}"/> <br/>
        Godzina rozpoczęcia: <form:input path="hourStart"/> <br/>
        Godzina zakończenia: <form:input path="hourEnd"/> <br/>
        Uczniowie: <form:select path="students" items="${students}" itemLabel="firstName"
                                itemValue="id"/> <br/>
        <input type="submit" value="Wyślij"/>
    </form:form>
</body>
</html>
