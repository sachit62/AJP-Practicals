<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Success</title>
</head>
<body>

<h2>Registration Successful 🎉</h2>

<p>Name: <s:property value="student.name"/></p>
<p>Email: <s:property value="student.email"/></p>
<p>Course: <s:property value="student.course"/></p>

</body>
</html>