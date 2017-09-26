<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/18
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="response.jsp" name="loginForm" method="get">

    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"> </td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td>爱好：</td>
            <td>
                <input type="checkbox" name="favorite" value="read"> 读书
                <input type="checkbox" name="favorite" value="music"> 音乐
                <input type="checkbox" name="favorite" value="movie"> 电影
                <input type="checkbox" name="favorite" value="internet"> 上网
            </td>
        </tr>

        <tr>
            <td colspan="2"> <input type="submit" value="登录"> </td>
        </tr>

    </table>
</form>
    <<a href="request.jsp?username=华为">测试url传参</a>
</body>
</html>
