<%--
  Created by IntelliJ IDEA.
  User: 18921
  Date: 2019/12/4
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ServletMethod" method="get">
    用户名:<input type="text" name="uname" value=""><br>
    密码:<input type="text" name="pwd" value=""><br>
    爱好:<br>
    <input type="checkbox" name="fav" value="1">唱歌<br>
    <input type="checkbox" name="fav" value="2">跳舞<br>
    <input type="checkbox" name="fav" value="3">游泳<br>

    <input type="submit" value="登录"><br>
    <input type="text" value="重置" >
</form>
</body>
</html>
