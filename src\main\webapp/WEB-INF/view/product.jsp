<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="/WEB-INF/view/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Management</title>
</head>
<body>
<h1>Product Data</h1>

<form:form action = "product.do" method = "POST" commandName="product">
<table>
	<tr>
		<td>Product ID</td>
		<td><form:input path="product_id"/></td>		
	</tr>
		<tr>
		<td>Product Name</td>
		<td><form:input path="product_name"/></td>		
	</tr>
		<tr>
		<td>Product Description</td>
		<td><form:input path="product_description"/></td>		
	</tr>
		<tr>
		<td>Product Price</td>
		<td><form:input path="product_price"/></td>		
	</tr>
		<tr>
		<td>Product Category</td>
		<td><form:input path="product_category"/></td>		
	</tr>
		<tr>
		<td>Product Available</td>
		<td><form:input path="product_available"/></td>		
	</tr>
	<tr>
		<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
	</tr>
</table>

</form:form>
<br>
<table border="1">
	<th>Product ID</th>
	<th>Product Description</th>
	<th>Product Price</th>
	<th>Product Category</th>
	<th>Product Available</th>
	<c:forEach items="${productList}" var="product">
		<tr>
			<td>${product.product_id}</td>
			<td>${product.product_name}</td>
			<td>${product.product_description}</td>
			<td>${product.product_category}</td>
			<td>${product.product_available}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>