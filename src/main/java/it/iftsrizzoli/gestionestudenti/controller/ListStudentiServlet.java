package it.iftsrizzoli.gestionestudenti.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.gestionestudenti.model.GestioneStudentiServiceImpl;
import it.iftsrizzoli.gestionestudenti.model.domain.Studente;

/**
 * Servlet implementation class ListStudentiServlet
 */
@WebServlet(urlPatterns = "/listStudenti", name = "ListStudentiServlet")
public class ListStudentiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(ListStudentiServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudentiServlet() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("Nel metodo service");
		RequestDispatcher dispatcher = null;
		GestioneStudentiServiceImpl service = new GestioneStudentiServiceImpl();
		List<Studente> studenti = service.getAllStudenti();
		logger.debug("Lista studenti {}",studenti);
		HttpSession session = request.getSession();
		session.setAttribute("studenti", studenti);
		dispatcher = request.getRequestDispatcher("ListStudenti.jsp");
		dispatcher.forward(request, response);
	}

}
