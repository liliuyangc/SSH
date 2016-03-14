<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liliuyang
  Date: 2016/3/14
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<script type="text/javascript">
  function regist()
  {
    targetForm=document.forms[0];
    targetForm.action="registAction";
  }
</script>
<s:form action="loginAction" method="POST">
  <s:textfield name="username" label="用户名"/><br/>
  <s:password name="password" label="密码"/><br/>
  <s:submit value="登录"/>
  <s:submit value="注册" onclick="regist()"/>
</s:form>

</body>
</html>
