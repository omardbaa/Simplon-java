<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html><html>
<head>
<title>Tasks Dashboard</title>
</head>
<body>

	
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">Tasks</h3>
			
			<div class="container text-left">

				<a href="CreateTask.jsp">Create new Task</a>
			</div>
		
			<div class="container text-left">

				<a href="UpdateTask.jsp">Update Task</a>
			</div>
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
				
					<c:forEach var="Task" items="${ListTask}">

						<tr>
							<td><c:out value="${Task.Title}" /></td>
							<td><c:out value="${Task.Description}" /></td>
							<td><c:out value="${Task.Status}" /></td>
							<td><c:out value="${task.Category}" /></td>
							<td><c:out value="${Task.Deadline}" /></td>
							<td><a href="Edit?id=<c:out value="${Task.Title}" />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="Delete?id=<c:out value="${Task.task}"/>">Delete</a></td>
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>