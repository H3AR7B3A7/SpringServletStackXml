<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2><spring:message code="content-header" arguments="world,beautiful"/></h2>

<form action="simple" method="get">
    <input class="btn" type="submit" value="<spring:message code="get_button"/>">
</form>

<form action="simple" method="post">
    <input class="btn" type="submit" value="<spring:message code="post_button"/>">
</form>

<form action="upload" method="get">
    <input class="btn" type="submit" value="<spring:message code="upload_button"/>">
</form>

<form action="employee" method="get">
    <input class="btn" type="submit" value="<spring:message code="empForm_button"/>">
</form>

<form action="birth" method="get">
    <input class="btn" type="submit" value="<spring:message code="birthForm_button"/>">
</form>

<form action="salgrade1" method="get">
    <input class="btn" type="submit" value="Redirect">
</form>

<form action="old_login" method="get">
    <input class="btn" type="submit" value="Flash Attributes Old">
</form>

<form action="new_login" method="get">
    <input class="btn" type="submit" value="Flash Attributes New">
</form>

</body>