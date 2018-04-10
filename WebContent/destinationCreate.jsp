<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<title>宛先登録画面</title>
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


	<s:form action= "DestinationConfirmAction">
		<input type= "text" name= "familyName"placeholder="姓" <s:if test= "session != null"> value= '<s:property value= "familyName" />'</s:if> ><br>
		<s:if test="errorFamilyNameList != null">
			<s:iterator value="errorFamilyNameList" var = "errorFamilyName">
				<s:property value="errorFamilyName" /><br>
			</s:iterator>
		</s:if>

		<input type= "text" name= "firstName" value= "" placeholder="名"<s:property value= "#session.firstName" />><br>
		<s:if test="errorFirstNameList != null">
			<s:iterator value="errorFirstNameList" var = "errorFirstName">
				<s:property value="errorFirstName" /><br>
			</s:iterator>
		</s:if>

		<input type= "text" name= "familyNameKana" value= "" placeholder="姓ふりがな"<s:property value= "#session.familyNameKana" />><br>
		<s:if test="errorFamilyNameKanaList != null">
			<s:iterator value="errorFamilyNameKanaList" var = "errorFamilyNameKana">
				<s:property value="errorFamilyNameKana" /><br>
			</s:iterator>
		</s:if>

		<input type= "text" name= "firstNameKana" value= "" placeholder="名ふりがな"<s:property value= "#session.firstNameKana" />><br>
		<s:if test="errorFirstNameKanaList != null">
			<s:iterator value="errorFirstNameKanaList" var = "errorFirstNameKana">
				<s:property value="errorFirstNameKana" /><br>
			</s:iterator>
		</s:if>

		<input type= "text" name= "email" value= "" placeholder="メールアドレス"<s:property value= "#session.email" /> ><br>
		<s:if test="errorEmailList != null">
			<s:iterator value="errorEmailList" var = "errorEmail">
				<s:property value="errorEmail" /><br>
			</s:iterator>
		</s:if>

		<input type= "text" name= "address" value= "" placeholder= "住所"><br>
		<s:if test="errorAddressList != null">
			<s:iterator value="errorAddressList" var = "errorAddress">
				<s:property value="errorAddress" /><br>
			</s:iterator>
		</s:if>

		<input type= "text" name= "telNumber" value= "" placeholder= "電話番号"><br>
		<s:if test="errorTelNumberList != null">
			<s:iterator value="errorTelNumberList" var = "errorTelNumber">
				<s:property value="errorTelNumber" /><br>
			</s:iterator>
		</s:if>


		<s:submit value= "宛先登録" />
		</s:form>

	</div>
</body>
</html>