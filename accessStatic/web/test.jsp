<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/16
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
访问系统环境变量：<s:property value="@java.lang.System@getenv('JAVA_HOME')"/><br/>
圆周率的值：<s:property value="@java.lang.Math@PI"/>
</body>
</html>
