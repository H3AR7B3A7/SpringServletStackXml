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

</body>