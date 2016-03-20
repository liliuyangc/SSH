<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/20
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:form action="login">
  <s:textfield name="user" label="用户"/>
  <tr>
    <td colspan="2"><s:submit value="转换" theme="simple"/>
      <s:reset value="重填" theme="simple"/></td>
  </tr>
</s:form>
<s:fielderror/>
</body>
</html>
