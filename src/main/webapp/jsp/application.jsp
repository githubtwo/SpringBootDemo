<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/18
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <h1>application对象</h1>
    <%
        application.setAttribute("city","北京");
        application.setAttribute("email","503122513");
    %>

    所在城市是：<%=application.getAttribute("city")%><br>
    application中的属性有:<%
        Enumeration attribute = application.getAttributeNames();
        while (attribute.hasMoreElements()){
            out.println(attribute.nextElement() + "&nbsp;&nbsp;");
        }
    %>
</body>
</html>
