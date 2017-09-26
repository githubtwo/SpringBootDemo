<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/18
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>request</title>
</head>
<%
    request.setCharacterEncoding("utf-8");//解决中文乱码
    request.setAttribute("password","123456");
%>
<body>
    用户名：<%=request.getParameter("username")%>
    爱好：<%
        if(request.getParameterValues("favorite")!=null){
            String[] favorites = request.getParameterValues("favorite");
            for(int i = 0;i<favorites.length;i++){
                out.println(favorites[i] + "&nbsp" +"wo" );
                System.out.println("fdsa");
            }
        }

    %><br>

    密码：<%= request.getAttribute("password")%><br>
    mime:<%=request.getContentType()%><br>
    协议及版本号<%=request.getProtocol()%><br>
    服务器主机名：<%=request.getServerName()%><br>
    服务器端口号:<%=request.getServerPort()%><br>
    请求文件的长度<%=request.getContentLength()%><br>
    请求客户端的IP地主<%=request.getRemoteAddr()%><br>
    请求的真是路径<%=request.getRealPath("request.jsp")%><br>
    请求的上下文路径:<%=request.getContextPath()%>


</body>
</html>
