<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<link rel= "stylesheet" type= "text/css" href= "./css/index.css">
	<link rel= "stylesheet" type= "text/css" href= "./css/home.css">
	<title>ホーム画面(テスト)</title>

	<style type="text/css">
	       #result{
            margin: 30px auto;
            width: 200px;
            height: 150px;
            border-radius: 50px;
            line-height: 180px;
            color:black;
            font-size: 50px;
            font-weight: bold;
            background-color: greenyellow;
            box-shadow: 0, 2px, 10px rgba(0,0,0,0.3);
            background-color: aqua
        }

	</style>
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
									<option value="0" selected="selected">すべての和菓子</option>
									<option value="1">団子</option>
									<option value="2">餅</option>
									<option value="3">練りきり</option>
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

	<div class= "main">
	<h4>和菓子通販サイト　Wagashi　へようこそ！</h4>
	<s:if test= "#session.loginUser"><s:property value= "#session.user_id" />さん、こんにちは</s:if>
	<s:if test= "#session.loginUser == null">


	<a href="<s:url action='LoginMoveAction'/>" class="login">ログインはこちら</a></s:if>

    <s:if test= "#session.loginUser == null">
	<a href= "<s:url action= 'UserCreatePageAction' /> " class="create">新規登録</a></s:if>

	<s:if test= "session.loginUser">
    <a href="<s:url action='MyPageAction'/>" class="mypage">マイページ</a></s:if>


	<s:if test= "session.loginUser">
	<a href= "<s:url action= 'LogoutAction' /> " class="logout">ログアウト</a></s:if>


	<div id= "result"></div>
	<input type= "button" value= "おみくじ" onclick= "omikuji()" />

    </div>



    <script type="text/javascript">

    	var count= 0;

    	   function omikuji(){
    	        document.getElementById("result").innerHTML = "大吉";
    	        var num = Math.floor(Math.random()*5+1 );

    	        if(num==1){
    	            document.querySelector("#result").innerHTML = "大吉";
    	            document.querySelector("#result").style.backgroundColor = "yellow";
    	            setTimeout(countup, 1000);

    	        }else if(num==2){
    	            document.querySelector("#result").innerHTML = "中吉";
    	            document.querySelector("#result").style.backgroundColor = "pink";
    	            setTimeout(countup, 1000);

    	        }else if(num==3){
    	            document.querySelector("#result").innerHTML = "小吉";
    	            document.querySelector("#result").style.backgroundColor = "red";
    	            setTimeout(countup, 1000);

    	        }else if(num==4){
    	            document.querySelector("#result").innerHTML = "凶";
    	            document.querySelector("#result").style.backgroundColor = "green";
    	            setTimeout(countup, 1000);

    	        }else if(num==5){
    	            document.querySelector("#result").innerHTML = "大凶";
    	            document.querySelector("#result").style.backgroundColor = "red";
    	            setTimeout(countup, 1000);

    	        }
    	    }

    	</script>

</body>
</html>


