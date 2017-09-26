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


    <h1>pageContext对象</h1>
    用户名是：<%=pageContext.getSession().getAttribute("username")%>
    <%
        //跳转到注册页面
//        pageContext.forward("reg.jsp");
        pageContext.include("xxx.jsp");
    %>
</body>
</html>
