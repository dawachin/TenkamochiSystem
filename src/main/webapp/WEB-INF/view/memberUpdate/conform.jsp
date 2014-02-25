<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<h1>メンバー登録確認画面予定地</h1>
以下の内容で登録しました
<s:form method="POST">
<table>
	<tr>
		<th>
			名前
		</th>
		<td>
			${f:h(name)}
		</td>
	</tr>
	<tr>
		<th>
			ハンドルネーム
		</th>
		<td>
			${f:h(hname)}
		</td>
	</tr>
	<tr>
		<th>
			メールアドレス
		</th>
		<td>
			${f:h(mail)}
		</td>
	</tr>
	<tr>
		<th>
			所属部
		</th>
		<td>
			${f:h(department)}
		</td>
	</tr>
	<tr>
		<th>
			学科
		</th>
		<td>
			${f:h(curriculum)}
		</td>
	</tr>
	<tr>
		<th>
			学年
		</th>
		<td>
			${f:h(grade)}
		</td>
	</tr>
	<tr>
		<th>
			入学年度
		</th>
		<td>
			${f:h(entrance)}
		</td>
	</tr>
	<tr>
		<th>
			電話番号
		</th>
		<td>
			${f:h(tel1)}-${f:h(tel2)}-${f:h(tel3)}
		</td>
	</tr>
	<tr>
	</tr>
	<tr>
		<th>
			役職
		</th>
		<td>
			${f:h(officer)}
		</td>
	</tr>
	<tr>
		<th>
			ID
		</th>
		<td>
			${f:h(userName)}
		</td>
	</tr>
	<tr>
		<th>
			パスワード
		</th>
		<td>
			${f:h(password)}
		</td>
	</tr>
</table>

<html:submit property="index" value="一覧画面"/>
</s:form>
</body>
</html>