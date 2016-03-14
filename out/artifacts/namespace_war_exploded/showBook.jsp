<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liliuyang
  Date: 2016/3/14
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<s:iterator value="books" status="index">
  <s:if test="#index.odd == true">
    <tr style="background-color:#cccccc">
  </s:if>
  <s:else>
    <tr>
  </s:else>
  <td>书名</td>
  <td><s:property/></td>
  </tr>
</s:iterator>
</body>
</html>
