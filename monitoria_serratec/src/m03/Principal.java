package m03;

public class Principal {
	public static void main(String[] args) {

//		Pessoa maria = new Pessoa();
//		maria.setNome("Maria");
//		maria.setCpf("1232231322");
//
//		Pessoa joao = new Pessoa();
//		joao.setNome("João");
//		joao.setCpf("12123292921");

		Cliente maria = new Cliente();
		maria.setNome("Maria");
		maria.setCpf("1232231322");
		maria.setCredito(1000.0);

		Funcionario joao = new Funcionario();
		joao.setNome("João");
		joao.setCpf("12123292921");
		joao.setMatricula("123456");

	}
}
