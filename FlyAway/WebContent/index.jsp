<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><a href="login.jsp">login</a></div>
<div>
	<form action="ProcessAirlinesTicket1" method="post">
	  <label for="fname">From:</label>
	  <input type="text" id="from" name="from"><br>
	  <label for="toward">To:</label>
	  <input type="text" id="toward" name="toward"><br>
	  <label for="dateOfJourney">Date of Journey:</label>
	  <input input type="date" id="dateOfJourney" name="dateOfJourney"><br>
	  <input type="submit" value="Submit">
	</form>
</div>
</body>
</html>