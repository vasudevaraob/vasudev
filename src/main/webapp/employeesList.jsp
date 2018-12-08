<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>All Employees</title>
</head>
<body>
<h1>List Employees</h1>
<h3><a href="addEmployee">Add More Employee</a></h3>
<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
			<th>Employee Deptno</th>
			<th>Actions on Row</th>
		</tr>
<c:if test="${!empty employees}">
	
		<c:forEach items="${employees}" var="employee">
			<tr>
		 		<td><c:out value="${employee.empid}"/></td>
				<td><c:out value="${employee.ename}"/></td>
				<td><c:out value="${employee.salary}"/></td>
				<td><c:out value="${employee.deptno}"/></td>
				<td align="center"><a href="editEmp?id=${employee.empid}">Edit</a> ||| <a href="delete?id=${employee.empid}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>