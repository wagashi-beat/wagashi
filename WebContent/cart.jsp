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



								<input type="text" class = "searchBox"
									   placeholder = "Search" maxlength="16"class="searchBox" />

								<input type="image" src="./img/searchIcon.png"
									   alt="検索" value="検索" id = "searchButton" width = "25px" height = "25" />
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
	<p>チェックした商品はカートから削除されます。</p>

	<table>
		<s:form action="CartAction">
			<s:iterator value="cartDTOList">
				<tr>
					<td><img src="<s:property value='session.d_image_file_path'/>"></td>
				</tr>
				<tr>
					<td><s:property value="session.d_product_name"/>
				</tr>
				<tr>
					<td><s:property value="productCount"/>点</td>
				</tr>
				<tr>
					<td><s:property value="session.d_product_price"/>円</td>
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
