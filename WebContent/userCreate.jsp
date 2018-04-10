<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "s" uri= "/struts-tags" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<link rel= "stylesheet" type= "text/css" href= "./css/userCreate.css">
	<title>新規登録画面</title>
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
	<s:form action= "UserCreateConfirmAction">

	<div class= "form-style">
	<table class= "form-table">


					<s:if test="session.error != ''">
						<s:property value="session.error"/>
					</s:if>



		<s:if test= "errorIdList != null">
			<s:iterator value= "errorIdList">
				<tr><th></th><td><s:property value= "errorId" escape= "false" /></td></tr>
			</s:iterator>
		</s:if>

		<tr><th></th><td class= "mes">半角英数字　３～１６文字以内</td></tr>
		<tr><th>ユーザーＩＤ：</th><td><input type= "text" name= "user_id" <s:if test= "session != null">value= '<s:property value= "user_id" />'</s:if> placeholder= ""></td></tr>


		<s:if test= "errorPasswordList != null">
			<s:iterator value= "errorPasswordList">
				<tr><th></th><td><s:property value= "errorPassword" escape= "false" /></td></tr>
			</s:iterator>
		</s:if>

		<tr class="bar"><th></th><td class= "mes">半角英数字　３文字以上</td></tr>
		<tr><th>パスワード：</th><td><input type= "password" name= "password" value= "" placeholder= "パスワード"></td></tr>
		<tr></tr>


		<s:if test= "errorFamilyList != null">
			<s:iterator value= "errorFamilyList">
				<tr><th></th><td><s:property value= "errorFamily" escape= "false" /></td></tr>
			</s:iterator>
		</s:if>

		<tr class="bar"><th></th><td class= "mes">半角英数・ひらがな・カタカナ・漢字　１～１６文字</td></tr>
		<tr><th>苗字：</th><td><input type= "text" name= "familyName" <s:if test= "session != null"> value= '<s:property value= "familyName" />'</s:if> placeholder= "山田"></td></tr>
		<tr></tr>


		<s:if test= "errorFirstList != null">
			<s:iterator value= "errorFirstList">
				<tr><th></th><td><s:property value= "errorFirst" escape= "false" /></td></tr>
			</s:iterator>
		</s:if>

		<tr class="bar"><th></th><td class= "mes">半角英数・ひらがな・カタカナ・漢字　１～１６文字</td></tr>
		<tr><th>名前：</th><td><input type= "text" name= "firstName" <s:if test= "session != null"> value= '<s:property value= "firstName" />'</s:if> placeholder= "太郎"></td></tr>
		<tr></tr>


		<s:if test= "errorFamilyKanaList != null">
			<s:iterator value= "errorFamilyKanaList">
				<tr><th></th><td><s:property value= "errorFamilyKana" escape= "false" /></td></tr>
			</s:iterator>
		</s:if>

		<tr class="bar"><th></th><td class= "mes">ひらがな　１～１６文字</td></tr>
		<tr><th>みょうじ：</th><td><input type= "text" name= "familyNameKana" <s:if test= "session != null"> value= '<s:property value= "familyNameKana" />'</s:if> placeholder= "やまだ"></td></tr>
		<tr></tr>


		<s:if test= "errorFirstKanaList != null">
			<s:iterator value= "errorFirstKanaList">
				<tr><th></th><td><s:property value= "errorFirstKana" escape= "false" /></td></tr>
			</s:iterator>
		</s:if>

		<tr class="bar"><th></th><td class= "mes">ひらがな　１～１６文字以内</td></tr>
		<tr><th>なまえ：</th><td><input type= "text" name= "firstNameKana" <s:if test= "session != null"> value= '<s:property value= "firstNameKana" />'</s:if> placeholder= "なまえ"></td></tr>
		<tr></tr>


		<s:if test= "errorEmailList != null">
			<s:iterator value= "errorEmailList">
				<tr><th></th><td><s:property value= "errorEmail" escape= "false" /></td></tr>
			</s:iterator>
		</s:if>

		<tr class="bar"><th></th><td class= "mes">半角英数字　１１～３２文字以内</td></tr>
		<tr><th>メールアドレス：</th><td><input type= "text" name= "email" <s:if test= "session != null"> value= '<s:property value= "email" />'</s:if> placeholder= "xxx@co.jp"></td></tr>
		<tr></tr>

		<tr class="bar"><th>性別：</th><td>
		<s:if test= "session != null">
		<input type= "radio" name= "sex" value= "0" <s:if test= "sex == 0">checked= "checked"</s:if> />男
		<input type= "radio" name= "sex" value= "1" <s:if test= "sex == 1">checked= "checked"</s:if> />女
		</s:if>

		<s:if test= "session == null">
		<input type= "radio" name= "sex" value= "0" checked= "checked" />男
		<input type= "radio" name= "sex" value= "1"  />女
		</s:if></td></tr>

		<tr class="bar"><th></th><td><s:submit value= "完了" class= "submit" /></td></tr>

		</table>

	</div>
	</s:form>
	</div>



</body>
</html>