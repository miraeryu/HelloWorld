<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="myform" action="formServlet" method="post" enctype="multipart/form-data"> <!-- action:넘어가는 페이지 method:넘어가는 방식 -->
		<input type="text" name="user"><br>
		<input type="text" name="passwd"><br>
		<input type="file" name="img"><br>
		<input type="hidden" name="cmd" value="search">
		<input type="hidden" name="name">
		<input type="hidden" name ="age">
		<input type="submit" value="전송">
	</form>
	
	<form name="my">
	
	</form>
	
	<script>
		let myform = document.forms.myform;
		myform.onsubmit = function(){
			mtform.action = "sample.html";
			myform.cmd.value = "insert";
			myform.user.value = "admin";
			myform.passwd.value = "1234";
			myform.name.value = "Hong";
			myform.age.value = 12;
		}
	</script>
</body>
</html>