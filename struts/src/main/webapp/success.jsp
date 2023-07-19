<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023/07/17
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆成功</title>
</head>
<body>
<h1>欢迎${sessionScope.loginUser}登陆成功</h1>
<h2>生日: ${birthday}</h2>
<h3>生日: <s:property value="birhtday"/> </h3>
<h4>生日: <s:date name="birthday" format="yyyy-mm-dd"/> </h4>
</body>
</html>
