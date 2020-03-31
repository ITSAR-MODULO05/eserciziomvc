package it.iftsrizzoli.gestionestudenti.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.gestionestudenti.model.GestioneStudentiServiceImpl;
import it.iftsrizzoli.gestionestudenti.model.domain.Studente;

/**
 * Servlet implementation class AddStudenteServlet
 */
@WebServlet(urlPatterns = "/add", name = "AddStuenteServlet")
public class AddStudenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(AddStudenteServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudenteServlet() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		GestioneStudentiServiceImpl service = new GestioneStudentiServiceImpl();
		Studente studente = new Studente(request.getParameter("nome"), request.getParameter("cognome"));
		logger.debug("Creato l'oggetto: {} ", studente );
		if (service.addStudente(studente).isResult()) {
			dispatcher = request.getRequestDispatcher("AddStudente.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("AddStudenteError.jsp");
		}
		request.setAttribute("studente", studente);
		dispatcher.forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.debug("Ottenuto l'oggetto: {}",request.getParameter(""));
		
	}

}
