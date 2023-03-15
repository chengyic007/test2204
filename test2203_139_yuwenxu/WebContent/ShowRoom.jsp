<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>room基本信息</title>
</head>
<body>
		<table  align="center" width=“80%” >
			<caption>Room基本信息</caption>
			<tr>  <th width="1%">rid</th><th width="3%" >name</th><th width="7%">address</th><th width="3%">intent</th><th width="5%">lastModify</th></tr>

		  <c:forEach  var="r"  items="${rooms}" varStatus="vs">
		  	<c:if test="${vs.index mod 2==0 }">
			    <tr bgcolor="#99BBFF"><td>${r.rid}</td><td>${r.name}</td><td>${r.address}</td><td>${r.intent}</td><td>${r.lastModify}</td></tr>
		    </c:if>
		   	<c:if test="${vs.index mod 2==1 }">
		   		 <tr><td>${r.rid}</td><td>${r.name}</td><td>${r.address}</td><td>${r.intent}</td><td>${r.lastModify}</td></tr>
		    </c:if>
	 	 </c:forEach>
		</table>
</body>
</html>