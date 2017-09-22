<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<label >写下你的内容</label>
<div>
    <textarea name="a" class="content">这里写内容${current_user.username}</textarea>

</div>
<div align="center">
    <button class="annouuce" >发布</button>
    <button class="home" >首页</button>
</div>
</body>
<script type="text/javascript" src="js/jq.js"></script>
<script type="text/javascript">


    $(".annouuce").on("click",function () {
        $.ajax({
            url: '/release',
            type: 'get',
            datatype:'json',
//            xhrFields:{withCredentials:true},
            data: {
                userId: getCookie("user_id"),
                content: $(".content").val(),
                support: 0,
                degrade: 0,
                title: getCookie("title"),
            },
            success:function(data){
                console.log(getCookie("user_id"));
                if(!data.status){
                    window.location.href='zhihu.html';
                }
            },
            error:function(jqXHR){
                alert("发生错误:" + jqXHR.status);
            }
        });
    });

    $(".home").on("click",function () {
        window.location.href='/zhihu.html';
    });

    function getCookie(name)
    {
        var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
        if(arr=document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    };
</script>
</html>
