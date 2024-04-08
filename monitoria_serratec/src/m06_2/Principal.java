package m06_2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();

		Cliente cliente = new Cliente();
		cliente.setNome("João");
		cliente.setIdade(30);
		cliente.setLogin("joao_123");

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Maria");
		funcionario.setIdade(25);
		funcionario.setMatricula("12344213A");

		pessoas.add(cliente);
		pessoas.add(funcionario);

//		ForEach
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	}
}
