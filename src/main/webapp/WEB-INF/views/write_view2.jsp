<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="write" method="post">
	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td>이름</td>
			<td><input type="text" name="bName"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="bTitle"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="10" name="bContent"></textarea></td>
		</tr>		
		<tr>
			<td colspan="5"><input type="submit" value="입력"> &nbsp;&nbsp; <a href="list">목록보기</a> 			
			</td>
		</tr>
	</table>
	</form>
</body>
</html>