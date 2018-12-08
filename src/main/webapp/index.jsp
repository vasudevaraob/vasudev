<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:if  test="${message ne null}">
<font color='blue' size=10>    <c:out   value="${message}"/> </font>
</c:if>
<hr>

<center>
  <a  href="addEmployee">Add Employee</a>  <br> <br>
  <a  href="listEmployees">List Employees</a>
</center>
