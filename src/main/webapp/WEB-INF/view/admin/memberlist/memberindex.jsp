<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<h1>メンバー一覧</h1>
<s:form method="POST">
<table border="1">
<tr style="background-color:pink">
<th>削除選択</th><th>Id</th><th>名前</th><th>ハンドルネーム</th><th>性別</th><th>メールアドレス</th><th>所属部</th><th>入学年度</th><th>電話番号</th><th>役職</th><th>ID</th><th>Pass</th>
	<c:forEach var="e" items="${memberItems}">
		<tr>
		    <td>
		    	<input type=checkbox name="delete_checks" value="${f:h(e.id)}">
		    </td>
			<td>
				<a href="<c:url value="/admin/memberdetail/detail"/>/${e.id}">${f:h(e.id) }</a>
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
<input type="submit" name="delete" value="削除"/>
</s:form>
<a href="<c:url value="/admin/memberregist/index"/>">新規登録</a>



</body>
</html>