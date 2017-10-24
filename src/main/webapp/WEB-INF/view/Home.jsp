<%@ page import="java.util.ArrayList" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Lumino Columns - Bootstrap 4.0 Theme</title>
    <!--
    <!-- load stylesheets -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:100,300,400">   <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="font-awesome-4.5.0/css/font-awesome.min.css">                <!-- Font Awesome -->
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">                                      <!-- Bootstrap style -->
    <link rel="stylesheet" href="resources/css/templatemo-style.css">                                   <!-- Templatemo style -->
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body id="top" class="page-2">

<h1> Welcome  :)  <sec:authentication property="name" /> </h1>

<form method="get" action="/Logout">

    <button style="margin-left:50px;width: 200px;height: 40px;font-weight: bold;font-style: italic;font-size: 20px;color: tomato;background-color: #0b0b0b;border-radius: 10%;border: none"> Log Me Out </button>
</form>

<br>

<form method="get" action="/GoToAsk">

    <button style="margin-left:50px;width: 250px;height: 40px;font-weight: bold;font-style: italic;font-size: 20px;color: #d9534f;background-color: #0b0b0b;border-radius: 10%;border: none"> See Others Questions ? </button>
</form>



<div style="margin-left:30%;border: 1px solid #c7254e;border-radius: 5%;width: 40%;height:200px">

    <h2 style="margin-left: 20%"> Write A Question ... </h2>
    <br>
    <form action="Ask" method="post">
        <textarea required="required" name="Question" style="border-radius: 5%;margin: auto;margin-left: 30%" placeholder="Write A Question ..." ></textarea>
        <br>
        <br>


        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}"/>

        <button style="margin-left:160px;width: 30%;height: 13%;border: none"> Ask :)  </button>

    </form>

</div>

<%
    HttpSession ion=request.getSession();
    ArrayList ff =(ArrayList) ion.getAttribute("ellow");
    //int size=f.size()/4;
    int sizee=ff.size()/2;
    int pluss=0;

%>
<h1> My Posts And People Comments :) </h1>
<h2> All Questions  :  <%= sizee %> </h2>

<table style="color: #025aa5;border: 1px dashed #c7254e" class="table table-striped tm-full-width-large-table">
    <thead>
    <tr>
        <th> Question Id :) </th>
        <th> Question ? :) </th>
    </tr>
    </thead>

    <%
        for(int count=0;count<sizee;count++ )
        {

    %>

    <tbody>
    <tr>
        <td> <%=  ff.get(pluss+1)      %> </td>
        <td> <%=  ff.get(pluss)    %> </td>
    </tr>
    </tbody>

    <%
            pluss=pluss+2;
        }
    %>

</table>












<%
   HttpSession sion=request.getSession();
    ArrayList f =(ArrayList) sion.getAttribute("hellow");
int size=f.size()/4;
    int plus=0;
%>


    <div class="row">
        <div class="tm-section" id="tm-section-5">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">


                <h2> Answerd questions Are :  <%= size %> </h2>

                <table class="table table-striped tm-full-width-large-table">
                    <thead>
                    <tr>
                        <th> Question Id :) </th>
                        <th> Question ? :) </th>
                        <th> Answer :) </th>
                        <th> Who Answerd :) </th>
                    </tr>
                    </thead>

                    <%
                    for(int count=0;count<size;count++ )
                    {

                    %>

                    <tbody>
                    <tr>
                        <td> <%=  f.get(plus+3)      %> </td>
                        <td> <%=  f.get(plus+2)    %> </td>
                        <td> <%=  f.get(plus)    %> </td>
                        <td> <%=  f.get(plus+1)    %> </td>
                    </tr>
                    </tbody>

                    <%
                            plus=plus+4;
                        }
                    %>

                </table>



            </div>
        </div> <!-- tm-section -->
    </div>


<script src="resources/js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
<script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
<script src="resources/js/bootstrap.min.js"></script>                 <!-- Bootstrap (http://v4-alpha.getbootstrap.com/) -->
<script src="resources/js/jquery.singlePageNav.min.js"></script>      <!-- Single Page Nav (https://github.com/ChrisWojcik/single-page-nav) -->

<!-- Templatemo scripts -->
<script>

    $(document).ready(function(){

        var mobileTopOffset = 54;
        var tabletTopOffset = 74;
        var desktopTopOffset = 79;
        var topOffset = desktopTopOffset;

        if($(window).width() <= 767) {
            topOffset = mobileTopOffset;
        }
        else if($(window).width() <= 991) {
            topOffset = tabletTopOffset;
        }

        /* Single page nav
         -----------------------------------------*/
        $('#tmNavbar').singlePageNav({
            'currentClass' : "active",
            offset : topOffset,
            'filter': ':not(.external)'
        });

        if($(window).width() < 570) {
            $('.tm-full-width-large-table').addClass('table-responsive');
        }
        else {
            $('.tm-full-width-large-table').removeClass('table-responsive');
        }


        /* Collapse menu after click
         -----------------------------------------*/
        $('#tmNavbar a').click(function(){
            $('#tmNavbar').collapse('hide');
        });


        /* Handle nav offset & table responsive upon window resize
         --------------------------------------------------------------*/
        $(window).resize(function(){

            if($(window).width() < 768) {
                topOffset = mobileTopOffset;
            }
            else if($(window).width() <= 991) {
                topOffset = tabletTopOffset;
            }
            else {
                topOffset = desktopTopOffset;
            }

            $('#tmNavbar').singlePageNav({
                'currentClass' : "active",
                offset : topOffset,
                'filter': ':not(.external)'
            });

            if($(window).width() < 570) {
                $('.tm-full-width-large-table').addClass('table-responsive');
            }
            else {
                $('.tm-full-width-large-table').removeClass('table-responsive');
            }
        });

    });

</script>
</body>
</html>