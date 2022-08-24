package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.question;

import java.io.IOException;

import dao.QuestionDao;

/**
 * Servlet implementation class Question
 */
public class Question extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	QuestionDao questionDao = new QuestionDao();
	   

    public void init() {
    	questionDao = new QuestionDao();
    }
	
	
    public Question() {
        super();
        }
        // TODO Auto-generated constructor stub
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		 String Question = request.getParameter("Question");
		 String Option1 = request.getParameter("Option1");
		 String Option2 = request.getParameter("Option2");
		 String Option3 = request.getParameter("Option3");
		 String Option4 = request.getParameter("Option4");
		 String Annswer = request.getParameter("Annswer");
	
	      
	        question Qestion = new question();
	        Qestion.setOption1(Option1);
	        Qestion.setOption2(Option2);
	        Qestion.setOption3(Option3);
	        Qestion.setOption4(Option4);
	        Qestion.setAnswer(Annswer);
	       
	        
	        try {
	        	questionDao.create(Qestion);
	            System.out.println("question added successfuly");
	            response.sendRedirect("index.jsp");
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("ERROR");

	        }
		
		
		doGet(request, response);
	}

}
