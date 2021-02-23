<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 로그인폼 출력-->
    <form action="/web/loginAction" method=post>
        <h1>로그인</h1>
        <b>ID</b>
        <input type="text" placeholder="Enter ID" name="id" size="10" value='${cookie.id.value}'>
        <b>Password</b>
        <input type="password" placeholder="Enter Password" name="pwd" size="20">
        <input type="checkbox" name="remember" value="yes" ${cookie.id == null ? "" : "checked"}>Remember ID
        <button type="submit">Login</button>
        <p>계정이 없으세요? <a href="register.jsp">회원가입하기</a></p>
    </form>
</body>
</html>