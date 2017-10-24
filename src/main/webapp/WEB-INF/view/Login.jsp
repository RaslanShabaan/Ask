<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html >
<head>
    <meta charset="UTF-8">
    <title>Material Login Form</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
    <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
    <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
    <link rel="stylesheet" href="resources/css/style.css">


</head>

<body onload='document.loginForm.j_username.focus();'>

<div class="pen-title">
    <h1>Material Login Form</h1><span>Pen <i class='fa fa-code'></i> by <a href='http://andytran.me'>Andy Tran</a></span>
</div>

<div class="container">
    <div class="card"></div>

    <c:if test="${not empty error}">
        <h1 style="color: #c7254e;font-weight: bold;font-style: italic;font-size: 30px">  ${error}</h1>
    </c:if>

    <h1 style="color: #c7254e;font-weight: bold;font-style: italic;font-size: 30px">  ${Reg}</h1>

    <div class="card">
        <h1 class="title">Login</h1>
        <form method="post" action="/Login">
            <div class="input-container">
                <input type="text" name="UName" placeholder=" User Email :)" required="required"/>
                <div class="bar"></div>
            </div>

            <div class="input-container">
                <input type="password" name="UPass" placeholder=" User PassWord :)" required="required"/>
                <div class="bar"></div>
            </div>

            <input type="hidden" name="${_csrf.parameterName}"
                   value="${_csrf.token}"/>

            <div class="button-container">
                <button><span> Log In :)</span></button>
            </div>

        </form>


        <div class="button-container">
            <form action="GoToRegister" method="get">
                <button style="margin-top: 20px"><span> Register :)</span></button>
            </form>
        </div>
    </div>


</div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="resources/js/index.js"></script>

</body>
</html>
