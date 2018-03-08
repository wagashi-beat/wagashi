<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート</title>
</head>
<body>

	<table>
		<s:form action="CartAction">
			<s:iterator value="cartDTOList">
				<tr>
					<td><img src="<s:property value='imageFilePath'/>"></td>
				</tr>
				<tr>
					<td><s:property value="productName"/>
				</tr>
				<tr>
					<td><s:property value="productCount"/>点</td>
				</tr>
				<tr>
					<td><s:property value="price"/>円</td>
				</tr>
				<tr>
					<td>削除<s:checkbox name="deleteList" value="checked" fieldValue="%{productId}"/>
				</tr>
				<input type="hidden" name="deleteFlg" value="1"/>
				チェック済の商品は削除できます<s:submit value=" 削除 " method="execute"/>
			</s:iterator>

		</s:form>
		<s:form action="SettlementConfirmAction">
			<s:submit value=" 購入 " method="execute"/>
		</s:form>
	</table>

</body>
</html>