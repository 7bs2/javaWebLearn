
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath}/login" method="post">
            username:<input type="text" name="username"/> <br/>
            password:<input type="password" name="pwd"/> <br/>
            <input type="checkbox" name="nums" value="1"/>1
            <input type="checkbox" name="nums" value="2"/>2
            <input type="checkbox" name="nums" value="3"/>3
            <input type="checkbox" name="nums" value="4"/>4
            <input type="checkbox" name="nums" value="5"/>5
            <br/>
            <input type="submit"/>
        </form>
    </div>
</body>
</html>
