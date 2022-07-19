<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html><html>
<head>
<title>Tasks Dashboard</title>
</head>
<body>
<header>
	<nav class="navbar navbar-expand-md navbar-dark"
		style="background-color: #6F859D">
		<div>
			<h2 class="navbar-brand"> Dashboard<h2>
			
		</div>
	</nav>
</header>

	<div class="row">

		<div class="container">
			<h3 class="text-center">TASK TO DO </h3>
			
			<div class="container text-left">
				<a href="CreateTask.jsp">Create new Task</a>
			</div>
			
			<div class="container text-left">
				<a href="UpdateTask.jsp">Update Task</a>
			</div>
		
			<br>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						
						<th>Title</th>
						<th>Description</th>
						<th>Status</th>
						<th>Category</th>
						<th>Deadline</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="task" items="${ListTask}">

						<tr>
							<td><c:out value="${task.Title}" /></td>
							<td><c:out value="${task.Description}" /></td>
							<td><c:out value="${task.Status}" /></td>
							<td><c:out value="${task.Category}" /></td>
							<td><c:out value="${task.Deadline}" /></td>
							<td><a href="Edit?Title=<c:out value="${task.Title}" />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="Delete?Title=<c:out value="${task.Title}"/>">Delete</a></td>
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
	
	<jsp:include page="/Footer.jsp"></jsp:include>
</body>
</html>