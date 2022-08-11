package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter( "username" );
        String password = request.getParameter( "password" );
        if ( username == null ) username = "";
        if ( password == null ) password = "";
        
        HttpSession session = request.getSession( true );
        session.setAttribute( "username", username );
        session.setAttribute( "password", password );
        
        request.getRequestDispatcher( "/Login.jsp" ).forward( request, response );
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	 String username = request.getParameter( "username" );
         String password = request.getParameter( "password" );

        HttpSession session = request.getSession( true );
        session.setAttribute( "username", username );
        session.setAttribute( "password", password );

        System.out.println( "in the doPost" );
        
        
        if ( username.equals( "omar" ) && password.equals( "123" ) ) {
            session.setAttribute( "isConnected", true );
            request.getRequestDispatcher( "/Connected.jsp" ).forward( request, response );
        } else {
            session.setAttribute( "isConnected", false );
            request.getRequestDispatcher( "/Login.jsp" ).forward( request, response );
        }
    }

}
