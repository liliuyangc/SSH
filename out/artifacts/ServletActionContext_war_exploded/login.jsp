<%--
  Created by IntelliJ IDEA.
  User: liliuyang
  Date: 2016/3/14
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<s:form action="login">
  <s:textfield name="userName" label="用户名"/><br/>
  <s:password name="passWord" label="密码"/><br/>
  <s:submit value="登录"/>
</s:form>

</body>
</html>
