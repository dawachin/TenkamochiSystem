<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<h1>メンバー一覧</h1>
<table border="1">
<tr style="background-color:pink">
<th>Id</th><th>名前</th><th>ハンドルネーム</th><th>性別</th><th>メールアドレス</th><th>所属部</th><th>入学年度</th><th>電話番号</th><th>役職</th><th>ID</th><th>Pass</th>
	<c:forEach var="e" items="${memberItems}">
		<tr>
			<td>
				<a href="detail/${e.id}">${f:h(e.id) }</a>
			</td>
			<td>
				${f:h(e.name) }
			</td>
			<td>
				${f:h(e.hname) }
			</td>
			<td>
				${f:h(e.sex) }
			</td>
			<td>
				${f:h(e.mail) }
			</td>
			<td>
				${f:h(e.curriculum) }
			</td>
			<td>
				${f:h(e.entrance) }
			</td>
			<td>
				${f:h(e.tel1) }-${f:h(e.tel2) }-${f:h(e.tel3) }
			</td>
			<td>
				${f:h(e.officer) }
			</td>
			<td>
				${f:h(e.userName) }
			</td>
			<td>
				${f:h(e.password) }
			</td>
		</tr>
	</c:forEach>
</table>
<s:form method="POST">
<html:submit property="input" value="追加登録"/>
</s:form>
<s:link href="input">追加登録</s:link>


</body>
</html>