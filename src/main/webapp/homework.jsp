<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/9/9
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="testController1?id=1&name=max">作业1 基本数据类型+String</a><br>
<a href="testController2?pid=1&pname=内蒙古">作业2 普通类</a><br>
<a href="testController3?cid=1&cname=呼和浩特市&cproid.pid=5&cproid.pname=内蒙古">作业3 普通类有外键</a><br>
<a href="testController4?id=1">作业4 request域传值基本数据类型</a><br>
<a href="testController5?pid=1&pname=内蒙古">作业5 request域传值普通类</a><br>
<a href="testController6?cid=1&cname=呼和浩特市&cproid.pid=5&cproid.pname=内蒙古">作业6 request域传值普通类有外键</a><br>
<a href="testController7">作业7 request域传值普通类有外键</a><br>
<a href="testController8?id=1">作业8 model域传值基本数据类型</a><br>
<a href="testController9?pid=1&pname=内蒙古">作业9 model域传值普通类</a><br>
<a href="testController10?cid=1&cname=呼和浩特市&cproid.pid=5&cproid.pname=内蒙古">作业10 model域传值普通类有外键</a><br>
<a href="testController11">作业11 model域传值普通类有外键</a><br>
<a href="testController12?id=12">作业12 model域传值到另一个Controller并显示</a><br>
<a href="testController13?cid=1&cname=呼和浩特市&cproid.pid=5&cproid.pname=内蒙古">作业13 session域传值普通类有值</a><br>
</body>
</html>
