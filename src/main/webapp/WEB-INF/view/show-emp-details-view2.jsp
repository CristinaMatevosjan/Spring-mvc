<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee,you are Welcome!</h2>

<br>
<br>

<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}

<br>
Your surname: ${employee.surname}

<br>
Your salary: ${employee.salary}

<br>
Your department: ${employee.department}
<br>
Your car brand: ${employee.carBrand}
<br>
Language(s)?
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>
<br>
phoneNumber ${employee.phoneNumber}

</body>

</html>