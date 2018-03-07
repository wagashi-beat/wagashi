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
		<s:iterator value="cartDTOList">
			<tr>
				<td><s:property value=""/></td>
			</tr>
			<tr>
				<td><s:property value="productName"/>
			</tr>
			<tr>
				<td><s:property value="productCount"/>点</td>
			</tr>
			<tr>
				<td><s:property value="price"/>円<td>
			</td>
		</s:iterator>
	</table>

</body>
</html>