<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<title>購入履歴確認画面</title>
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
				<br>


			<div id="error">
			   	<s:if test = "message != null">
					<s:property value = "message" />
				</s:if>
			</div>

				<s:if test = "purchaseHistoryDTOList==null">
					<h1>購入情報はありません</h1>
						<br>
					マイページへ<a href='<s:url action="MyPageAction" />'>戻る</a>

				</s:if>
			 	<h1 class="cart">購入履歴</h1>
				 	<s:form method = "delete" action = "PurchaseHistoryAction">
						<s:iterator value="purchaseHistoryDTOList">
							<table>
								<tr>
									<td class="sample01"><s:checkbox name="checkList" value="checked" fieldValue="%{id}"/><!-- fieldValueを使ってcheckListにidを入れる --></td>
									<td><img src="<s:property value='session.d_image_file_path'/>" id="cartImg"></td>

									<td>
									<s:property value="session.d_product_name" />&nbsp;(<s:property value="session.d_product_name_kana" />)
									<br>
									<br>

									<s:property value="getPrice()" />円&nbsp;<s:property value="productCount"/>点
									<s:property value="getProductName()" />
									<br>
									<br>
								</tr>
							</table>
						</s:iterator>

						<br>
						<br>
						<br>
						<br>
						<div class="sample02">
							チェック済の履歴は削除できます
								<input type = "hidden" name="deleteFlg" value="1">
								<s:submit value=" 削除 " method="execute"/>

						</div>
					</s:form>
						<br>




</body>
</html>



