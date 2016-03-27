<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/27
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>下载前的登录页面</title>
</head>
<body>
<h3>下载前的登录页面</h3>
<s:form action="login">
  <s:textfield name="user" label="用户名"/>
  <s:textfield name="pass" label="密码"/>
  <s:submit value="登录"/>
</s:form>
</body>
</html>
