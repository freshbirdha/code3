<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023/07/16
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示</title>
</head>
<body>
//输出结果方法 el表达式
<h1>用户名:${userName}</h1>

//struts2标签,不能使用其他的表达式
<h2>用户名:<s:property value="userName"/></h2>
</body>
</html>
