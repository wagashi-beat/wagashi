<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
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

	<!-- ここまで -->


	<div class= "main">

	<table>

			<tr>
				<td>USER ID</td> <td><s:property value="dto.userId"/></td>
			</tr>
			<tr>
				<td>FIRST NAME</td> <td><s:property value="dto.firstName"/></td>
			</tr>
			<tr>
				<td>FAMILY NAME</td> <td><s:property value="dto.familyName"/></td>
			</tr>
			<tr>
				<td>FIRST NAME KANA</td> <td><s:property value="dto.firstNameKana"/></td>
			</tr>
			<tr>
				<td>FAMILY NAME KANA</td> <td><s:property value="dto.familyNameKana"/></td>
			</tr>
			<tr>
				<td>SEX</td> <td><s:property value="dto.sex"/></td>
			</tr>
			<tr>
				<td>EMAIL</td> <td><s:property value="dto.email"/></td>
			</tr>
			<!-- <tr>
				<td>ADDRESS</td> <td><s:property value="#session.address"/></td>
			</tr>
			<tr>
				<td>TEL NUMBER</td> <td><s:property value="#session.telNumber"/></td>
			</tr>-->

			<tr>
				<td>ADDRESS</td> <td><s:property value = "dto.address"/></td>
			</tr>

			<tr>
				<td>TEL NUMBER</td> <td><s:property value = "dto.telNumber"/></td>
			</tr>


	</table>

	</div>
	<p><a href="<s:url action='PurchaseHistoryAction'/>">履歴</a></p>
	<p><a href= "<s:url action= 'DestinationCreateAction' /> ">宛先登録</a></p>
	<p><a href= '<s:url action= "PasswordChangeAction" />'>パスワード変更はこちら</a></p>

</body>
</html>