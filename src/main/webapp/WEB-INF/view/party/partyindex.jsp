
<html>
<body>
<h1>会議一覧</h1>
<table border="1">
<tr style="background-color:pink">
<th>Id</th><th>会議名</th><th>出席必須の可否</th><th>会議時間</th><th>会議場所</th><th>会議内容</th><th>締め切り時刻</th><th>飲み会の有無</th><th>飲み会の時間</th><th>飲み会の場所</th><th>飲み会の出欠席締め切り</th>
	<c:forEach var="e" items="${partyItems}">
		<tr>
			<td>
				${f:h(e.id) }
			</td>
			<td>
				${f:h(e.partyName) }
			</td>
			<td>
				${f:h(e.partyNecessaryFlag) }
			</td>
			<td>
				${f:h(e.partyTime) }
			</td>
			<td>
				${f:h(e.partyRoom) }
			</td>
			<td>
				${f:h(e.partyMemo) }
			</td>
			<td>
				${f:h(e.partyDeadline) }
			</td>
			<td>
				${f:h(e.drunkPartyFlag) }
			</td>
			<td>
				${f:h(e.drunkPartyTime) }
			</td>
			<td>
				${f:h(e.drunkPartyRoom) }
			</td>
			<td>
				${f:h(e.drunkPartyDeadline) }
			</td>
		</tr>
	</c:forEach>
</table>
<s:form method="POST">
<s:submit property="input" value="追加"/>
</s:form>
</body>
</html>