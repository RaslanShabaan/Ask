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

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body id="top" class="page-2">



<form method="get" action="/Logout">

    <button style="margin-left:50px;width: 200px;height: 40px;font-weight: bold;font-style: italic;font-size:20px;color: tomato;background-color: #0b0b0b;border-radius: 10%;border: none"> Log Me Out </button>
</form>

<br>

<form method="get" action="/GoToHome">

    <button style="margin-left:50px;width: 250px;height: 40px;font-weight: bold;font-style: italic;font-size: 20px;color: tomato;background-color: #0b0b0b;border-radius: 10%;border: none"> Back To Profile  </button>
</form>

<div style="margin-left:30%;border: 1px solid #c7254e;border-radius: 5%;width: 40%;height:300px">

    <h2 style="margin-left: 20%"> Write Your Answer ... </h2>
    <br>
    <form action="Answer" method="post">
        <textarea name="Answer" required="required" style="border-radius: 5%;margin: auto;margin-left: 30%" placeholder="Write A Question ..." ></textarea>
        <br>
        <br>
<label style="margin-left:30%;width: 60%;font-weight: bold;font-size: 25px;color: #d9534f" > Question Id :)</label>
        <input style="margin-left: 25%;width: 60%" name="Qid" required="required" type="text"/>
        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}"/>

        <button style="margin-left:220px;margin-top:2%;width: 30%;height: 13%;border: none"> Ask :)  </button>
    </form>

</div>


    <h1>  </h1>
    <div class="row">
        <div class="tm-section" id="tm-section-5">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">

                <table class="table table-striped tm-full-width-large-table">
                    <thead>
                    <tr>
                        <th> Question Id :) </th>
                        <th> Question ? :) </th>
                        <th> Answer :) </th>
                        <th> Who Answerd :) </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Row 2</td>
                        <td>Donec porta augue vitae egestas eleifend</td>
                        <td>First</td>
                        <td>$1,500</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div> <!-- tm-section -->
    </div>


</div> <!-- .container -->

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