<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<form action="hello.action" method="post">
    <div>
        <label>用户名:</label>
        <input type="text" name="userName">
    </div>

    <div>
        <input type="submit" value="登录">
    </div>
</form>

<hr>
<a href="date.jsp">测试日期类型转换</a>

<hr>
<s:set var="username" value="'李四'" scope="request"/>
<h2>用户名:<s:property value="#username"/></h2>
<h2>用户名:<s:property value="#request.username"/></h2>
</body>
</html>