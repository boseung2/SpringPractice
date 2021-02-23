<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head> 
<body>
${sessionScope.id }
<header>
    <a href="/web/home"><h1>Home</h1></a>
    <ul>
        <!-- board, userList 링크는 항상 출력 -->
        <li><a href="/web/userlist">User list</a></li>
        <li><a href="/web/board">Board</a></li>
        <!--로그인 상태일때 logout 버튼 출력-->
        <c:if test='${sessionScope.id} != ""'>
        <li><a href="/web/logoutAction">>Sign out</a></li>
        </c:if>
        <!--로그아웃 상태일때 login, register 버튼 출력-->
        <c:if test='${sessionScope.id} == ""'>
        <li><a href="/web/register">Account</a></li>
        <li><a href="/web/loginForm">Sign in</a></li>
        </c:if>
    </ul>
</header>
<%-- 
<!-- 로그인 상태일때 -->
<c:if test=${!empty sessionScope.id}>
    <p>안녕하세요 <b>${sessionScope.id}</b>님, 현재 로그인 상태입니다.<br></p>
</c:if>
<!-- 로그아웃 상태일때 -->
<c:if test=${empty sessionScope.id}>
    <p>현재 로그아웃 상태입니다.<br>
        사이트를 이용하시려면 로그인을 해주세요.<br></p>
</c:if> --%>
</body>
</html>
