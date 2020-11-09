<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2><spring:message code="empForm"/></h2>

<form:form action="employee" modelAttribute="employeeForm" method="POST">
    <spring:message code="name_label"/>
        <form:input path="first"/>&nbsp;&nbsp;
        <form:errors path="first"/><br>
    <spring:message code="last_label"/>
        <form:input path="last"/>&nbsp;&nbsp;
        <form:errors path="last"/><br>
    <spring:message code="pos_label"/>
        <form:input path="position"/>&nbsp;&nbsp;
        <form:errors path="position"/><br>
    <spring:message code="mail_label"/>
        <form:input path="email"/>&nbsp;&nbsp;
        <form:errors path="email"/><br>
    <form:button><spring:message code="empAdd"/></form:button>
</form:form>

</body>