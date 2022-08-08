<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task To Do</title>
</head>
<body>
			
				<form action="UpdateTask" method="post">
				
		

<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
	

				<caption>
					<h2>
						<c:if test="${Task != null}">
            			Edit Task
            		</c:if>
						<c:if test="${Task == null}">
            			Update Task
            		</c:if>
					</h2>
				</caption>

				<c:if test="${Task != null}">
					<input type="hidden" name="Title" value="<c:out value='${Task.Title}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Title</label> <input type="text"
						value="<c:out value='${Task.Title}' />" class="form-control"
						name="Title" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Description</label> <input type="text"
						value="<c:out value='${Task.Description}' />" class="form-control"
						name="Description">
				</fieldset>

<fieldset class="form-group">
    <label for="Status">Status</label>
	<select name="Status"   value="<c:out value='${Task.Status}' />" class="form-control">
	  	 <option value="" disabled selected>Select status</option>
	    <option value="In Progress">In Progress</option>
	    <option value="Done">Done</option>
	    <option value="Not yet">Not yet</option>
  </select>
  </fieldset>

				
				
				  <fieldset class="form-group"> 
    <label for="Category">Category</label>
	 <select name="Category" value="<c:out value='${Task.Category}' />" class="form-control">
	  	      <option value="" disabled selected>Select Category</option>
		      <option value="Brief">Brief</option>
		      <option value="Research">Research</option>
		      <option value="Standby topic">Standby topic</option>
		      <option value="Presentation">Presentation</option>
   </select>
</fieldset>

 <fieldset class="form-group">
     <label>Deadline</label> <input type="date"
      value="<c:out value='${Task.Deadline}' />" class="form-control"
      name="Deadline" required="required">
    </fieldset>

				<button type="submit" class="btn btn-success">Submit</button>
				
				
					</div>
				</div>
		</div>
	</form>



</body>
</html>