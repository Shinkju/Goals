<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

	<div class="main">
		<div class="headInfo">
			<div>
				<div>
					<h1>원하는 것을 적어보세요!</h1>
				</div>
			</div>
		</div>
		
		<form action="${ pageContext.servletContext.contextPath }/todo/insertDo" method="post">
			<b>목표</b>  <input type="text" name="content"><br>
			<b>날짜</b>  <input type="Date" name="cofigDate"><br>
			<select name = "categoryCode">
				<option value="1">✨하고 싶어✨</option>
				<option value="2">✈️가고 싶어✈️</option>
				<option value="3">👛갖고 싶어👛</option>
			</select>
			<button type="submit">등록</button>
			<button>뒤로</button>
		</form>
	</div>
</body>
</html>