<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/19
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:append var="newList">
  <s:param value="#{'疯狂Java讲义':'李刚',
		'轻量级Java EE企业应用实战':'李刚',
		'经典Java EE企业应用实战':'李刚'}" />
  <s:param value="#{'http://www.crazyit.org',
		'http://blog.crazyit.org'}" />
</s:append>
<table border="1" width="280">
  <!-- 使用iterator迭代newList集合 -->
  <s:iterator value="#newList" status="st">
  <tr <s:if test="#st.odd">
    style="background-color:#b
    bbbbb"</s:if>>
    <td><s:property value="key"/></td>
    <td><s:property value="value"/></td>
  </tr>
  </s:iterator>
</body>
</html>
