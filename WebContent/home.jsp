<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ホーム画面(テスト)</title>
</head>
<body>
<s:if test= "#session =! null"><s:property value= "dto.familyName" />さん、こんにちは</s:if>
	<p><a href="<s:url action='LoginMoveAction'/>">ログイン画面</a></p>

	<p><a href= "<s:url action= 'UserCreatePageAction' /> ">ユーザー登録</a>

	<p><a href="<s:url action='MyPageAction'/>">マイページ画面</a></p>

	<p><a href= "<s:url action= 'LogoutAction' /> ">ログアウト</a></p>

	<a href= "<s:url action= 'DestinationCreateAction' /> ">宛先登録</a>

	<p><a href="<s:url action='CartAction'/>">カート画面</a>


	<p><a href="<s:url action='ProductDetailAction'>
					<s:param name="productId" value="1"/>
			 		<s:param name="categoryId" value="1"/>
			 		</s:url>">詳細画面</a></p>


</body>
</html>