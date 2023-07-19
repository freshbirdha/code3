<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023/07/16
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="login.action" method="post">
    <div>
        <label>用户名:</label>
        <input type="text" name="userName">
        <!--在页面中使用s标签显示验证信息!-->
        <font color="red"><s:fielderror fieldName="userName"/></font>
    </div>
    <div>
        <label>密码:</label>
        <input type="password" name="password">
        <font color="red"><s:fielderror fieldName="password"/></font>
    </div>
    <div>
        <input type="submit" value="登录">
    </div>
</form>

</body>
</html>
