<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2023/07/17
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table border="1" cellspacing="0" width="1000"align="center">
 <tr>
   <th>编号</th>
   <th>姓名</th>
   <th>性别</th>
   <th>电话</th>
 </tr>

    <%--循环标签,value属性: 循环的集合或数组 --%>
<s:iterator value="userList" var="user"> <%--如果定义了变量名--%>
    <tr>
        <%--<td><s:property value="id"/></td>--%>
        <td>${user.id}</td> <%--可以用变量名user获取属性--%>
        <td><s:property value="userName"/></td> <%--如果是s标签 则直接输出userName,不能用user.userName获取属性--%>
        <td>
            <s:if test="sex==1">男</s:if>
            <s:else>女</s:else>
        </td>
        <%--<td><s:property value="phone"/></td>--%>
        <td>${user.phone}</td>
    </tr>
</s:iterator>
</table>
</body>
</html>
