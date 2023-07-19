<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023/07/17
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户注册</title>
</head>
<body>
<form method="POST" action="#">

  <div>
    <label>用户名:</label>
    <s:textfield  name="userName"/>
  </div>

 <div>
   <label>密码:</label>
    <s:password name="password"/>
 </div>

  <div>
    <label>电话:</label>
    <s:textfield name="phone"/>
  </div>

  <div>
    <s:submit value="注册"/>
  </div>

</form>
</body>
</html>

