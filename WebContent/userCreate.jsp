<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "s" uri= "/struts-tags" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<link rel= "stylesheet" type= "text/css" href= "./css/userCreate.css">
	<title>新規登録画面</title>
</head>

<body>
	<!-- ここから前頁共通 -->
	<header class= "amazon">
		<div class= "logo">
			<a href= '<s:url action= "HomeMoveAction" />'><img src= "./img/logo (3).png" height= "65px"></a>
		</div>


	<s:form action= "SearchItemAction">
	<div class="search">
		<select name= "itemCategory" class= "category">
			<option value= "">全てのカテゴリー</option>
			<option value= "">１</option>
			<option value= "">２</option>
			<option value= "">３</option>
		</select>

        	<input type="text" class="searchBox" value="" placeholder="Search">

        	<div id= "searchButton">
	        	<input type= "image" src= "./img/searchIcon.png" width= "25px" height= "25px" class= "searchIcon" />
	        </div>
	        </div>
    </s:form>


    <ul class= "menu">

    	<li class= "acount">
    		<a href= '<s:url action= "HomeMoveAction" />'>ホーム</a>
    	</li>

    	<li class= "acount">
    		<a href= '<s:url action= "UserCreatePageAction" />'>新規登録</a>
    	</li>

    	<li class= "acount">
    		<a href= '<s:url action= "LoginMoveAction" />'>ログイン</a>
    	</li>

    	<li class= "acount">
    		<a href= '<s:url action= "MyPageAction" />'>マイページ</a>
    	</li>

    	<li class= "acount">
    		<a href= '<s:url action= "LogoutAction" />'>ログアウト</a>
    	</li>

    	<li class= "acount">
    	<div class= "cart">
    		<a href= '<s:url action= "CartAction" />'><img src= "./img/cartIcon.png" height= "35px" id= "cartIcon"></a>
  		 </div>
  		 </li>
  		 </ul>

	</header>

	<!-- ここまで -->

	<div class= "main">
	<s:form action= "UserCreateConfirmAction">

	<div class= "form-style">
	<table class= "form-table">


	<s:if test= "error">
		<s:property value= "#session.error" escape= "false" /></s:if>

		<tr><th></th><td class= "mes">半角英数字　３～１６文字以内</td></tr>
		<tr><th>ユーザーＩＤ：</th><td><input type= "text" name= "user_id" <s:if test= "session != null">value= '<s:property value= "familyName" />'</s:if> placeholder= ""></td></tr>

		<tr class="bar"><th></th><td class= "mes">半角英数字　３文字以上</td></tr>
		<tr><th>パスワード：</th><td><input type= "password" name= "password" value= "" placeholder= "パスワード"></td></tr>
		<tr></tr>

		<tr class="bar"><th></th><td class= "mes">半角英数・ひらがな・カタカナ・漢字　１～１６文字</td></tr>
		<tr><th>苗字：</th><td><input type= "text" name= "familyName" <s:if test= "session != null"> value= '<s:property value= "familyName" />'</s:if> placeholder= "山田"></td></tr>
		<tr></tr>


		<tr class="bar"><th></th><td class= "mes">半角英数・ひらがな・カタカナ・漢字　１～１６文字</td></tr>
		<tr><th>名前：</th><td><input type= "text" name= "firstName" <s:if test= "session != null"> value= '<s:property value= "familyName" />'</s:if> placeholder= "太郎"></td></tr>
		<tr></tr>

		<tr class="bar"><th></th><td class= "mes">ひらがな　１～１６文字</td></tr>
		<tr><th>みょうじ：</th><td><input type= "text" name= "familyNameKana" <s:if test= "session != null"> value= '<s:property value= "familyName" />'</s:if> placeholder= "やまだ"></td></tr>
		<tr></tr>

		<tr class="bar"><th></th><td class= "mes">ひらがな　１～１６文字以内</td></tr>
		<tr><th>なまえ：</th><td><input type= "text" name= "firstNameKana" <s:if test= "session != null"> value= '<s:property value= "familyName" />'</s:if> placeholder= "なまえ"></td></tr>
		<tr></tr>

		<tr class="bar"><th></th><td class= "mes">半角英数字　１１～３２文字以内</td></tr>
		<tr><th>メールアドレス：</th><td><input type= "text" name= "email" <s:if test= "session != null"> value= '<s:property value= "familyName" />'</s:if> placeholder= "xxx@co.jp"></td></tr>
		<tr></tr>

		<tr class="bar"><th>性別：</th><td>
		<s:if test= "session != null">
		<input type= "radio" name= "sex" value= "0" <s:if test= "sex == 0">checked= "checked"</s:if> />男
		<input type= "radio" name= "sex" value= "1" <s:if test= "sex == 1">checked= "checked"</s:if> />女
		</s:if>

		<s:if test= "session == null">
		<input type= "radio" name= "sex" value= "0" checked= "checked" />男
		<input type= "radio" name= "sex" value= "1"  />女
		</s:if></td></tr>

		<tr class="bar"><th></th><td><s:submit value= "完了" class= "submit" /></td></tr>

		</table>

	</div>
	</s:form>
	</div>



</body>
</html>