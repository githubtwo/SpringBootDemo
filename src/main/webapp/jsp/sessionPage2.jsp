<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/18
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>session对象</h1>

    <%
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HH:mm:ss");

        Date date  = new Date(session.getCreationTime());
      //  session.setAttribute("username","admin");
    %>

    Session创建时间:<%=format.format(date)%><br>
    SessionId编号:<%=session.getId()%><br>
    从Session中获取用户名：<%=session.getAttribute("username")%>
    Session中的属性有:<%
                String[] names= session.getValueNames();
                for(int i =0 ;i<names.length;i++){
                    out.println(names[i] + "&nbsp;&nbsp");
                }
    %>


</body>
</html>
