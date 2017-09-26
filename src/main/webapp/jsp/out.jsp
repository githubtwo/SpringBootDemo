<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/21
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>out内置对象</h1>
    <%
        out.println("helloword");
        out.flush();
//        out.clear();//抛出异常
        out.clearBuffer();
        out.println("bingo");
    %>
    缓冲区大小:<%=out.getBufferSize()%>byte<br>
    缓冲区大小：<%=out.getRemaining()%>byte<br>
    是否自动清空缓冲区:<%=out.isAutoFlush()%><br>


    <form action="/user/login" name="loginForm" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td>
                    <input type="text" name="username">
                </td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr >
                <td colspan="2">
                    <input type="submit" value="登录">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
