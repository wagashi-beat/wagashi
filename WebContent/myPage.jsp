<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<link rel= "stylesheet" type= "text/css" href= "./css/mypage.css">
	<title>マイページ</title>
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


	<h4>マイページメニュー</h4>
	<p><a href="<s:url action='PurchaseHistoryAction'/>">購入履歴</a></p>
	<s:if test= "session.address == null">
	<p><a href= "<s:url action= 'DestinationCreateAction' /> ">宛先登録</a></p></s:if>
	<s:elseif test= "#session.address != null">
	<p><a href= '<s:url action= "DestinationCreateAction" />'>住所変更</a></p></s:elseif>
	<p><a href= '<s:url action= "PasswordChangeAction" />'>パスワード変更</a></p>





	<h5>登録情報</h5>

	<table class="userInfo">

			<tr>
				<th>ユーザーID:</th> <td><s:property value="dto.user_id"/></td>
			</tr>
			<tr>
				<th>苗字:</th> <td><s:property value="dto.familyName"/></td>
			</tr>
			<tr>
				<th>名前:</th> <td><s:property value="dto.firstName"/></td>
			</tr>
			<tr>
				<th>みょうじ:</th> <td><s:property value="dto.familyNameKana"/></td>
			</tr>
			<tr>
				<th>なまえ:</th> <td><s:property value="dto.firstNameKana"/></td>
			</tr>
			<tr>
				<th>性別:</th> <td><s:property value="dto.sex"/></td>
			</tr>
			<tr>
				<th>E-メール:</th> <td><s:property value="dto.email"/></td>
			</tr>
			<!-- <tr>
				<td>ADDRESS</td> <td><s:property value="#session.address"/></td>
			</tr>
			<tr>
				<td>TEL NUMBER</td> <td><s:property value="#session.telNumber"/></td>
			</tr>-->

			<tr>
				<th>住所:</th> <td><s:property value = "dto.address"/></td>
			</tr>

			<tr>
				<th>電話番号:</th> <td><s:property value = "dto.telNumber"/></td>
			</tr>


	</table>
	</div>




</body>
</html>