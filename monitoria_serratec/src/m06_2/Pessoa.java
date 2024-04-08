package m06_2;

public abstract class Pessoa {
	protected String nome;
	protected Integer idade;

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}
