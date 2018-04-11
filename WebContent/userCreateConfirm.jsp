<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>

	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<link rel= "stylesheet" type= "text/css" href= "./css/form.css">
	<title>新規登録確認画面</title>
	</head>

</head>

<body>
	<!-- ここから前頁共通 -->
		 <header>
	<div class = "amazon">
	    <div class = "logo">
	    	<a href= '<s:url action= "HomeMoveAction" />'><img src= "./img/logo (3).png" height= "65px"></a>
	    </div>

			<a href='<s:url action="StartAction" />'></a>
			<div class="searchBox">
				<table class="table-header">

					<s:form method="post" action="ItemSearchAction" class="search">
						<tr>
							<td>
								<select name="category" id="select1">
									<option value="0" selected="selected">すべての団子</option>
									<option value="1">団子</option>
									<option value="2">だんご</option>
									<option value="3">dango</option>
								</select>
							</td>

							<td>
								<input type="text" name="searchWord" placeholder = "Search"
								maxlength="16" class="searchBox" />

								<input type="image" src="./img/searchIcon.png"
								alt="検索" value="検索" id="searchButton" width = "25px" height = "25px" />
							</td>
						</tr>
					</s:form>

				</table>

			</div>
	</div>

	<div class="container">

    <ul class= "menu">

    	<li class= "acount">
    		<a href= '<s:url action= "HomeMoveAction" />'>ホーム</a>
    	</li>

    	<s:if test= "#session.loginUser == null"><li class= "acount">
    		<a href= '<s:url action= "UserCreatePageAction" />'>新規登録</a>
    	</li></s:if>

    	<s:if test= "#session.loginUser == null"><li class= "acount">
    		<a href= '<s:url action= "LoginMoveAction" />'>ログイン</a>
    	</li></s:if>

    	<s:if test= "session.loginUser"><li class= "acount">
    		<a href= '<s:url action= "MyPageAction" />'>マイページ</a>
    	</li></s:if>

    	<s:if test= "session.loginUser"><li class= "acount">
    		<a href= '<s:url action= "LogoutAction" />'>ログアウト</a>
    	</li></s:if>

    	<li class= "acount">
    	<div class= "cart">
    		<a href= '<s:url action= "CartAction" />'><img src= "./img/cartIcon.png" height= "25px" id= "cartIcon"></a>
  		 </div>
  		 </li>
  		 </ul>


    </div>
    </header>
	<!-- ここまで -->

	<div class= "main">
	<div class="cont1"></div>
	<div class="cont2">
	<s:form action= "UserCreateCompleateAction">
		<h3>以下の内容で登録しますか？</h3>
			<table class="confirm-table">

				<tr><th>ユーザーID：</th><td><s:property value= "session.user_id" /></td></tr>
				<tr><th>パスワード：</th><td><s:property value= "session.password" /></td></tr>
				<tr><th>苗字：</th><td><s:property value= "session.familyName" /></td></tr>
				<tr><th>名前：</th><td><s:property value= "session.firstName" /></td></tr>
				<tr><th>みょうじ：</th><td><s:property value= "session.familyNameKana" /></td></tr>
				<tr><th>なまえ：</th><td><s:property value= "session.firstNameKana" /></td></tr>
				<tr><th>性別：</th><td><s:if test= "sex== 0">男性</s:if><s:if test= "sex== 1">女性</s:if></td></tr>
				<tr><th>メールアドレス：</th><td><s:property value= "session.email" /></td></tr>
			</table>

			<input id="back_button" type= "button" value= "修正" onClick= "history.back()" />
			<input id="submit_button" type="submit" name="submit" value="登録">
			</s:form>
    </div>
	</div>

</body>
</html>