<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/18
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<script type="text/javascript">



</script>

<%
    request.setCharacterEncoding("utf-8");
    String username="";
    String password="";
    Cookie[] cookies = request.getCookies();
    if(cookies!=null&&cookies.length>0){
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



<form action="doLogin.jsp" name="loginForm" method="post">

    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" value=""/> </td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" value=""/></td>
        </tr>

        <tr>
            <td><input type="checkbox" name="isUserCookie" checked="false"/> 十天内记住我的登录状态</td>

        </tr>

        <tr>
            <td colspan="1"> <input type="submit" value="登录"/> </td>

        </tr>

    </table>
</form>

<%--<td colspan="1"> <input type="submit" value="登录" id="login" onclick="<%=add(10,10)%>"> </td>--%>
</body>
</html>
