<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista filmów:</h1>
	<table border="1">
  <tr>
    <th>Tytul</th>
    <th>Gatunek</th>
    <th>Rok</th>
    <th>Dochod</th>
  </tr>
  <c:forEach items="${filmy}" var="film">
	  <tr>
	    <td>${film.tytul}</td>
	    <c:choose>
	    	<c:when test = "${film.gatunek == \"wojenny\" }">
	    		<td bgcolor="#FF0000">${film.gatunek}</td>
	    	</c:when>
	    	<c:otherwise>
	    		<td>${film.gatunek}</td>
	    	</c:otherwise>
	    </c:choose>
	    <td><c:out value="${film.rok}"></c:out></td>
	    <td>
	    	<fmt:setLocale value = "en_US"/>
	    	<fmt:formatNumber value = "${film.dochod}" type = "currency"/>
	    </td>
	  </tr>
  </c:forEach>
</table>


</body>
</html>