package m08;

import java.time.LocalDate;

public class IdadeException extends Exception {

	private LocalDate dataNaoAceita;

	public IdadeException(String message, LocalDate dataNaoAceita) {
		super(message);
		this.dataNaoAceita = dataNaoAceita;
	}

	public LocalDate getDataNaoAceita() {
		return dataNaoAceita;
	}

	public void setDataNaoAceita(LocalDate dataNaoAceita) {
		this.dataNaoAceita = dataNaoAceita;
	}
}
