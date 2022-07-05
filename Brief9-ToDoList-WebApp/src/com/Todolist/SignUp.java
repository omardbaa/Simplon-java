package com.Todolist;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import model.dao.UserDAO;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  private  UserDAO userDao; 
	    
	    public void init () {
	    	userDao = new UserDAO();
	    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("SignUp.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	Register(request, response);
		
		//		response.setContentType("text/jsp");
//		
//		
//		PrintWriter printWriter = response.getWriter();
//		String FirstName=request.getParameter("FirstName");
//		String LastName=request.getParameter("LastName");
//		String UserName=request.getParameter("UserName");
//		String PassWord=request.getParameter("PassWord");
//		
//		if (FirstName.isEmpty() || LastName.isEmpty() || UserName.isEmpty() || PassWord.isEmpty()){
//	
//			RequestDispatcher requistDispatcher = request.getRequestDispatcher("/SignUp");
//				printWriter.println("Invalid Rogestration. Please fill all Field.");
//			requistDispatcher.include(request, response);
//			}else {
//		
//		RequestDispatcher requistDispatcher = request.getRequestDispatcher("/SignIn");
//		requistDispatcher.forward(request, response);
//		}
		}
	
	
	
	private void Register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//PrintWriter printWriter = response.getWriter();
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
		String UserName=request.getParameter("UserName");
		String PassWord=request.getParameter("PassWord");
		


		User user = new User();
		user.setFirstName(FirstName);
		user.setLastName(LastName);
		user.setUserName(UserName);
		user.setPassWord(PassWord);

		try {
			boolean result = userDao.create(user);
			if(result == true) {
				request.setAttribute("NOTIFICATION", "User Registered Successfully!");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("SignIn.jsp");
		dispatcher.forward(request, response);
	}
	
	
}
