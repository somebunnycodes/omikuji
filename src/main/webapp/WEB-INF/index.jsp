<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head> 
		<meta charset="UTF-8">
		<title>Send an Omikuji!</title> 
	</head>
	<body>
		<h3>Send an Omikuji!</h3>
		
		<form action="/omikuji" method="post">
			<div>
				<label>Pick any number from 5 to 25:</label>
				<br />
				<input type="number" name="number">
			</div>
			<div>
				<label>Enter the name of any city:</label>
				<br />
				<input type="text" name="city">
			</div>
			<div>
				<label>Enter the name of any real person:</label>
				<br />
				<input type="text" name="person">
			</div>
			<div>
				<label>Enter any profession or hobby:</label>
				<br />
				<input type="text" name="hobby">
			</div>
			<div>
				<label>Enter any type of living thing:</label>
				<br />
				<input type="text" name="being">
			</div>
			<div>
				<label>Say something nice to someone:</label>
				<br />
				<input type="text" name="compliment">
			</div>
			<div>
				<label>Send and show a friend!</label>
				<br />
				<button type="submit">Send to friend!</button>
			</div>
		</form>
	</body>
</html>
