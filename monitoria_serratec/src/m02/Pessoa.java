package m02;

public class Pessoa {

	private String nome;
	private Integer idade;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		if(idade >= 18) {
			this.idade = idade;			
		} else {
			System.out.println("A pessoa deve ter mais de 17 anos.");
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}
