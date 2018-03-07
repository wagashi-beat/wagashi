<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "s" uri= "/struts-tags" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>新規登録確認画面</title>
</head>
<body>
<s:form action= "UserCreateCompleateAction">
	<h3>以下の内容で登録しますか？</h3>
		<h5>
			ユーザーID：<s:property value= "session.userId" /><br>
			パスワード：<s:property value= "session.password" /><br>
			苗字：<s:property value= "session.familyName" /><br>
			名前：<s:property value= "session.firstName" /><br>
			みょうじ：<s:property value= "session.familyNameKana" /><br>
			なまえ：<s:property value= "session.firstNameKana" /><br>
			性別；<s:if test= "sex== 0">男性</s:if><s:if test= "sex== 1">女性</s:if>
			メールアドレス：<s:property value= "session.email" /><br>
		</h5>

		<h4><input type= "button" value= "修正" onClick= "history.back()" /><s:submit value= "登録" /></h4></s:form>

</body>
</html>