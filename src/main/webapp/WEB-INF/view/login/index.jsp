<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>ログインページ</title>
</head>
<body>
	<h1>ログインページ</h1>

	<html:errors/>

	<s:form action="/login/">
		メールアドレス<html:text property="userName" /><br/>
		パスワード<html:password property="password" /><br/>
		<br/>
		<html:submit value="ログイン"/>
	</s:form>

	<br/>

	<a href="<c:url value="/"/>">トップページ</a>|<a href="<c:url value="/login/"/>">ログインページ</a>|<a href="<c:url value="/mypage/"/>">マイページ</a>
</body>
</html>