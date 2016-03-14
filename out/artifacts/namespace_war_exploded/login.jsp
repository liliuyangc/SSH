<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liliuyang
  Date: 2016/3/14
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:form action="logina">
  <s:textfield name="username" label="用户名"/>
  <s:password name="password" label="密码"/>
  <s:submit value="登录"/>
</s:form>
</body>
</html>
