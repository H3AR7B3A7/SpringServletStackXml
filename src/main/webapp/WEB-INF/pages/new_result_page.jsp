<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2>Result</h2>

User name: ${username} <br>
Password: ${password} <br>
Requested by: ${request}

</body>