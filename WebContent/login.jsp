<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<title>ログイン画面</title>
</head>

<body>
	<!-- ここから前頁共通 -->
		<header class = "amazon">
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

	<h1>ログイン</h1>

	<div>
		<s:form action = "LoginAction">

			<span class= "error">
				<s:if test="errorId == null && errorId1 == null && errorId2 == null &&
							errorPassword== null && errorPassword1== null && errorPassword2== null ">
				<s:property value="errorMessage" /></s:if></span>

				<%--ログインID --%>

					<s:if test="errorId != null">
						<s:property value="errorId" escape="false" />
					</s:if>

					<s:if test="errorId1 != null">
						<s:property value="errorId1" escape="false" />
					</s:if>

					<s:if test="errorId2 != null">
						<s:property value="errorId2" escape="false" />
					</s:if>


					<s:textfield name="user_id" placeholder = "userID"/>


				<%--ログインPassword --%>

					<s:if test="errorPassword != null">
						<s:property value="errorPassword" escape="false" />
					</s:if>

					<s:if test="errorPassword1 != null">
						<s:property value="errorPassword1" escape="false" />
					</s:if>

					<s:if test="errorPassword2 != null">
						<s:property value="errorPassword2" escape="false" />
					</s:if>


					<s:password name="password" placeholder = "password"/>






			<s:submit value="ログイン"/>
		</s:form>
	</div>

	<a href= '<s:url action= "PasswordChangeAction" />'>パスワード変更はこちら</a>

	</div>

</body>
</html>