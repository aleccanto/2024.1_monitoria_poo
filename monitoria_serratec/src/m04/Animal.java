package m04;

public class Animal {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void andar() {
		System.out.println("Animal está andando");
	}

	public void alimentar() {
		System.out.println("Animal está se alimentando");
	}

	public void emitirSom() {
		System.out.println("Animal está emitindo um som");
	}
}
