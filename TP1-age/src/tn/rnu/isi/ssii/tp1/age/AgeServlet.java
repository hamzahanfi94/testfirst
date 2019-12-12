package tn.rnu.isi.ssii.tp1.age;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class AgeServlet extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int age = Integer.parseInt(request.getParameter("monage"));
		
		if(age<18)
		{	
		// Forwarder la page adule
		getServletContext().getRequestDispatcher("/mineur.jsp").forward(request, response);
		}
		else
		{	
		// Forwarder la page adule
		getServletContext().getRequestDispatcher("/adulte.jsp").forward(request, response);
		}
	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
