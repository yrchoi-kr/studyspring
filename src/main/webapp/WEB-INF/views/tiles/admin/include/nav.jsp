<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
