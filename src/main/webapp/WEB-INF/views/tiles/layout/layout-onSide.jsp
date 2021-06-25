<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
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
    <div class="wrap">
	    <tiles:insertAttribute name="header"/>
	    <tiles:insertAttribute name="nav" />
	    <div class="container">
		 	<tiles:insertAttribute name="side"/>
		 	<tiles:insertAttribute name="content" />
	 	</div>
	 	<tiles:insertAttribute name="footer" />
 	</div>
</body>
</html>