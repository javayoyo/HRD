<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-26
  Time: 오후 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
      <a href="/list">회원목록조회/수정</a>
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
  <h2>회원목록조회/수정</h2>
  <table>

    <tr>
      <th>회원번호</th>
      <th>회원성명</th>
      <th>전화번호</th>
      <th>주소</th>
      <th>가입일자</th>
      <th>고객등급</th>
      <th>거주지역</th>
    </tr>

    <c:forEach items="${memberList}" var="member">
      <td>

      <td>
      <a href="/detail?custno=${member.custno}">${member.custno}</a>
    </td>


        <td>${member.custname}</td>
        <td>${member.phone}</td>
        <td>${member.address}</td>
        <td>${member.joindate}</td>
        <td>${member.grade}</td>
        <td>${member.city}</td>

      </tr>
    </c:forEach>


  </table>


</div>
<div class = "footer">
  <h2>HRDKOREA</h2>

</div>


</body>

</html>
