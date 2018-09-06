<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 06.09.18
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dodawanie Rodzica</title>

    <!-- Bootstrap core CSS-->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="../css/sb-admin.css" rel="stylesheet">

</head>
<body class="bg-dark">
<div class="container">
    <div class="card card-register mx-auto mt-5">
        <div class="card-header">Dane rodzica</div>
        <div class="card-body">
            <form:form method="post" modelAttribute="parent">


                <div class="form-group">
                    <div class="form-row">
                        <div class="col-md-6">
                            Login: <form:input path="login" />
                        </div>
                        <div class="col-md-6">
                            Hasło: <form:password path="password"/>
                        </div>

                    </div>
                </div>

                <div class="form-group">
                    <div class="form-row">
                        <div class="col-md-6">
                            Telefon: <form:input path="phone" />
                        </div>
                        <div class="col-md-6">
                            Email: <form:input path="email"/>
                        </div>

                    </div>
                </div>


                <div class="form-group">
                    <div class="form-row">
                        <div class="col-md-6">
                            Imię: <form:input path="firstName" />
                        </div>
                        <div class="col-md-6">
                            Nazwisko: <form:input path="lastName"/>
                        </div>

                    </div>
                </div>

                <div class="form-text">
                    Adres: <br/> <form:textarea path="address" rows="3" cols="60" cssStyle="align-content: center"/>
                </div>

                <form:errors path="*"/>


                <div class="modal-footer">

                    <input type="reset" class="btn btn-secondary"  value="Wyczyść"/>


                    <input type="submit" class="btn btn-primary" value="Wyślij"/>

                </div>

            </form:form>

        </div>
    </div>
</div>



<!-- Bootstrap core JavaScript-->
<script src="../vendor/jquery/jquery.min.js"></script>
<script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="../vendor/jquery-easing/jquery.easing.min.js"></script>
</body>
</html>
