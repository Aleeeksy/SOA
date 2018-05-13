<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Koszyk</title>
    <jsp:useBean id="Koszyk" class="zadanie4.Koszyk" scope="session"/> 
</head>
<body>
	<%
		if(request.getParameter("part") != null){
			Koszyk.delete(Integer.valueOf(request.getParameter("part") ));
		}
	%>
	<a href="lab3_4.jsp"><button>Przejdz do sklepu</button></a>
	<c:import var = "produkty" url="produkty.xml"/>
	
	<x:parse xml = "${produkty}" var = "output"/>
	<%int i = 0; %>
	<x:forEach select = "$output/computer_parts/part" var = "item">
		<%
			if(Koszyk.numberOfProduct(i) > 0) {
		%>
  		<form>
		    <x:out select = "$item/id" />
		    <x:out select = "$item/name" />
		    <x:out select = "$item/price" />
		    <%
		    	out.print(Koszyk.numberOfProduct(i));

		    %>
		    <button type="submit" name="part" value="<x:out select="$item/id" />">Usun z koszyka</button>
		    </br>   
    	</form>
    	<%
			}
			i++;
    	%>
    </x:forEach>
</body>
</html>