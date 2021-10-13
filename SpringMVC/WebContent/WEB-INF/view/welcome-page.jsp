<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="processOrder">
<div align="center">
	<h1 align="center">${myWebsiteTitle}</h1>
	<hr>
	<label for="item_name">Item Name : </label>
	<input type="text" name="foodType" placeholder="food type ?" id="item_name"/>
	<input type="submit" value="order now">
 </div>
 </form>
 </body>
</html>