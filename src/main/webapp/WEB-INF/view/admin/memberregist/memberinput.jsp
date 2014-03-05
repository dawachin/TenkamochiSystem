<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<h1>メンバー入力画面予定地</h1>
<s:form method="POST">
<table>
	<tr>
		<th>
			名前
			<html:errors property="name" />
		</th>
		<td>
			<html:text property="name" />
		</td>
	</tr>
	<tr>
		<th>
			性別
			<html:errors property="sex" />
		</th>
		<td>
			<html:text property="sex" />
		</td>
	</tr>
	<tr>
		<th>
			ハンドルネーム
			<html:errors property="hname" />
		</th>
		<td>
			<html:text property="hname" />
		</td>
	</tr>
	<tr>
		<th>
			メールアドレス
			<html:errors property="mail" />
		</th>
		<td>
			<html:text property="mail" />
		</td>
	</tr>
	<tr>
		<th>
			所属部
			<html:errors property="department" />
		</th>
		<td>
        	<html:text property="department" />
		</td>
	</tr>
	<tr>
		<th>
			学科
			<html:errors property="curriculum" />
		</th>
		<td>
			<html:text property="curriculum" />
		</td>
	</tr>
	<tr>
		<th>
			入学年度
			<html:errors property="entrance" />
		</th>
		<td>
			<html:text property="entrance" />
		</td>
	</tr>
	<tr>
		<th>
			電話番号
			<html:errors property="tel1" />
			<html:errors property="tel2" />
			<html:errors property="tel3" />
		</th>
		<td>
			<html:text property="tel1" />
		</td>
		<td>
			<html:text property="tel2" />
		</td>
		<td>
			<html:text property="tel3" />
		</td>
	</tr>
	<tr>
	</tr>
	<tr>
		<th>
			役職
			<html:errors property="officer" />
		</th>
		<td>
			<html:text property="officer" />
		</td>
	</tr>
	<tr>
		<th>
			ID
			<html:errors property="userName" />
		</th>
		<td>
			<html:text property="userName" />
		</td>
	</tr>
	<tr>
		<th>
			パスワード
			<html:errors property="password" />
		</th>
		<td>
			<html:password property="password" />
		</td>
	</tr>
</table>
<html:submit property="submit" value="登録"/>
</s:form>
</body>
</html>