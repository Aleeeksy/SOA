<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="counter" class="zad4.model.Counter" />

<%
    int id = Integer.parseInt(request.getParameter("id").replace("baner", "").replace(".jpg", ""));
    counter.increment(id);
    response.sendRedirect("https://www.google.pl");
%>