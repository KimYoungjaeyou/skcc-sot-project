<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>안녕하세요</title>
</head>
<body>
	<c:out value="<xmp>" escapeXml="true"></c:out>
	<h2>안녕하세요 여러분</h2>
	<div>게으르미 북이에요</div>

	<h4 color=blue>${propertyMessage}</h4>
	<h4>${serviceMessage}</h4>
</body>
</html>