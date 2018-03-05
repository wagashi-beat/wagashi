<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "s" uri= "/struts-tags" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>新規登録画面</title>

</head>

<s:form action= "UserCreateAction">

	<s:if test= "error">
		<s:iterator value= "errorList">
			<s:property value= "error" escape= "false" />
			</s:iterator></s:if>

	<input type= "text" name= "userId" value= "" placeholder= "ユーザーID">
	<input type= "password" name= "password" value= "" placeholder= "パスワード">
	<input type= "text" name= "familyName" value= "" placeholder= "苗字">
	<input type= "text" name= "firstName" value= "" placeholder= "名前">
	<input type= "text" name= "familyNameKana" value= "" placeholder= "みょうじ">
	<input type= "text" name= "firstNameKana" value= "" placeholder= "なまえ">
	<input type= "text" name= "email" value= "" placeholder= "xxx@co.jp">

	</s:form>

<body>



</body>
</html>