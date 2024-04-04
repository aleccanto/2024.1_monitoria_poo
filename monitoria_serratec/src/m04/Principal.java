package m04;

public class Principal {
	public static void main(String[] args) {

//		Animal animal = new Animal();
//		Gato gato = new Gato();
//
//		System.out.println("\n/////////// Animal //////////////");
//
//		animal.andar();
//		animal.alimentar();
//		animal.emitirSom();
//
//		System.out.println("\n/////////// Gato //////////////");
//
//		gato.andar();
//		gato.alimentar();
//		gato.emitirSom();

		Animal gato = new Gato();

		gato.andar();
		gato.alimentar();
		gato.emitirSom();

		((Gato) gato).atacar();
	}
}
