<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: liuyang
  Date: 2016/3/20
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
key为one的用户名：<s:property value="users['one'].name"/><br/>
key为one的秘密:<s:property value="users['one'].pass"/><br/>
key为two的用户名：<s:property value="users['two'].name"/><br/>
key为two的秘密:<s:property value="users['two'].pass"/><br/>
</body>
</html>
