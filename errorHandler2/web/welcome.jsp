<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/20
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>转换成功</title>
</head>
<body>
<s:property value="tip"/><br/>
用户名：<s:property value="user.name"/><br/>
年龄：<s:property value="user.age"/><br/>
生日：<s:property value="user.birth"/><br/>
</body>
</html>

