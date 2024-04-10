package m08;

import java.time.LocalDate;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("");
		try {
			pessoa.setDataNascimento(LocalDate.now());
		} catch (IdadeException e) {
			System.out.println(e.getMessage());
			System.out.println("A data de nascimento deve ser inferior a " + e.getDataNaoAceita());
		}
	}
}