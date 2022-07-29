package Controllers;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.PracticaSemanal.domain.Articulo;
import ar.com.PracticaSemanal.services.ArticulosService;
import ar.com.PracticaSemanal.services.exceptions.ServiceException;
import ar.com.PracticaSemanal.services.impl.ArticulosServiceImpl;

@WebServlet("/controllers/Menu")
public class Menu extends HttpServlet {

	private static final long serialVersionUID = -1735765050480723371L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		ArticulosService ar = new ArticulosServiceImpl();
		try {
			Collection<Articulo> list = ar.findAll();			
			request.setAttribute("articulos", list);
			//OK
			getServletContext().getRequestDispatcher("/listado.jsp").forward(request, response);
		} catch (ServiceException e) {
			//FAIL
			getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
		}
	
	}
}