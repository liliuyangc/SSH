<%--
  Created by IntelliJ IDEA.
  User: liliuyang
  Date: 2016/3/14
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
该站的访问次数${applicationScope.counter}<br/>
${sessionScope.user}登录成功<br/>
${requestScope.tip}
</body>
</html>
