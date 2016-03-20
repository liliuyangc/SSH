<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/19
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:append var="newList">
  <s:param value="{'haha','heihei','hehe'}"/>
  <s:param value="{'www.baidu.com','www.google.com'}"/>
</s:append>
<table border="1" width="260">
  <s:iterator value="#newList" status="st" id="ele">
    <tr>
      <td><s:property value="#st.count"/> </td>
      <td><s:property value="ele"/> </td>
    </tr>
  </s:iterator>
</table>
</body>
</html>
