<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liliuyang
  Date: 2016/3/16
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title><s:text name="loginPage"/></title>
</head>
<body>
<s:form action="login">
  <s:textfield name="username" key="user"/>
  <s:password name="password" key="pass"/>
  <s:submit key="login"/>
</s:form>
</body>
</html>
