<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>新規”部”登録入力画面</title>
</head>
<body>
<h1>”部”入力画面予定地</h1>
<s:form method="POST">
<table>
	<tr>
		<th>
			部の名前
			<html:errors property="ClubName" />
		</th>
		<td>
			<html:text property="ClubName" />
		</td>
	</tr>
	<tr>
		<th>
			部長のデータ
			<html:errors property="OfficerId" />
		</th>
		<td>
			<html:text property="OfficerId" />
		</td>
	</tr>
	<tr>
		<th>
			部の説明
			<html:errors property="ClubMemo" />
		</th>
		<td>
			<html:text property="ClubMemo" />
		</td>
	</tr>
</table>
<html:submit property="submit" value="登録"/>
</s:form>
</body>
</html>