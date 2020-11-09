<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2><spring:message code="birthForm"/></h2>

<form:form action="birth" modelAttribute="birthForm" method="POST">
    <spring:message code="id_label"/>
    <form:input path="id"/>&nbsp;&nbsp;
    <form:errors path="id"/><br>
    <spring:message code="name_label"/>
    <form:input path="first"/>&nbsp;&nbsp;
    <form:errors path="first"/><br>
    <spring:message code="last_label"/>
    <form:input path="last"/>&nbsp;&nbsp;
    <form:errors path="last"/><br>
    <spring:message code="birthDay_label"/>
    <form:input path="birthDate"/>&nbsp;&nbsp;
    <form:errors path="birthDate"/><br>
    <spring:message code="birthLocation_label"/>
    <form:input path="birthPlace"/>&nbsp;&nbsp;
    <form:errors path="birthPlace"/><br>
    <form:button><spring:message code="birthAdd"/></form:button>
</form:form>

</body>