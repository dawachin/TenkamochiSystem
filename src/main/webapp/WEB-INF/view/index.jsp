<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<h1>Topページ予定地</h1>
<s:form method="POST">
<table>
	<tr>
		<th>ユーザー名</th>
		<td>
			<html:text property="userName" />
			<html:errors property="userName"/>
		</td>
	</tr>
	<tr>
		<th>パスワード</th>
		<td>
			<html:password property="password" />
			<html:errors property="password" />
		</td>
	</tr>
</table>
<s:submit property="login" value="ログイン" />
</s:form>

</body>
</html>