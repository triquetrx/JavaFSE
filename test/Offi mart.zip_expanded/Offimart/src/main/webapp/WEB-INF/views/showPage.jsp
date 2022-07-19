<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">


<!--  Do not change the below line -->
<a href="/showPage?language=en">English</a>|<a href="/showPage?language=de">German</a>|<a href="/showPage?language=fr">French</a></align>
<!--  Design the page as per the requirements-->
<h1><center> Online office mart </center></h1>
<form:form method="post" action="/billDesk" modelAttribute="item">
	<table style="margin:0px auto;margin-left:auto;margin-right:auto">
		<tr>
			<td>
				<spring:message code="label.itemName"/>
			</td>
			<td>
				<form:select path="itemName" id="itemName">
					<form:options items="${itemList}"/>
				</form:select>
			</td>
		</tr>
		<tr>
			<td>
				<spring:message code="label.quantity"/>
			</td>
			<td>
				<form:input path="quantity" id="quantity"/>
			</td>
			<td>
				<form:errors path="quantity"/>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="Calculate" id="submit"/></td>
		</tr>
	</table>
</form:form>
</body>
</html>	 	  	    	    	     	      	 	
