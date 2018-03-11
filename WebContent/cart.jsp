<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<title>カート</title>
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


	<div class= "main">
	<p>チェックした商品はカートから削除されます。</p>

	<table>
		<s:form action="CartAction">
			<s:iterator value="cartDTOList">
				<tr>
					<td><img src="<s:property value='imageFilePath'/>"></td>
				</tr>
				<tr>
					<td><s:property value="productName"/>
				</tr>
				<tr>
					<td><s:property value="productCount"/>点</td>
				</tr>
				<tr>
					<td><s:property value="price"/>円</td>
				</tr>
				<tr>
					<td>削除<s:checkbox name="deleteList" value="checked" fieldValue="%{productId}"/>
				</tr>
				<input type="hidden" name="deleteFlg" value="1"/>
				<s:submit value=" 削除 " method="execute"/>
			</s:iterator>

		</s:form>
		<s:form action="SettlementConfirmAction">
			<s:submit value=" 購入 " method="execute"/>
		</s:form>
	</table>
	</div>
</body>
</html>
