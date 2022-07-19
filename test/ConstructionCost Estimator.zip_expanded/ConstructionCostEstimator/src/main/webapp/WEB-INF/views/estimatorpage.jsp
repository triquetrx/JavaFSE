<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color: lavender">
	<h1>
		<center>Construction Cost Estimator</center>
	</h1>
	<form:form method="post" action="result" modelAttribute="construction">
		<table style="margin: 0px auto; margin-left: auto; margin-right: auto">
			<tr>
				<td>Choose BricksType:</td>				
				<td><form:select path="bricksType" id="bricksType">
						<form:options items="${buildList}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Enter Buildup Area</td>
				<td><form:input path="buildupArea" id="buildupArea"/></td>
				<td>
				<form:errors path="buildupArea"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Calculate Cost" id="submit"/></td>
				<td><input type="reset" value="Cancel" id="cancel"/></td>
			</tr>
		</table>
	</form:form>


</body>
</html>
