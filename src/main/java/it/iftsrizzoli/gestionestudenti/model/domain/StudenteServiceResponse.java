package it.iftsrizzoli.gestionestudenti.model.domain;

public class StudenteServiceResponse {

	private Studente studente;
	private boolean result;

	/**
	 * @param user
	 * @param result
	 */
	public StudenteServiceResponse(Studente studente, boolean result) {
		this.studente = studente;
		this.result = result;
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "StudenteServiceResponse [studente=" + studente + ", result=" + result + "]";
	}

}
