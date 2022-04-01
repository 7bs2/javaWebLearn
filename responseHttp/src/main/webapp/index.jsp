<html>
<body>
<h2>Hello World!</h2>
<%--  --%>
<form action="${pageContext.request.contextPath}/req" method="get">
    username:<input type="text" name="username"/> <br/>
    password:<input type="password" name="password"/> <br/>
    <input type="submit"/>
</form>
</body>
</html>
