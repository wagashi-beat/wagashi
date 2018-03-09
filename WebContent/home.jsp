<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<title>ホーム画面(テスト)</title>
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


	<div class= "main">
<s:if test= "#session =! null"><s:property value= "dto.familyName" />さん、こんにちは</s:if>
	<p><a href="<s:url action='LoginMoveAction'/>">ログイン画面</a></p>

	<p><a href= "<s:url action= 'UserCreatePageAction' /> ">ユーザー登録</a>

	<p><a href="<s:url action='MyPageAction'/>">マイページ画面</a></p>

	<p><a href= "<s:url action= 'LogoutAction' /> ">ログアウト</a></p>

	<a href= "<s:url action= 'DestinationCreateAction' /> ">宛先登録</a>

	<p><a href="<s:url action='CartAction'/>">カート画面</a>


	<p><a href="<s:url action='ProductDetailAction'>
					<s:param name="productId" value="1"/>
			 		<s:param name="categoryId" value="1"/>
			 		</s:url>">詳細画面</a></p>
			 		</div>

</body>
</html>


