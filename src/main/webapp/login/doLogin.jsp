<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: Zick
  Date: 2017/7/18
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        request.setCharacterEncoding("utf-8");
        String[] isUserCookie = request.getParameterValues("isUserCookie");
        //存放用户名和密码
        if(isUserCookie != null&& isUserCookie.length>0){
            String name = URLEncoder.encode(request.getParameter("username"),"utf-8");
            String password =URLEncoder.encode(request.getParameter("password"),"utf-8");

            out.println(name);
            out.println(password);
            Cookie usernameCookie = new Cookie("username",name);
            Cookie passwordCookie = new Cookie("password",password);

            usernameCookie.setMaxAge(1011);
            passwordCookie.setMaxAge(1011);
            response.addCookie(usernameCookie);
            response.addCookie(passwordCookie);

        }else {//删除用户名和密码
            out.println("删除");
            Cookie[] cookies = request.getCookies();
            if(cookies!=null&&cookies.length>0){
                for (Cookie cookie: cookies){
                    if(cookie.getName().equals("username") || cookie.getName().equals("password")){
                        out.println("删除");
                        cookie.setMaxAge(0);//设置cookie失效
                        response.addCookie(cookie);//重新保存
                    }
                }
            }
        }
    %>
    <a href="user.jsp">查看用户信息</a>
</body>
</html>
