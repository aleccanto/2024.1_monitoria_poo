package m08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal2 {
	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(new Pessoa("Maria"));
		pessoas.add(new Pessoa("João"));
		pessoas.add(new Pessoa("Sofia"));
		pessoas.add(new Pessoa("Enzo"));

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}
		
		System.out.println("//////////////////////////////////");

		Set<Pessoa> pessoas2 = new HashSet<>();

		pessoas2.add(new Pessoa("Maria"));
		pessoas2.add(new Pessoa("João"));
		pessoas2.add(new Pessoa("Sofia"));
		pessoas2.add(new Pessoa("Enzo"));

		for (Pessoa pessoa : pessoas2) {
			System.out.println(pessoa.getNome());
		}

	}
}
