<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>Material Login Form</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
    <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
    <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
    <link rel="stylesheet" href="resources/css/style.css">


</head>

<body>

<div class="pen-title">
    <h1>Material Login Form</h1><span>Pen <i class='fa fa-code'></i> by <a href='http://andytran.me'>Andy Tran</a></span>
</div>

<div class="container">
    <div class="card"></div>

    <div class="card">
        <h1 class="title"> Register :)</h1>
        <form action="Register" method="post" name="Spring_Form"  onsubmit="return Security()">

            <div class="input-container">
                <input type="text"  name="UName" required="required " placeholder=" User Name :)"  id="User_Name"/>
                <div class="bar"></div>
            </div>

            <div class="input-container">
                <input type="password"  name="UPassWord"required="required" id="User_Password" placeholder=" User PassWord :)"/>
                <div class="bar"></div>
            </div>

            <div class="input-container">
                <input type="email"   name="UMail" required="required" placeholder=" User Email :)" id="User_Email"/>
                <div class="bar"></div>
            </div>



            <input type="hidden" name="${_csrf.parameterName}"
                   value="${_csrf.token}"/>


            <div class="button-container">
                <button><span> Register Me :)</span></button>
            </div>

        </form>
    </div>
</div>

<!-- -->
<script>
    function Security(){

        var text=/^[A-Za-z0-9,@.]+$/;
        // UserName Validation //
        if (document.Spring_Form.User_Name.value.length <1) {
            alert("User Name Is Requred.");
            return false;
        }
        if(document.Spring_Form.User_Name.value.length >40) {
            alert("User Name Is InValid Too Long .");
            return false;
        }

        if( document.Spring_Form.User_Name.value.match(text)) {

        }else{
            alert("Not A Text User Name");
            return false;
        }


        if (document.Spring_Form.User_Email.value.length <1) {
            alert("User Email Is Requred.");
            return false;
        }
        if(document.Spring_Form.User_Email.value.length >30) {
            alert("User Email Is InValid Too Long .");
            return false;
        }

        if( document.Spring_Form.User_Email.value.match(text)) {

        }else{
            alert("Not A Text User Email");
            return false;
        }

        // UserPassWord Validation //
        if (document.Spring_Form.User_Password.value.length < 1) {
            alert("User PassWord Is Requred .");
            return false;
        }


        else {
            return true;

        }

    }

</script>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="resources/js/index.js"></script>

</body>
</html>
