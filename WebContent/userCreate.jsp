<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "s" uri= "/struts-tags" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>新規登録画面</title>

</head>

<s:form action= "UserCreateConfirmAction">

	<s:if test= "error">
			<s:property value= "#session.error" escape= "false" /></s:if>

	<input type= "text" name= "user_id" value= "" placeholder= "ユーザーID"><br>
	<input type= "password" name= "password" value= "" placeholder= "パスワード"><br>
	<input type= "text" name= "familyName" value= "" placeholder= "苗字"><br>
	<input type= "text" name= "firstName" value= "" placeholder= "名前"><br>
	<input type= "text" name= "familyNameKana" value= "" placeholder= "みょうじ"><br>
	<input type= "text" name= "firstNameKana" value= "" placeholder= "なまえ"><br>
	<input type= "radio" name= "sex" value= "0" checked= "checked" />男
	<input type= "radio" name= "sex" value= "1" />女
	<input type= "text" name= "email" value= "" placeholder= "xxx@co.jp"><br>

	<s:submit value= "完了" />

	</s:form>

<body>



</body>
</html>