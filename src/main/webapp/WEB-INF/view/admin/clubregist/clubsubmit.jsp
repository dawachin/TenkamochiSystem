<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>新規”部”登録完了画面</title>
</head>
<body>
<h1>”部”登録確認画面予定地</h1>
以下の内容で登録しました
<s:form method="POST">
<table>
	<tr>
		<th>
			部の名前
		</th>
		<td>
			${f:h(ClubName)}
		</td>
	</tr>
	<tr>
		<th>
			部長のデータ
		</th>
		<td>
			${f:h(OfficerId)}
		</td>
	</tr>
	<tr>
		<th>
			部の説明
		</th>
		<td>
			${f:h(ClubMemo)}
		</td>
	</tr>
</table>

<a href="<c:url value="/admin/clublist/"/>">一覧画面</a>
</s:form>
</body>
</html>