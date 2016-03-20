<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/19
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<!-- 使用generator将一个字符串解析成一个集合
	，指定了var和count属性 -->
<s:generator val="'疯狂Java讲义
	,轻量级Java EE企业应用实战,
	经典Java EE企业应用实战'" separator=","
             var="books" count="2"/>
<table border="1" width="300">
  <!-- 迭代输出Stack Congtext中的books集合 -->
  <s:iterator value="#books">
    <tr>
      <td><s:property/></td>
    </tr>
  </s:iterator>
</table>
${requestScope.books}
</body>
</html>
