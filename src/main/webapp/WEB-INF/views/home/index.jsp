<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공부페이지</title>
    <!-- jQuery import -->
    <script src="/resources/js/jquery-3.6.0.min.js"></script>
    <!-- reset.css import -->
    <link rel="stylesheet" href="/resources/css/reset.css">
    <!-- 사용자 import -->
    <!-- 스타일 css -->
    <link rel="stylesheet" href="/resources/css/pc.css">
    <link rel="stylesheet" href="/resources/css/mobile.css">
    <link rel="stylesheet" href="/resources/css/tablet.css">
</head>
<body>
    <div>
        <header class="header">
            <!-- 햄버거 -->
            <div>
                <span></span>
                <span></span>
                <span></span>
            </div>
            <!-- 로고 영역 -->
            <a href="#" class="logo">
                공부페이지
            </a>
            <!-- /로고 영역 -->
            <ul class="hlb">
                <li>
                    <a href="">
                        로그인
                    </a>
                </li>
                <li>
                    <a href="">
                        회원가입
                    </a>
                </li>
                <li>
                    <a href="">
                        OOO님 오신것을 환영합니다.
                    </a>
                </li>
                <li>
                    <a href="">
                        관리자페이지
                    </a>
                </li>
            </ul>
        </header>
        <nav class="nav">
            <ul>
            <c:forEach var="topMenuVO" items="${topMenuList}">
                <li>
                    <a href="">
                        ${topMenuVO.menu_name}
                    </a>
                </li>
            </c:forEach>
            </ul>
        </nav>
        <div class="container">
            <aside class="aside">
                <ul>
                    <li>
                        <a href="">
                            {소메뉴1}
                        </a>
                    </li>
                    <li>
                        <a href="">
                            {소메뉴2}
                        </a>
                    </li>
                    <li>
                        <a href="">
                            {소메뉴3}
                        </a>
                    </li>
                </ul>
            </aside>
            <section class="section">
                소메뉴에 따른 내용
                <article>
                    섹션 내용 중 설명이 필요한 부분을 서브로 우측 하단 배치예정
                </article>
            </section>
        </div>
        <footer class="footer">
            Footer
        </footer>
    </div>
</body>
</html>