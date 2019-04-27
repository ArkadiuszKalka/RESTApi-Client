<%@ page import="eu.infoshare.academy.App" %>
<%@ page import="eu.infoshare.academy.model.StateInfo" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>Hello REST Client</h2>
<%App.data();%>

NIe działa bo nie pobiera danych prawidłowo
<%--<%
    List<StateInfo> states = App.data();

    for (int i = 0; i < states.size(); i++) {
%>
<tr>
    <td><%= states.get(i).getName() %></td>
    <td><%= states.get(i).getArea() %></td>
    <td><%= states.get(i).getCapital() %></td>
    <td><%= states.get(i).getCountry() %></td>

</tr>

<% } %>--%>
</body>
</html>
