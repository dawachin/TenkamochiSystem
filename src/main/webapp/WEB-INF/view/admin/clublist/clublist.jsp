<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>部の一覧</title>
</head>
<body>
<h1>部一覧</h1>
<s:form method="POST">
<table border="1">
<tr style="background-color:pink">
<th>削除選択</th><th>Id</th><th>部の名前</th><th>代表者のデータ</th><th>部の説明</th>
	<c:forEach var="e" items="${clubItems}">
		<tr>
		    <td>
		    	<input type=checkbox name="delete_checks" value="${f:h(e.id)}">
		    </td>
			<td>
				<a href="<c:url value="/admin/clubdetail/detail"/>/${e.id}">${f:h(e.id) }</a>
			</td>
			<td>
				${f:h(e.ClubName) }
			</td>
			<td>
				${f:h(e.OfficerId) }
			</td>
			<td>
				${f:h(e.ClubMemo) }
			</td>
		</tr>
	</c:forEach>
</table>
<input type="submit" name="delete" value="削除"/>
</s:form>
<a href="<c:url value="/admin/clubregist/index"/>">新規登録</a>



</body>
</html>