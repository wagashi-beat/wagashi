<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
<title>商品詳細画面</title>


<script type="text/javascript">
	function goCartInsertAction() {
		document.getElementById('form').action = "CartInsertAction";
	}

	function goFavoriteAction() {
		document.getElementById('form').action = "FavoriteAction";
	}
</script>

</head>


<body>
	<!-- ヘッダー-->
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

	<div class="main">
		<h3>商品詳細</h3>
		<div class="DetailsList">
			<div class="detailsList">
				<div class="img">
					<img class="image"
						src="<s:property value='session.d_image_file_path'/>" alt="Photo"
						width="300" height="240">
				</div>
				<table class="detailsTable">
					<tr>
						<td class="nowrap">商品名かな</td>
						<td>:</td>
						<td><s:property value="session.d_product_name_kana" /></td>
					</tr>
					<tr>
						<td class="nowrap">商品名</td>
						<td>:</td>
						<td><s:property value="session.d_product_name" /></td>
					</tr>
					<tr>
						<td class="nowrap">商品詳細</td>
						<td>:</td>
						<td><s:property value="session.d_product_description" /></td>
					</tr>
					<tr>
						<td class="nowrap">価格</td>
						<td>:</td>
						<td>￥<s:property value="session.d_product_price" /> 円
						</td>
					</tr>
					<tr>
						<td class="nowrap">発売日</td>
						<td>:</td>
						<td><s:property value="session.d_release_date" /></td>
					</tr>
					<tr>
						<td class="nowrap">販売会社</td>
						<td>:</td>
						<td><s:property value="session.d_release_company" /></td>
					</tr>
					<tr>
						<td class="nowrap">在庫</td>
						<td>:</td>
						<td><s:property value="session.d_item_stock" /> 個</td>
					</tr>
				</table>
			</div>




			<s:form action="CartAction" >

				<input type="hidden" name="price" value='<s:property value="price"/>'>
		購入個数
					<select name="productCount">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
					</select>

				<input type="hidden" name="addFlg" value="1" />
				<input type="hidden" name="productId" value='<s:property value="productId"/>'>

						<div class="botan"><s:submit value="カートに入れる" method="execute"/></div>
							<s:hidden name="product_id" value="%{session.d_product_id}" />

					</s:form>


		<h3>おすすめ関連商品</h3>

		<ul class="thumbnail clearFix">
			<!-- 表示件数1ページ目 -->


			<s:iterator value="sugestList">
				<a
					href="<s:url action="ProductDetailsAction">
				 <s:param name="product_id" value="%{product_id}" />
 </s:url>">


					<li class="list1">
						<dl>
							<dt>
								<img class="image" src="<s:property value='image_file_path'/>"
									alt="Photo" width="250" height="200">
							</dt>
							<table class="detailsTable">
								<tr>
									<td class="nowrap">商品名かな</td>
									<td>:</td>
									<td><s:property value="product_name_kana" /></td>
								</tr>
								<tr>
									<td class="nowrap">商品名</td>
									<td>:</td>
									<td><s:property value="product_name" /></td>
								</tr>
								<tr>
									<td class="nowrap">価格</td>
									<td>:</td>
									<td>￥<s:property value="price" />円
									</td>
								</tr>
							</table>
							<s:hidden name="product_id" value="%{product_id}" />

						</dl>
				</li>
				</a>
			</s:iterator>
		</ul>

	</div>
    </div>

	<jsp:include page="footer.jsp" />
</body>
</html>