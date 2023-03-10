<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<script>
	
		function colorChange(){
			var co = document.getElementById("color");
			
			if(co.style.borderColor == "white"){
				co.style.borderColor = "#7B85E4"
			} else {
				co.style.borderColor = "white"
			}
		}
		
	</script>

	<!-- style 영역 -->
	<style>
		@font-face {
		    font-family: 'KOTRAHOPE';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2110@1.0/KOTRAHOPE.woff2') format('woff2');
		    font-weight: normal;
		    font-style: normal;
		}
		body {
			font-family: 'KOTRAHOPE'; margin: 0; background-color: #7B85E4;
		}
		.headInfo {
			width: 650px; height: 130px; background-color: white; border-radius: 10px; margin-left: 31%; margin-top: 80px;
		}
		h1 {
			padding-top: 35px; cursor: pointer;
		}
		h1:hover {
			text-decoration: underline; color: #7B85E4; cursor: pointer;
		}
		.nav {
			width: 1100px; height: 115px; background-color: white; border-radius: 10px; margin-left: 20%; margin-top: 55px;
		}
		ul {
			display: flex;
		}
		.navA {
			text-decoration: none; font-size: 30px; margin-left: 170px; padding-top: 45px; color: black;
		}
		.navA:hover {
			text-decoration: underline; color: #7B85E4; cursor: pointer;
		}
		.bodyInfo {
			width: 1300px; height: 120px; background-color: white; border-radius: 10px; margin-top: 55px; margin-left: 15%; border: 2px solid black;
		}
		td {
			font-size: 30px; padding-right: 58px;
		}
		strong {
			border: 2px solid white; border-radius:100%; padding: 20px; cursor: pointer;
		}
	</style>
	
<title>하고 싶은 일!</title>
</head>
<body align="center">

	<div class="main">
		<div class="headInfo">
			<div>
				<div>
					<h1 onclick="location.href='${ pageContext.servletContext.contextPath }/todo/insertDo'">무엇 이요?!</h1>
				</div>
			</div>
			<div>
				<h2>현재 0개의 하고 싶은 일이 있군요!😎</h2>
			</div>
		</div>
		
		<div class="nav">
			<ul>
				<a class="navA" onclick="location.href='${ pageContext.servletContext.contextPath }/todo/list'">하고 싶어요</a>
				<a class="navA" onclick="location.href='${ pageContext.servletContext.contextPath }/todo/take'">갖고 싶어요</a>
				<a class="navA" onclick="location.href='${ pageContext.servletContext.contextPath }/todo/go'">가고 싶어요</a>
			</ul>
		</div>
		
		
		
		<table class="bodyInfo">
			<c:forEach items="${ requestScope.todoList }" var="todo">
			<tr>
				<td>${ todo.content }</td>
				<td>${ todo.cofigDate }</td>
				<td><strong id="color" onclick = "colorChange();">✔️</strong></td>
			</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>