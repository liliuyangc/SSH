<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/19
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1" width="240">
  <tr>
    <th>书名</th>
    <th>作者</th>
  </tr>
  <!-- 对指定的Map对象进行迭代输出,并指定status属性 -->
  <s:iterator value="#{'疯狂Java讲义':'李刚',
	'轻量级Java EE企业应用实战':'李刚' ,
	'经典Java EE企业应用实战':'李刚'}"
              id="score" status="st">
  <!-- 根据当前被迭代元素的索引是否为奇数来决定是否使用背景色 -->
  <tr <s:if test="#st.odd">
    style="background-color:#bbbbbb"</s:if>>
    <!-- 输出Map对象里Entry的key -->
    <td><s:property value="key"/></td>
    <!-- 输出Map对象里Entry的value -->
    <td><s:property value="value"/></td>
  </tr>
  </s:iterator>
</body>
</html>
