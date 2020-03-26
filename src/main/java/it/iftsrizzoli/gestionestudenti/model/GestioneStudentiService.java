package it.iftsrizzoli.gestionestudenti.model;

import java.util.List;

import it.iftsrizzoli.gestionestudenti.model.domain.Studente;
import it.iftsrizzoli.gestionestudenti.model.domain.StudenteServiceResponse;

/**
 * @author pier
 * 
 *         Questa interfaccia dichiara i metodi per l'implementazione delle
 *         funzionlità richieste:
 *         memorizzare un oggetto di classe @see Studente
 *         restituire una list di oggetti di classe @see Studente
 *
 */
public interface GestioneStudentiService {

	/**
	 * @param studente
	 * @return @see StudenteServiceResponse
	 */
	public StudenteServiceResponse addStudente(Studente studente);

	/**
	 * @return @see List
	 */
	public List<Studente> getAllStudenti();

}
