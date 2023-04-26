<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-26
  Time: 오후 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/bootstrap.bundle.min.js"></script>
    <style>

        ul {
            list-style-type: none;
            overflow: hidden;

        }
        li {
            float: left;
        }
        li a {
            display: inline-block;
            text-decoration: none;
            padding: 15px 15px;
        }
        .header {
            background: #0a53be;
            color: white;
            text-align: center;
            padding: 25px;
        }
        .nav {
            background: #6ea8fe;
            color: white;
        }
        .section {
            background: #a7acb1;
            color: black;
            text-align: center;
            height:500px;

        }
        .footer {
            background: #0d6efd;
            color: white;
            text-align: center;
        }



    </style>
</head>
<body>


    <div class = "header">
        <h2> 쇼핑몰 회원관리 ver 1.0 </h2>

    </div>
    <div class = "nav">
        <ul>
            <li>
                <a href="/save">회원등록</a>
            </li>
            <li>
                <a href="#">회원목록조회/수정</a>
            </li>
            <li>
                <a href="#">회원매출조회</a>
            </li>
            <li>
                <a href="/">홈으로.</a>
            </li>

        </ul>

    </div>
    <div class = "section">
        <h2>쇼핑몰 회원관리 프로그램</h2>

    </div>
    <div class = "footer">
        <h2>HRDKOREA</h2>

    </div>






<a href="/member">member로 가기</a>


</body>
<script>

</script>
</html>
