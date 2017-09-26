<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");//解决中文乱码
    request.setAttribute("password","123456");
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>this is my index.jsp 大家好xxx</h1>

    <%
        String b = "fdsa";

        for(int i = 1;i<10;i++){
            String multi = "";
            for(int j = 1;j<=i;j++){
                 multi += "" + j + "*" + i + "=" + j*i + " ";
            }
            multi +="</br>";
            out.print(multi);
        }

    %><br>

    <%! String a = "hello"; //声明变量或者函数
        int add(int x,int y){
            return x+y;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String s = sdf.format(new Date());
    %>

    您好，<%=a %>
    a+b=<%=add(5,10)%>
    <%
        out.println("wo");
    %><br>
    今天是<%=s%>
</body>
</html>