<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/9/9
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${requestScope.seven}" var="list">
    ID : ${list.cid}
    城市名称 : ${list.cname}
    省份名称 : ${list.cproid.pname}<br>
</c:forEach>
</body>
</html>
