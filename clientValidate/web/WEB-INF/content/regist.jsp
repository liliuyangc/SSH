<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/21
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

  <title>请输入您的注册信息</title>
  <s:head/>

</head>


<body>
<h2>请输入您的注册信息</h2>
<s:form method="post" action="registPro" validate="true">
  <s:textfield name="name" label="用户名"/>
  <s:textfield name="pass" label="密码"/>
  <s:textfield name="age" label="年龄"/>
  <s:textfield name="birth" label="生日"/>
  <s:submit value="注册"/>
</s:form>

</body>

</html>