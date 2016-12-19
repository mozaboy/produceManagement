<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>显示用户列表</title>
</head>
<body>
    <#list persons as person>
        username : ${person.userName}
        password : ${person.userPassword}<br />
    </#list>
</body>
</html>