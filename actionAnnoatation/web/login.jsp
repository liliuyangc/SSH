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
    targetForm.action="regist.action";
  }
</script>
<form action="login.action" method="post">
  <table align="center">
    <caption><h3>用户登录</h3></caption>
    <tr>
      <td>用户名：<input type="text" name="username"/></td>
    </tr>
    <tr>
      <td>密&nbsp;&nbsp;码：<input type="text" name="password"/></td>
    </tr>
    <tr align="center">
      <td><input type="submit" value="登录"/><input type="submit" value="注册" onclick="regist()" /></td>
    </tr>
  </table>
</form>

</body>
</html>
