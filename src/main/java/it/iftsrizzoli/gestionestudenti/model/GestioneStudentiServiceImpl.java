package it.iftsrizzoli.gestionestudenti.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.gestionestudenti.model.domain.Studente;
import it.iftsrizzoli.gestionestudenti.model.domain.StudenteServiceResponse;

/**
 * @author pier Questa classe implementa l'intefaccia
 *         {@link GestioneStudentiService}
 */
public class GestioneStudentiServiceImpl implements GestioneStudentiService {
	private static Logger logger = LoggerFactory.getLogger(GestioneStudentiServiceImpl.class);
	private static List<Studente> studenti = new ArrayList<>();
	static int id = 0;

	/**
	 * Questo medodo consente di salvare un nuovo oggetto di classe {@link Studente}
	 * @return  {@link StudenteServiceResponse}
	 */
	@Override
	public StudenteServiceResponse addStudente(Studente studente) {
		logger.debug("Salvataggio dell'oggetto {}", studente);
		studente.setId(incrementId());
		studenti.add(studente);
		return new StudenteServiceResponse(studente, true);
	}

	/**
	 *@return una lista di oggetti di classe {@link Studente}
	 */
	@Override
	public List<Studente> getAllStudenti() {
		logger.debug("Restituzione della lista di studenti {}", studenti);
		return studenti;
	}

	/**
	 * @return
	 */
	private static int incrementId() {
		id++;
		return id;
	}

}
