<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2><spring:message code="birth"/></h2>

<table>
    <tr>
        <th class="id"><spring:message code="id_label"/></th>
        <th class="first"><spring:message code="name_label"/></th>
        <th class="last"><spring:message code="last_label"/></th>
        <th class="bday"><spring:message code="birthDay_label"/></th>
        <th class="bloc"><spring:message code="birthLocation_label"/></th>
    </tr>

<%--    ${DATA}--%>

</table>

</body>

