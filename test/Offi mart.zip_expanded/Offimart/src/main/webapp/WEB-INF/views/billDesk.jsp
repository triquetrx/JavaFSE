<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
	<h1>
		<center>Online Office Mart</center>
	</h1>
	<center>
		<table border="1" cellpadding="1">
			<tr>
				<td>Item Name</td>
				<td>${itemName}</td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td>${quantity}</td>
			</tr>
			<tr>
				<td>Cost Per Item Rs:</td>
				<td>${costPerItem}</td>
			</tr>
			<tr>
				<td>Total price Rs:</td>
				<td>${cost}</td>
			</tr>
		</table>
	</center>
</body>
</html>