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
			会議の題名
			<html:errors property="meetingName" />
		</th>
		<td>
			<html:text property="meetingName" />
		</td>
	</tr>
	<tr>
		<th>
			会議の必須判定
			<html:errors property="meetingNecessaryFlag" />
		</th>
		<td>
			<html:text property="meetingNecessaryFlag" />
		</td>
	</tr>
	<tr>
		<th>
			会議開始時間
			<html:errors property="meetingTime" />
		</th>
		<td>
			<html:text property="meetingTime" />
		</td>
	</tr>
	<tr>
		<th>
			会議場所（教室）
			<html:errors property="meetingRoom" />
		</th>
		<td>
			<html:text property="meetingRoom" />
		</td>
	</tr>
	<tr>
		<th>
			会議の内容
			<html:errors property="meetingMemo" />
		</th>
		<td>
        	<html:text property="meetingMemo" />
		</td>
	</tr>
	<tr>
		<th>
			会議の締め切り時間
			<html:errors property="meetingDeadline" />
		</th>
		<td>
			<html:text property="meetingDeadline" />
		</td>
	</tr>
	<tr>
		<th>
			飲み会の時間
			<html:errors property="drunkTime" />
		</th>
		<td>
			<html:text property="drunkTime" />
		</td>
	</tr>
	<tr>
		<th>
			飲み会の場所
			<html:errors property="drunkTime" />
		</th>
		<td>
			<html:text property="drunkTime" />
		</td>
	</tr>
	<tr>
		<th>
			飲み会の内容
			<html:errors property="drunkMemo" />
		</th>
		<td>
			<html:text property="drunkMemo" />
		</td>
	</tr>
	<tr>
		<th>
			飲み会の締め切り時間
			<html:errors property="drunkDeadline" />
		</th>
		<td>
			<html:text property="drunkDeadline" />
		</td>
	</tr>
</table>
<html:submit property="submit" value="登録"/>
</s:form>
</body>
</html>