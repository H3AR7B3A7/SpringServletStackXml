<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
    <title><spring:message code="title"/></title>
    <link href="../../resources/css/style.css" rel="stylesheet" />
</head>
<body>

<h2>Bean scopes</h2>

<h3>Request Object Created:
    ${salaryGrade.date}</h3>
<table>
    <tr>
        <th>Grade level</th>
        <th>Grade rate</th>
    </tr>
    <tr>
        <td>${salaryGrade.grade}</td>
        <td>${salaryGrade.rate}</td>
    </tr>
</table>

<br>

<h3>Session Object created:
    ${education.date}</h3>

<table>
    <tr>
        <th>Course</th>
        <th>Major</th>
        <th>University/College</th>
    </tr>
    <tr>
        <td>${education.degree}</td>
        <td>${education.major}</td>
        <td>${education.institution}</td>
    </tr>
</table>

</body>
