<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
int x = Integer.parseInt(request.getParameter("x"));
int y = Integer.parseInt(request.getParameter("y"));
int sum = x+y;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%=x %>と<%=y %>の和は
	
	<%=sum %>です。
	
	<a href="nyuryoku.jsp">戻る</a>
</body>
</html>