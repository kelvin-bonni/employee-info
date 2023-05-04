<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add Employee</title>
    </head>
    <body>
        <c:if test="${addEmployeeSuccess}">
            <div>Successfully added Employee with ID: ${savedEmployee.id}</div>
        </c:if>

        <c:url var="add_employee_url" value="/employee/addEmployee"/>
        <form:form action="${add_employee_url}" method="post" modelAttribute="employee">
            <form:label path="firstName">First Name: </form:label> <form:input type="text" path="firstName"/>
            <form:label path="lastName">Last Name: </form:label> <form:input type="text" path="lastName"/>
            <form:label path="age">Age: </form:label> <form:input path="age"/>
            <input type="submit" value="submit"/>
        </form:form>

        <div class="form-group">
            <a href="/employee-info/employee/viewEmployees">View Employees</a>
        </div>
    </body>
</html>