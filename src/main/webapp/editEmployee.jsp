<html>
  <body>
	<h2>Update Employee Data</h2>
	<form method="POST" action="edit">
	  <table>
		<tr>
		   <td>Employee ID:</td>
		   <td><input type=text   name="empid" value=<%=request.getAttribute("eid")%>  readonly="true"></td>
		</tr>
		<tr>
		   <td>Employee Name:</td>
		   <td><input  type=text   name="ename"></td>
		</tr>
		<tr>
		   <td>Employee Salary:</td>
		   <td><input type=text   name="salary"></td>
		</tr>
		<tr>
		   <td>Employee Deptno:</td>
           <td><input  type=text   name="deptno"></td>
	    </tr>
		<tr>
		   <td colspan="2"><input type="submit" value="Submit"/></td>
		</tr>
	  </table> 
	</form>
  </body>
</html>  