<!DOCTYPE html>
<html>
	<head>

		<meta charset="UTF-8">
		<title> Home Bush Tractors </title>
		<link rel="stylesheet" href="homeCSS.css">
		
	</head>
	
	<body>
	
	<header>
		<nav class="ccsticky-nav">
			<img id="employee" src="/Icons/division.png">
			<h1 id="logo">Bush Tractors</h1>
			<ul>
				<li><a href="#"><img src="/Icons/setting.png"></a></li>
				<li><a href="#"><img src="/Icons/logout.png"></a></li>
			</ul>
				<img id="user" src="/Icons/avatar.png">
				<p class="welcome"> Welcome <br/>BIGDADE</p>
		</nav>
			
	</header>
	
	<div class="container">
			<form method='GET' action='HomeServlet'>
				<table class="styled-table" >
				<thead>
					<tr> 
						<th> First Name </th>
						<th> Last Name </th>
						<th> Email </th>
						<th> Phone number </th>
						<th> Adress </th>
						<th> Salary </th>
						<th> Date of Birth </th>
						<th> Status </th>
						<th> Role </th>
						<th> Actions </th>
					</tr>
				</thead>
				<tbody>
					 <tr>
						<td>Bigdade</td>
						<td>Khadija</td>
						<td>Bigdade@gmail.com</td>
						<td>0611223344</td>
						<td>Lqliaa, Agadir</td>
						<td>10,000 DH </td>
						<td>05-08-2022</td>
						<td>Done</td>
						<td>Done</td>
						<td>
							<div class="form-login">
							<a href="#"><img src="/Icons/Details.png"></a> 
							<a href="#"><img src="/Icons/EDIT.png"></a> 
							<a href="#"><img src="/Icons/delete.png"></a>
							</div>
						</td>
					</tr>
					<tr class="active-row">
						<td>
						<div class="form-login">
							<input type="submit" id="add" value="ADD"/> 
							</div>
						</td>
						<td>_</td>
						<td>_</td>
						<td>_</td>
						<td>_</td>
						<td>_</td>
						<td>_</td>
						<td>_</td>
						<td>_</td>
						<td>_</td>
						
					</tr>
					
				</tbody>
			</table>
			
			</form>
	</div>

	</body>
</html>