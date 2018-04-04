<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">

<title>商品一覧画面</title>

</head>
<body>
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

	<div class="main">
		<div class="ProductList">

			<h3>商品一覧</h3>

			<!-- 検索時のメッセージ(sano -->
			<s:if test="searchMessage != ''">
				<h2>
					<s:property value="searchMessage" escape="false" />
				</h2>
			</s:if>



			<ul class="thumbnail clearFix">
				<!-- 表示件数1ページ目 -->


				<s:iterator value="productList">
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

							</dl>
					</li>
					</a>
				</s:iterator>
			</ul>


			<div class="pageSelect">${pageSelect +1}</div>


			<s:if test="pageSelect > 0">
				<form action="ItemSearchAction">
					<s:hidden name="searchWord" value="%{searchWord}" />
					<s:hidden name="category" value="%{category}" />
					<s:hidden name="pageSelect" value="%{pageSelect - 1}" />
					<div class=pageback>
						<s:submit value=" 前へ" />
					</div>
				</form>
			</s:if>

			<%-- 	<span>
			<s:iterator value="pageList" status="st">
			<a href="<s:url action='ProductListAction'>
			<s:param name='pageSelect' value='{}'/></s:url>">
			<div>
			<s:property />
			</div>
			</a>
			</s:iterator>
		</span>
 --%>




			<s:if test="pageSelect < trueList.size() -1">
				<form action="ItemSearchAction" method="post">
					<s:hidden name="searchWord" value="%{searchWord}" />
					<s:hidden name="category" value="%{category}" />
					<s:hidden name="pageSelect" value="%{pageSelect + 1}" />
					<div class=pagenext>
						<s:submit value=" 次へ" />
					</div>
				</form>
			</s:if>

		</div>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>