<%--
  Created by IntelliJ IDEA.
  User: johnppkyaw
  Date: 2/19/24
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title> Failure page </title>
</head>
<body>
<h1><%= "Failure Page" %>
</h1>
<h2> <%=request.getAttribute("username")%> is incorrect . Please try again</h2>
</body>
</html>
