<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<title>決済確認画面</title>
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
									<option value="0" selected="selected">すべての和菓子</option>
									<option value="1">団子</option>
									<option value="2">餅</option>
									<option value="3">練りもの</option>
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

		<s:form action= "SettlementCompleateAction">
			<table>
			<s:iterator value="cartDTOList">
				<tr>
					<td><img src= '<s:property value= "imageFilePath" />'></td>
					</tr>
				<tr>
					<td><s:property value="productName"/>
				</tr>
				<tr>
					<td><s:property value="productCount"/>点</td>
				</tr>
				<tr>
					<td><s:property value="price"/>円</td>
			</s:iterator>
			</table>

		<p>合計 <s:property value="totalPrice"/>
			<table>
			<tr>
				<td>住所</td><td><s:property value="myPageDTO.getAddress()"/></td>
			</tr>
			</table>

		<s:submit value= "かう" /></s:form>

	</div>
</body>
</html>