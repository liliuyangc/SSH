<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/20
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:property value="tip"/><br/>
用户名为:<s:property value="user.name"/><br/>
密码为：<s:property value="user.pass"/><br/>
</body>
</html>
