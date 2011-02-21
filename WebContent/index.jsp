<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@page import="org.bipsterite.UserSession"%><html>
<% session.setAttribute("translette-session", new UserSession()); %>
<% UserSession userSession = (UserSession) session.getAttribute("translette-session"); %>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Welcome<%
  if (userSession.isAuthenticated()) {
    %>, <%= userSession.getUsername() %><% } %>!</title>
</head>

<body>

<div style="padding: 20px;">

<h2>Welcome<%
  if (userSession.isAuthenticated()) {
    %>, <%= userSession.getUsername() %><% } %>!</h2>

</div>

</body>

</html>