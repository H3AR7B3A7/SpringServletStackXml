<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2><spring:message code="upload" arguments="world,beautiful"/></h2>

<form method="POST" action="uploadFile" enctype="multipart/form-data">
    <input type="file" name="file"><br />
    <label for="name-input"> <spring:message code="name_label" arguments="world,beautiful"/>
        <input id="name-input" type="text" name="name">
    </label><br/> <br/>
    <input type="submit" value="<spring:message code="upload" arguments="world,beautiful"/>">
</form>

</body>