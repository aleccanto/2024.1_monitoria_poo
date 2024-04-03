package m03;

public class Pessoa {

	private String nome;
	protected String cpf;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		if (cpf != null && cpf.length() == 13) {
			this.cpf = cpf;
		}
		System.out.println("CPF inválido!");
	}

}
