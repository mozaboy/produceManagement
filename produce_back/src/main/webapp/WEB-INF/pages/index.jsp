<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/16
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="js/jquery-3.0.0.js" type="text/javascript"></script>
<head>
    <title>生产管理系统</title>
</head>
<body>
<body>
    <h2>测试结果是:</h2>
    <input type="text" value="${str}"/>

    <a href="#" id="test">点击这里</a>
    <span id="thisSpan"><span>
</body>
</body>
</html>

<script type="text/javascript">

$(function(){

    $("#test").click(function(){

        $.ajax({
            url:"test.do",
            type:"post",
            data:{name:'Jay'},
            dataType:"json",
            success:function(data){
                alert(data.name);
            }  ,
            error : function() {
                alert("异常！");
            }
        })

    });
});


</script>
