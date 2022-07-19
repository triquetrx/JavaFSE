<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="lavender">
	<h1>
		<center>Online Office Mart</center>
	</h1>
	<center>
		<h3>
			<%
			if (request.getAttribute("message") != null) {
			%>
			<%=request.getAttribute("message") %>
			<%
			}
			%>
		</h3>
		<div>
			<form id="viewPageForm" action="/showPage" method="GET">
				<input type="submit" name="submit" id="submit" value="Back to home"/>
			</form>
		</div>


	</center>

</body>
</html>