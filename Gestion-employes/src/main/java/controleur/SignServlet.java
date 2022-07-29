package controleur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import dao.DaoAdministrateur;


public class SignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/Sign.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		String page = "/WEB-INF/JSP/Sign.jsp";
		
		DaoAdministrateur admin = new DaoAdministrateur();
		boolean login = admin.logIn(email, password);
		
		if(login==true) {
			page = "/WEB-INF/JSP/Home.jsp";
		}else {
			PrintWriter out = response.getWriter();
			out.println("user not found!!");
			page = "/WEB-INF/JSP/Sign.jsp";
		}
		request.getRequestDispatcher(page).include(request, response);
		
		
	}

}
