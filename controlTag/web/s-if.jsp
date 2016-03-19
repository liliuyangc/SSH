<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/19
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<!-- 在Stack Context中定义一个age属性，其值为29 -->
<s:set name="age" value="29"/>
<!-- 如果Stack Context中的age属性大于60 -->
<s:if test="#age>60">
  老年人
</s:if>
<!-- 如果Stack Context中的age属性大于35 -->
<s:elseif test="#age>35">
  中年人
</s:elseif>
<!-- 如果Stack Context中的age属性大于15 -->
<s:elseif test="#age>15">
  青年人
</s:elseif>
<s:else>
  少年
</s:else>
</body>
</html>
