<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hmg/hello.mvc?realname=房晓华&sex=sex&mobile=19866828806&yzm=666666&school=广东理工学院&banji=软工5班&course=软件工程">Hello Servlet</a>

<%--post请求--%>
<br>
<form method="post" action="hmg/hello.mvc">
    <input name="realname" value="房晓华"><br>
    <input name="sex" value="男"><br>
    <input name="mobile" value="19866828806"><br>
    <input name="yzm" value="666666"><br>
    <input name="school" value="广东理工学院"><br>
    <input name="banji" value="软工5班"><br>
    <input name="course" value="软件工程"><br>
    <button>提交</button>
</form>
</body>
</html>