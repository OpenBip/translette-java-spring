<%@ include file="header.jsp" %>

<div style="padding: 20px;">

<h2>Welcome<%
  if (userSession.isAuthenticated()) {
    %>, <%= userSession.getUsername() %><% } %>!</h2>

</div>

<%@ include file="footer.jsp" %>