<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/15
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
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
      <td><input type="submit" value="登录"/><input type="reset" value="重填" /></td>
    </tr>
  </table>
</form>
</body>
</html>
