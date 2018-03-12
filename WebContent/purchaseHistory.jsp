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
	<header class= "amazon">
		<div class= "logo">
			<a href= '<s:url action= "HomeMoveAction" />'><img src= "./img/logo (3).png" height= "65px"></a>
		</div>


	<s:form action= "ItemSearchAction">
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


			<br>
				<div id="title">
					<span>HISTORY</span>
				</div>

			<div id="error">
			   	<s:if test = "message != null">
					<s:property value = "message" />
				</s:if>
			</div>

				<s:if test = "purchaseHistoryDTO ==null">
					<h1>購入情報はありません</h1>
						<br>
					マイページへ<a href='<s:url action="MyPageAction" />'>戻る</a>
						<br><br><br><br><br><br><br><br><br><br><br><br>
				</s:if>
			 	<h1 class="cart">商品詳細</h1>
				 	<s:form method = "delete" action = "PurchaseHistoryAction">
						<s:iterator value="purchaseHistoryDTOList">
							<table>
								<tr>
									<td class="sample01"><s:checkbox name="checkList" value="checked" fieldValue="%{id}"/><!-- fieldValueを使ってcheckListにidを入れる --></td>
									<td><img src="<s:property value='imageFilePath'/>" id="cartImg"></td>

									<td>
									<s:property value="getProductName()" />&nbsp;(<s:property value="getProductNameKana()" />)
									<br>
									<br>

									<s:property value="getPriceComma()" />&nbsp;<s:property value="productCount"/>点
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


		<s:iterator value="purchaseHistoryDTOList">
		<s:property value="getProductName()" />
		</s:iterator>


</body>
</html>