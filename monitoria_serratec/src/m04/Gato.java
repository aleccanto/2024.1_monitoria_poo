package m04;

public class Gato extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Gato está miando");
	}

	@Override
	public void andar() {
		System.out.println("Gato está andando");
	}

	@Override
	public void alimentar() {
		System.out.println("Gato está se alimentando");
	}
	
	public void atacar() {
		System.out.println("Gato está atacando");
	}

}
