<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
</head>
<body>
	<table>

		<s:iterator value="myPageDTOList">
			<tr>
				<td>USER ID</td> <td><s:property value="userId"/></td>
			</tr>
			<tr>
				<td>FIRST NAME</td> <td><s:property value="first_name"/>
			</tr>
			<tr>
				<td>FAMILY NAME</td> <td><s:property value="family_name"/></td>
			</tr>
			<tr>
				<td>FIRST NAME KANA</td> <td><s:property value="first_name_kana"/></td>
			</tr>
			<tr>
				<td>FAMILY NAME KANA</td> <td><s:property value="family_name_kana"/></td>
			</tr>
			<tr>
				<td>SEX</td> <td><s:property value="sex"/></td>
			</tr>
			<tr>
				<td>EMAIL</td> <td><s:property value="email"/></td>
			</tr>
		</s:iterator>

	</table>

</body>
</html>