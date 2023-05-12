<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Please enter your Details  </h2>

<br>
<br>


<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <br><br>
    Wich car do you want?

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <form:options items="${employee.departmens}"/>
    Foreign language(s)?
   <form:checkboxes path="languages" items="${employee.languages}"/>
    <br>
    phoneNumber <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    Email? <form:input path="email"/>
    <form:errors path="email"/>




</form:select>
<br><br>
    <input type="submit" value="ok">
</form:form>

</body>

</html>