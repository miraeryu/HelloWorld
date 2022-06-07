<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>반갑습니다</h3>
	<form action="sample.html" method="post">
		<input type="text" name="name" value="홍길동"><br>
		<input type="number" name="age" value="20"><br>
		<input type="submit" value="요청">
	</form>
	<a href="sample.html?name=홍길동&age=20">sample 페이지.</a>
	
	<script>
		let xhtp = new XMLHttpRequest();
		xhtp.open('get','testServ');
		xhtp.send();
		xhtp.onload = function(){
			let result = xhtp.responseXML;
			console.log(result);
			let names = result.getElementsByTagName('name');
			for(let i = 0; i<names.length; i++){
				let p = document.createElement('p');
				p.textContent = names[i].textContent;
				document.body.append(p);
			}
		}
	</script>
</body>
</html>