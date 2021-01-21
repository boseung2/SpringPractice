<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아니이거왜안돼</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
String rememberedId="";
if(cookies != null) {
	for(int i=0; i<cookies.length; i++) {
		if(cookies[i].getName().equals("remember")) {
			rememberedId = cookies[i].getValue();
		}
	}
}
%>
<form action="/LoginAction2" method=post>
ID<input type="text" name="id" value=<%=rememberedId%>>
<br>
PWD<input type="password" name="pwd">
<br>
<input type="checkbox" name="remember" value="yes">ID기억
<br>
<input type="submit" value="Login">
</form>
</body>
</html>