package m05;

public class Moto extends Automovel {

	@Override
	public int quantidadeDeRodas() {
		return 2;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto acelerando!");
		super.acelerar();
	}

}
