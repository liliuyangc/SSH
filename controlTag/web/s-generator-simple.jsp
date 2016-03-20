<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/19
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1" width="240">
  <!-- 使用generator标签将指定字符串解析成Iterator集合
      在generator标签内，得到的List集合位于ValueStack顶端 -->
  <s:generator val="'疯狂Java讲义
	,轻量级Java EE企业应用实战,
	经典Java EE企业应用实战'" separator="," var="book">
  <!-- 没有指定迭代哪个集合，直接迭代ValueStack顶端的集合 -->
  <s:iterator value="#book"   status="st">
  <tr <s:if test="#st.odd">
    style="background-color:#bbbbbb"</s:if>>
    <td><s:property/></td>
  </tr>
  </s:iterator>
  </s:generator>
</body>
</html>
