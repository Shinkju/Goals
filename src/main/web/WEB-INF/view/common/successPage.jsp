<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		
		(function(){
			const successCode = '${ requestScope.successCode }';
			
			let successMessage = '';
			let movePath = '';
			
			switch(successCode){
			case 'insertTodo' : 
				successMessage = '버킷 리스트 등록이 완료되었습니다.';
				movePath = '${ pageContext.servletContext.contextPath }/todo/insertDo';
			}
			
			
			alert(successMessage);
			location.href = movePath;
		})();
	
	</script>
</body>
</html>