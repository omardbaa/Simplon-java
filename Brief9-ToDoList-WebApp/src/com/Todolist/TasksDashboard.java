package com.Todolist;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Task;
import model.dao.TaskDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Servlet implementation class TasksDashboard
 */
public class TasksDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	TaskDAO taskDao = new TaskDAO();
	   

    public void init() {
    	taskDao = new TaskDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Action = request.getServletPath();

		try {
			switch (Action) {
			case "/NewTask":
				showNewForm(request, response);
				break;
			case "/Create":
				createTask(request, response);
				break;
			case "/Delete":
				deleteTask(request, response);
				break;
			case "/Edit":
				showEditForm(request, response);
				break;
			case "/Update":
				UpdateTask(request, response);
				break;
			case "/ListTask":
				ListTask(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void ListTask(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Task> ListTask = taskDao.selectAll();
		request.setAttribute("ListTask", ListTask);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ListTask");
		dispatcher.forward(request, response);
		response.sendRedirect("TasksDashboard.jsp");
		
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("CreateTask.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
//		String Title = (request.getParameter("Title"));
//		Task existingTask = taskDao.select(Title);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("TasksDashboard.jsp");
//		request.setAttribute("task", existingTask);
//		dispatcher.forward(request, response);

	}

	private void createTask(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
	     	String Title = request.getParameter("Title");
	        String Description = request.getParameter("Description");
	        String Status = request.getParameter("Status");
	        String Deadline = request.getParameter("Deadline");
	        String Category = request.getParameter("Category");
		Task task = new Task(Title, Description, Status, Deadline, Category);
		taskDao.create(task);
		response.sendRedirect("ListTask");
	}

	private void UpdateTask(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
	     	String Title = request.getParameter("Title");
	        String Description = request.getParameter("Description");
	        String Status = request.getParameter("Status");
	        String Deadline = request.getParameter("Deadline");
	        String Category = request.getParameter("Category");
		Task task = new Task(Title, Description, Status, Deadline, Category);
		taskDao.update(task);
		response.sendRedirect("ListTask");
	}

	private void deleteTask(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		Task task = new Task();
		String Title = request.getParameter("Title");
		taskDao.delete(task);
		response.sendRedirect("ListTask");

	}
}
