<%@page pageEncoding="UTF-8"%>
<html>
<body>
<s:form method="POST">
<table>
	<tr>
		<th>
			<h1>会議名</h1>
			<html:errors property="partyName" />
		</th>
		<td>
			<html:text property="partyName" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>出席必須の可否</h1>
			<html:errors property="partyNecessaryFlag" />
		</th>
		<td>
			<html:checkbox styleId="checkbox" property="partyNecessaryFlag" value="true" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>会議時間</h1>
			<html:errors property="partyTime" />
		</th>
		<td>
			<html:text property="partyTime" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>会議場所</h1>
			<html:errors property="partyRoom" />
		</th>
		<td>
			<html:text property="partyRoom" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>会議内容</h1>
			<html:errors property="partyMemo" />
		</th>
		<td>
        	<html:text property="partyMemo" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>出欠席締め切り</h1>
			<html:errors property="partyDeadline" />
		</th>
		<td>
			<html:text property="partyDeadline" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>飲み会の有無</h1>
			<html:errors property="drunkPartyFlag" />
		</th>
		<td>
			<html:checkbox styleId="checkbox" property="drunkPartyFlag" value="true" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>飲み会の時間</h1>
			<html:errors property="drunkPartyTime" />
		</th>
		<td>
			<html:text property="drunkPartyTime" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>飲み会の場所</h1>
			<html:errors property="drunkPartyRoom" />
		</th>
		<td>
			<html:text property="drunkPartyRoom" />
		</td>
	</tr>
	<tr>
		<th>
			<h1>飲み会の出欠席締め切り</h1>
			<html:errors property="drunkPartyDeadline" />
		</th>
		<td>
			<html:text property="drunkPartyDeadline" />
		</td>
	</tr>
</table>
<html:submit property="submit" value="登録"/>
</s:form>
</body>
</html>