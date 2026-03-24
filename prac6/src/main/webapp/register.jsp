<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Register</title>
</head>
<body>

<h2>Student Registration</h2>

<s:form action="register">

    <s:textfield name="student.name" label="Name"/>
    <s:textfield name="student.email" label="Email"/>

    <s:select name="student.course"
              label="Course"
              list="{'Java','Python','Web Development'}"/>

    <s:submit value="Register"/>

</s:form>

</body>
</html>