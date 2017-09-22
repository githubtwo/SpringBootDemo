<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/18
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    response.setContentType("text/html;charset=utf-8");

    out.println("<h1>response</h1>");
//    out.flush();
    PrintWriter printWriter = response.getWriter();
    printWriter.println("我是 response对象生成的输出流outer对象");
//    response.sendRedirect("/request.jsp");//请求重定向，客户端行为 2次请求
    request.getRequestDispatcher("request.jsp").forward(request,response);//请求转发，服务器行为 1次请求
%>
</body>
</html>
