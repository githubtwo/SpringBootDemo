<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/19
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户中心</title>

</head>


<body>
    <h1>用户信息</h1>
    <hr>
    <%
        request.setCharacterEncoding("utf-8");
        String username="";
        String password="";
        Cookie[] cookies = request.getCookies();
        if(cookies!=null&&cookies.length>0){
            out.println("is not Null");
            for (Cookie cookie: cookies){
                if(cookie.getName().equals("username") ){
                    username = URLDecoder.decode(cookie.getValue(),"utf-8");
                }
                if(cookie.getName().equals("password") ){
                    password = URLDecoder.decode(cookie.getValue(),"utf-8");
                }
            }
        }
    %>

<br>
用户名：<%=username%><br>
密码：<%=password%>
</body>
</html>
