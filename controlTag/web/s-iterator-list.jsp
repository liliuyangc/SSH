<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/19
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1" width="200">
  <s:iterator value="{'heihei','haha','hehe'}" id="name">
    <tr>
      <td><s:property value="#st.count"/><s:property value="name"/> </td>
    </tr>
  </s:iterator>
</table>
</body>
</html>
