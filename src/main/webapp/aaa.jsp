<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form action="<%=request.getContextPath() %>/Bbb" method="post">
		<p>x:<input type="number" name="x" value="0">
		y:<input type="number" name="y" value="0"></p>
		<p><label for ="tasu"><input type="radio" name="kigou" value="tasu" id="tasu" checked>+</label>
			<label for ="hiku"><input type="radio" name="kigou" value="hiku" id="hiku" >-</label>
			<label for ="kakeru"><input type="radio" name="kigou" value="kakeru" id="kakeru" >*</label></p>
			<input type="submit" value="送信">
		
	</form>

</body>
</html>