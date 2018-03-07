<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "s" uri= "/struts-tags" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>宛先登録画面</title>
</head>
<body>

<s:form action= "DestinationConfirmAction">
	<input type= "text" name= "familyName" <s:if test= "session != null"> value= '<s:property value= "familyName" />'</s:if> ><br>
	<input type= "text" name= "firstName" value= "" placeholder= '<s:property value= "#session.firstName" />'><br>
	<input type= "text" name= "familyNameKana" value= "" placeholder= '<s:property value= "#session.familyNameKana" />'><br>
	<input type= "text" name= "firstNameKana" value= "" placeholder= '<s:property value= "#session.firstNameKana" />'><br>
	<input type= "text" name= "email" value= "" placeholder= '<s:property value= "#session.email" /> '><br>
	<input type= "text" name= "address" value= "" placeholder= "住所"><br>
	<input type= "text" name= "telNumber" value= "" placeholder= "電話番号"><br>

	<s:submit value= "宛先登録" />
	</s:form>

</body>
</html>