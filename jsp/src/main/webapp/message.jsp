<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#show {
		width: 500px;
		height: 300px;
		border: 1px solid blue;
	}
</style>
</head>
<body>
	<%
		String user = request.getParameter("user");
	%>
	<div id ="show">
		<div class="row">test</div>
	</div>
	<input type="text" name="content">
	<input type="hidden" name="writer" value="<%=user%>"> <!-- http://localhost/jsp/message.jsp?user=good 로 들어가서 확인해보면 작성자명 바껴있음 -->
	
	<script>
		
		document.querySelector('input[name="content"]').addEventListener('change', changeCallBack);
		function changeCallBack(){
			let content = document.querySelector('input[name="content"]').value;
			let writer = document.querySelector('input[name="writer"]').value;
			
			fetch('message', {
				method: 'post',
				headers: {'Content-type': 'application/x-www-form-urlencoded'},
				body: 'writer=' + writer + '&content='+ content
				})
				.then(result => {
					console.log(result);
					e.target.value = '';
				})
				.catch(err => console.log(err));
		}
	
		setInterval(e=>{
			let lastMsg = -1;
			fetch('message')
				.then(result => result.json())
				.then(resolve => {
					// 기존화면의 메세지를 지우기.
					let divs =  document.querySelectorAll('.row')
					divs.forEach(elem => elem.remove());
					
					fitAry = resolve.filter(elem =>{
						return elem.msgId > lastMsg - 10;
					})
					
					// 조회된 메세지를 새로 그려주기
					let show = document.getElementById('show');
					fitAry.forEach(row =>{
						lastMsg = row.msg_id;
						let div = createRow(row);
						show.append(div);
					});
				})
				.catch(error => console.log(error));
		},5000);
		
		function createRow(message){
			let div = document.createElement('div');
			div.setAttribute('class', 'row');
			let txt = document.createTextNode(message.writer + '> ' + message.content);
			div.append(txt);
			return div;
		}
	</script>
</body>
</html>