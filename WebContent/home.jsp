<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ホーム画面(テスト)</title>
</head>
<body>
	<p><a href="<s:url action='LoginAction'/>">ログイン画面</a></p>

	<p><a href= "<s:url action= 'UserCreatePageAction' /> ">ユーザー登録</a>

	<p><a href="<s:url action='myPage'/>">マイページ画面</a></p>


</body>
</html>