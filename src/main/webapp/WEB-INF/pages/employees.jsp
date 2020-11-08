<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2><spring:message code="emp"/></h2>

<table>
    <tr>
        <th class="first"><spring:message code="name_label"/></th>
        <th class="last"><spring:message code="last_label"/></th>
        <th class="position"><spring:message code="pos_label"/></th>
        <th class="email"><spring:message code="mail_label"/></th>
    </tr>

    ${DATA}

</table>

</body>
