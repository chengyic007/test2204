<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学院基本信息</title>
</head>
<body>
		<table  align="center" width=“80%” >
			<caption>学院基本信息</caption>
			<tr>  <th width="3%">aid</th><th width="6%" >aname</th><th width="11%">adesc</th><th width="3%">contact</th><th width="5%">conphone</th><th width="1%">astate</th></tr>

		  <c:forEach  var="a"  items="${academys}" varStatus="vs">
		  	<c:if test="${vs.index mod 2==0 }">
			    <tr bgcolor="#99BBFF"><td>${a.aid}</td><td>${a.aname}</td><td>${a.adesc}</td><td>${a.contact}</td><td>${a.conphone}</td><td>${a.astate}</td></tr>
		    </c:if>
		   	<c:if test="${vs.index mod 2==1 }">
		   		 <tr><td>${a.aid}</td><td>${a.aname}</td><td>${a.adesc}</td><td>${a.contact}</td><td>${a.conphone}</td><td>${a.astate}</td></tr>
		    </c:if>
	 	 </c:forEach>
		</table>
</body>
</html>