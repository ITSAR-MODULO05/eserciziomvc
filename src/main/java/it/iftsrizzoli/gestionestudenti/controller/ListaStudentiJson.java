package it.iftsrizzoli.gestionestudenti.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import it.iftsrizzoli.gestionestudenti.model.GestioneStudentiServiceImpl;
import it.iftsrizzoli.gestionestudenti.model.domain.Studente;

/**
 * Servlet implementation class ListaStudentiJson
 */
@WebServlet(urlPatterns = "/listStudentiJson", name = "ListStudentiJson")
public class ListaStudentiJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(ListaStudentiJson.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListaStudentiJson() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.debug("Nel metodo service");
		GestioneStudentiServiceImpl service = new GestioneStudentiServiceImpl();
		List<Studente> studenti = service.getAllStudenti();
		logger.debug("Lista studenti {}", studenti);
		String json = new Gson().toJson(studenti);
        //Setto il content type ad "application/json"
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
