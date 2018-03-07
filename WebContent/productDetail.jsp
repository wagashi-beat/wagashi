<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix= "s" uri= "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品詳細</title>
</head>
<body>


	<s:form action="CartAction">

		<s:iterator value="productDetailList">

			<img src="<s:property value="imageFilePath"/>" class="image">


				<s:property value="productName" /><br>
				<s:property value="productNameKana" />
				商品詳細<br>
				<s:property value ="productDescription" />

				値段
				<input type="hidden" name="price" value='<s:property value="price"/>'>
				<br>
				購入個数
				<select name="productCount">
					<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
				</select>

				<input type="hidden" name="addFlg" value="1">
				<input type="hidden" name="productId" value='<s:property value="productId"/>'>

				<s:submit value="カートに入れる" method="execute"/>

		</s:iterator>
	</s:form>


	<HR>

	<p>
			同じカテゴリーの商品
			(<s:property value="categooryName"/>)
	<p>
		<s:iterator value="categoryList">

			<a href="<s:url action=ProductDetailAction">
				<s:param name= "productId" value="productId"/>
				<s:param name= "categoryId" value="categoryId"/>

				<img src="<s:property value="imageFilePath"/>" class="itemImage">
				<br>
				<s:property value="productName" />
				<s:property value="price"/>


			</a>
		</s:iterator>













</body>
</html>