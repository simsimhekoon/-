<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.test.project.dto.BoardDto" %>
<%@ page import="java.util.List" %>
<%@ page import="com.test.project.service.BoardService" %>
<!DOCTYPE html>
<html lang="kr" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="euc-kr">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="/resources/images/favicon.png">

    <title>Cupid</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="/resources/skins/eden.css" rel="stylesheet">
    <link href="/resources/css/animate.min.css" rel="stylesheet">
    <link href="/resources/css/icons/icons.css" rel="stylesheet">
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="/resources/style.css" rel="stylesheet">


    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="/resources/bootstrap/js/html5shiv.js"></script>
    <script src="/resources/bootstrap/js/respond.min.js"></script>
    <![endif]-->
    <style>
        table {
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid black;
        }
        td {
            width : 200px;
            height: 30px;
        }
    </style>
</head>

<body data-spy="scroll" data-target="#topnav">

<div class="navbar navbar-color navbar-fixed-top" id="topnav">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon icon-reorder"></span>

            </button>
            <a class="navbar-brand" href="#"><img src="/resources/images/logo.png" alt="Expose"/> </a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#home">Home</a></li>
                <li><a href="#services">Services</a></li>
            </ul>

        </div>
        <!--/.navbar-collapse -->
    </div>
</div>

<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron" id="home">
    <div class="intro">
        <div class="container">

            <div class="row">
                <h1 class="text-center">Final <span>Test!</span></h1>

                <p class="text-center">Simple Board</p><br/>
            </div>
            <div class="row triangles">
                <div class="up-triangle animated fadeInUp">
                    <div class="info">
                        <i class="icon icon-cogs"></i><br/>
                        Bootstrap 3
                    </div>
                </div>
                <div class="down-triangle animated fadeInDown">
                    <div class="info">

                        Support<br/>
                        <i class="icon icon-envelope-alt"></i>
                    </div>
                </div>
                <div class="up-triangle animated fadeInUp">
                    <div class="info">

                        <i class="icon icon-picture"></i><br/>
                        Colorful
                    </div>
                </div>
                <div class="down-triangle animated fadeInDown">
                    <div class="info">

                        Clean Code<br/>
                        <i class="icon icon-code"></i>
                    </div>
                </div>

                <div class="down-triangle animated fadeInDown visible-sm">
                    <div class="info">

                        Clean Code<br/>
                        <i class="icon icon-code"></i>
                    </div>
                </div>

                <div class="up-triangle animated fadeInUp">
                    <div class="info">

                        <i class="icon icon-thumbs-up"></i><br/>
                        Awesome
                    </div>
                </div>
                <div class="down-triangle animated fadeInDown">
                    <div class="info">

                        Secure<br/>
                        <i class="icon icon-laptop"></i>
                    </div>
                </div>
                <div class="up-triangle animated fadeInUp">
                    <div class="info">

                        <i class="icon icon-comments-alt"></i><br/>
                        Helpful
                    </div>
                </div>


            </div>

        </div>
    </div>
</div>

<section id="services">
    <div class="container">
        <!-- Example row of columns -->
        <div class="row features">
            <div class="col-md-12 text-center">
                <h2>Board</h2>

                <p>*************TEST*************</p>
            </div>
        </div>
        <div class="row features">
            <!-- 내용 -->
            <div class="card mb-4">
                <div class="card mb-4">
                    <button class="btn btn-primary" onclick="location.href='/insert'">write</button>
                </div>
                ..

                <table>
                    <thead>
                    <tr>
                        <th class="one wide">Num</th>
                        <th class="ten wide">Title</th>
                        <th class="two wide">userId</th>
                    </tr>
                    </thead>

                    <tbody  id="Post">
                    <!-- CONTENTS !-->
                    <tr>
<%--                        <td>--%>
<%--                            <a th:href="@{'/post/' + ${board.post_num}}">--%>
<%--                                <span th:text="${board.title}"></span>--%>
<%--                            </a>--%>
<%--                        </td>--%>
<%--                        <td>--%>
<%--                            <span th:text="${board.userid}"></span>--%>
<%--                        </td>--%>

                    </tbody>
                </table>
                ..
            </div>

            <!-- 페이지 전환 -->
            <ul class="pagination justify-content-center mb-4">
                <li class="page-item">
                    <a class="page-link" href="#">&larr; Older</a>
                </li>
                <li class="page-item disabled">
                    <a class="page-link" href="#">Newer &rarr;</a>
                </li>
            </ul>
        </div>


    </div>
</section>

<section class="gray">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h3 class="text-center">Tell your projects awesome story.</h3>
            </div>
        </div>
    </div>
</section>


<footer id="footer">

    <div class="footer-copyright">
        <div class="container">
            <div class="row">
                <div class="col-md-2">
                    <a class="logo" href="/resources/index.html">
                        <img src="/resources/images/logo.png" alt="Template Eden">
                    </a>
                </div>
                <div class="col-md-5">
                    <p>&copy; Copyright 2013 by Template Eden. All Rights Reserved.</p>
                </div>
                <div class="col-md-5">
                    <nav id="footer-menu">
                        <ul>
                            <li><a href="#">FAQ's</a></li>
                            <li><a href="#">Sitemap</a></li>
                            <li><a href="#">Contact</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</footer>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/resources/js/jquery.js"></script>
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript">
    $(function () {
        if($(window).width()>960){
            var tw = $('.triangles').width()/7+32;
            var ta = tw/2+22;
            $('.down-triangle').css('border-top',tw+'px solid rgba(0,0,0,0.8)').css('border-left',ta+'px solid transparent').css('border-right',ta+'px solid transparent');
            $('.up-triangle').css('border-bottom',tw+'px solid rgba(0,0,0,0.8)').css('border-left',ta+'px solid transparent').css('border-right',ta+'px solid transparent');
        }
        $('#wd-wrapper').sinusoid({
            minImgW: 80,
            maxImgW: 130,
            minImgAngle: -20,
            maxImgAngle: 20,
            leftFactor: 60,
            sinusoidFunction: {
                A: 70,
                T: 1700,
                P: 0
            }
        });


        $('a[href*=#]:not([href=#]):not([rel=crs])').click(function() {
            if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') && location.hostname == this.hostname) {
                var target = $(this.hash);
                target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
                if (target.length) {
                    $('html,body').animate({
                        scrollTop: target.offset().top
                    }, 1000);
                    return false;
                }
            }
        });

    });
</script>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script>
    console.log("teset");
    $.ajax({
        type: 'get',
        url: `/rest`,
        dataType: 'json',
        async: false,
        success: (data) => {
            const boardData = data.boardDtoList;
            var POST= document.getElementById('Post');
            for(let i=0;i<boardData.length;i++) {
                POST.innerHTML += `<tr><td>` +
                boardData[i].post_num + `</td><td>` +
                    boardData[i].title + `</td><td>` +
                    boardData[i].userid + `</td></tr>`;
            }
        } ,
        error: () => {console.log("에러에러에러");
        },
    });


</script>
</body>
</html>
