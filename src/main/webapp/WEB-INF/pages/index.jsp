<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2><spring:message code="content-header" arguments="world,beautiful"/></h2>

<form action="simple" method="get">
    <input class="btn" type="submit" value="SIMPLE GET">
</form>

<form action="simple" method="post">
    <input class="btn" type="submit" value="SIMPLE POST">
</form>

</body>