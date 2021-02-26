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
<table width="500", cellpadding="0">
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>제목</td>
		<td>날짜</td>
		<td>히트</td>
	</tr>
	<c:forEach items="${list}" var="vo"> 
	<tr>
		<td>${vo.bId}</td>
		<td>${vo.bName}</td>
		<td>
		<c:forEach begin="1" end="${vo.bIndent}">-[re]</c:forEach>
		<a href="content_view?bId=${vo.bId}">${vo.bTitle}</a></td>
		<td>${vo.bDae}</td>
		<td>${vo.bHit}</td>
	</tr>
	</c:forEach>
	<tr><td><a href="write_view">글작성</a></td></tr>
</table>
</body>
</html>
