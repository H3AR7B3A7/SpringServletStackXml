<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2>Login</h2>

<form action="old_jump_page" method="post">
    <label for="username"> Login:
        <input type="text" name="username" id="username">
    </label><br>
    <label for="password"> Password:
        <input type="text" name="password" id="password">
    </label><br>
    <input type="submit" value="Login">
</form>

</body>
