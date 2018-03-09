<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<link rel= "stylesheet" type= "text/css" href= "./css/productDetail.css">
	<title>商品詳細</title>
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



	<div id= "main">

		<s:form action="CartAction">

			<s:iterator value="productDetailList">

				<div class="main-container">

					<div class="left">
						<img src="<s:property value="imageFilePath"/>" class="image">
					</div>

					<div class="right">
						<div class="product-right">
								<s:property value="productName" />
								(<s:property value="productNameKana" />)
								<br>
								<br>
								商品詳細<br>
								<s:property value ="productDescription" /><br><br>


								値段
								<input type="hidden" name="price" value='<s:property value="price"/>'>
								<s:property value ="price"/>円
								<br>
								購入個数
								<select name="productCount">
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
								</select>

								<input type="hidden" name="addFlg" value="1">
								<input type="hidden" name="productId" value='<s:property value="productId"/>'>

								<s:form>
								<div class="botan"><s:submit value="カートに入れる" method="execute"/></div>
								</s:form>

						</div>
					</div>
				</div>

				<div class="aa"></div>
				<HR>
					<p>
						同じカテゴリーの商品
					(<s:property value="categoryName"/>)
					<p>


				</s:iterator>
			</s:form>



					<s:iterator value="categoryList">

						<section class="item item-pr">



						<a href="<s:url action="ProductDetailAction">
			 								<s:param name= "productId" value="productId"/>
			 								<s:param name="categoryId" value="categoryId"/>
			 							</s:url>">
							<img src="<s:property value="imageFilePath"/>" class="itemImage">
							<br>

							<s:property value="productName" /><br>
							<s:property value="price"/>円


							</a>
						</section>
					</s:iterator>
			<div class="aa"></div>


	</div>


</body>
</html>