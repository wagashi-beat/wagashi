<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "s" uri= "/struts-tags" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>宛先登録確認画面</title>
</head>

<body>
	<s:form action= "DestinationCompleateAction">
	<h3>以下の内容で登録しますか？</h3>
		<h5>
			苗字：<s:property value= "session.familyName" /><br>
			名前：<s:property value= "session.firstName" /><br>
			みょうじ：<s:property value= "session.familyNameKana" /><br>
			なまえ：<s:property value= "session.firstNameKana" /><br>
			電話番号：<s:property value= "session.telNumber" /><br>
			メールアドレス：<s:property value= "session.email" /><br>
			住所：<s:property value= "session.address" /><br>
		</h5>

		<h4><input type= "button" value= "修正" onClick= "history.back()" /><s:submit value= "登録" /></h4></s:form>


</body>
</html>