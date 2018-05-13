<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sklep internetowy</title>
    <jsp:useBean id="Koszyk" class="zadanie4.Koszyk" scope="session"/> 
</head>
<body>
	<c:import var = "produkty" url="produkty.xml"/>
	
	<x:parse xml = "${produkty}" var = "output"/>
	<%
		if(request.getParameter("part") != null){
			Koszyk.add(Integer.valueOf(request.getParameter("part")));
		}
	%>
	<p>Ilosc produktow w koszyku: <%out.print(Koszyk.numberOfAllProducts()); %></p>
	<a href="lab3_4_koszyk.jsp"><button>Przejdz do koszyka</button></a>
    <x:forEach select = "$output/computer_parts/part" var = "item">
    	<form>
		    <x:out select = "$item/id" />
		    <x:out select = "$item/name" />
		    <x:out select = "$item/price" />
		    <button type="submit" name="part" value="<x:out select="$item/id" />">Dodaj do koszyka</button>
		    </br>    	
    	</form>
    </x:forEach>

</body>
</html>