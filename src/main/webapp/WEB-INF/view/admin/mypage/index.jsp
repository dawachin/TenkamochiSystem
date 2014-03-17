<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>マイページ</title>
</head>
<body>
	<h1>マイページ(admin)</h1>

	<b>これがマイページ</b><br/>

	入力したユーザーネームが<br/>
	ここに表示「<b>${userDto.userName}</b>」<br/>

	<br/>

	<a href="<c:url value="/"/>">トップページ</a>|<a href="<c:url value="/login/"/>">ログインページ</a>|<a href="<c:url value="/mypage/"/>">マイページ</a>|<a href="<c:url value="/admin/memberlist/"/>">メンバーページ</a>|<a href="<c:url value="/admin/clublist/"/>">部管理</a>
</body>
</html>