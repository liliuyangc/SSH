<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/13
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:form action="login">
  用户名：<s:textfield name="userName"/><br/>
  密码<s:password name="passWord"/><br/>
  <s:submit value="登录"/>
</s:form>
</body>
</html>
