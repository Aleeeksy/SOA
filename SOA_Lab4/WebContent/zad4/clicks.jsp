<%@ page import="zad4.model.Counter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="counter" class="zad4.model.Counter" />
<html>
<head>
    <title>Kliknięcia</title>
</head>
<body>

Baner 0: <% out.print(counter.getClicks(0)); %><br>
Baner 1: <% out.print(counter.getClicks(1)); %><br>
Baner 2: <% out.print(counter.getClicks(2)); %><br>
Baner 3: <% out.print(counter.getClicks(3)); %><br>
</body>
</html>