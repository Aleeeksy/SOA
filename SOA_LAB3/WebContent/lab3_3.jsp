<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zgadywanie liczby</title>
</head>
<body>
	<%
	int randomNumber, proba;
    if (request.getParameter("randomNumber") == null)
        randomNumber = (int)Math.round(Math.random()*100);
    else
    	randomNumber = Integer.parseInt(request.getParameter("randomNumber"));
    if (request.getParameter("proba") == null)
        proba = 0;
    else {
        proba = Integer.parseInt(request.getParameter("proba"));
        proba++;
    }
	%>
	
	<form method="post" action="lab3_3.jsp">
		Podaj liczbe:
		<input type="hidden" name="proba" value="<%=proba %>">
		<input type="hidden" name="randomNumber" value="<%=randomNumber %>">
		<input type="text" name="liczba">
		<input type="submit" value="zgaduj">
	</form>
	
	<%
	out.println(randomNumber);
		if(request.getParameter("liczba") != null){
			if(Integer.parseInt(request.getParameter("liczba")) < randomNumber){
				out.println("Twoja liczba ("+ request.getParameter("liczba")  + ") jest mniejsza niz wylosowana");
			}
			else if(Integer.parseInt(request.getParameter("liczba")) > randomNumber){
				out.println("Twoja liczba ("+ request.getParameter("liczba") + ") jest wieksza niz wylosowana");
			}
			else if(Integer.parseInt(request.getParameter("liczba")) == randomNumber){
				out.println("Brawo zgadles po "+ proba +"probach");
				out.println("<a href=\"lab3_3.jsp\">Sprobuj jeszcze raz</a>");
			}
			
		}
	%>
	
		
	
</body>
</html>