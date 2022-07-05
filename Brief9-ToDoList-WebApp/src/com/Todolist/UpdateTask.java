package com.Todolist;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Task;
import model.dao.TaskDAO;

import java.io.IOException;

/**
 * Servlet implementation class UpdateTask
 */
public class UpdateTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TaskDAO taskDao = new TaskDAO();
	   

    public void init() {
    	taskDao = new TaskDAO();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	     String Title = request.getParameter("Title");
	        String Description = request.getParameter("Description");
	        String Status = request.getParameter("Status");
	        String Deadline = request.getParameter("Deadline");
	        String Category = request.getParameter("Category");
	        

	 

	        Task task = new Task();
	        task.setTitle(Title);
	        task.setDescription(Description);
	        task.setDeadline(Deadline);
	        task.setStatus(Status);
	        task.setCategory(Category);
        
	        try {
	        	taskDao.update(task);
	            System.out.println("Task Updated successfuly");
	            response.sendRedirect("TasksDashboard.jsp");
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            System.out.println("ERROR");

	        }
		
		doGet(request, response);
	}

}
