<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>

	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<title>新規登録確認画面</title>
	</head>

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
	<s:form action= "UserCreateCompleateAction">
		<h3>以下の内容で登録しますか？</h3>
			<h5>
				ユーザーID：<s:property value= "session.user_id" /><br>
				パスワード：<s:property value= "session.password" /><br>
				苗字：<s:property value= "session.familyName" /><br>
				名前：<s:property value= "session.firstName" /><br>
				みょうじ：<s:property value= "session.familyNameKana" /><br>
				なまえ：<s:property value= "session.firstNameKana" /><br>
				性別；<s:if test= "sex== 0">男性</s:if><s:if test= "sex== 1">女性</s:if>
				メールアドレス：<s:property value= "session.email" /><br>
			</h5>

			<h4><input type= "button" value= "修正" onClick= "history.back()" /><s:submit value= "登録" /></h4></s:form>

	</div>

</body>
</html>