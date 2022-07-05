package com.Todolist;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;
import model.dao.UserDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class SignIn
 */
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private  UserDAO userDao; 
    
    public void init () {
    	userDao = new UserDAO();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("TasksDashboard.jsp");
//		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			LogIn(request, response);
		} catch (ClassNotFoundException | IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}



	private void LogIn(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ClassNotFoundException {
		String UserName=request.getParameter("UserName");
		String PassWord=request.getParameter("PassWord");
		
		User user = new User();
		user.setUserName(UserName);
		user.setPassWord(PassWord);

		try {
			if (userDao.select(user)) {
				System.out.println("Log in Succussfuly.");
				response.sendRedirect("TasksDashboard.jsp");
			} else {
				System.out.println("Log in failed! please try again.");
				response.sendRedirect("SignIn.jsp");
//				HttpSession session = request.getSession();
				// session.setAttribute("user", username);
				// response.sendRedirect("login.jsp");
			}
		} catch (Exception e) {
	
			e.printStackTrace();
		}

	}

}
