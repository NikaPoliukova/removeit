<%@ page import="com.example.model.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    Registered users</h1>
<table>
    <tr>
        <th>Name</th>
    </tr>
    <% for (User user : (List<User>)request.getAttribute("users")) {%>
    <tr>
        <td>
            <%=user.getUserName()%>
        </td>
    </tr>
    <%} %>
</table>
</body>
</html>