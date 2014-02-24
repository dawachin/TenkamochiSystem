<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>トップページ</title>
</head>
<body>
	<h1>トップページ</h1>

	メールアドレス<br/>
	ここに表示「<b>${userDto.userName}</b>」<br/>

	<br/>

	<a href="<c:url value="/"/>">トップページ</a>|<a href="<c:url value="/login/"/>">ログインページ</a>|<a href="<c:url value="/mypage/"/>">マイページ</a>
</body>
</html>