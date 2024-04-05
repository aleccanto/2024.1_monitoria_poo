package m05;

public class Carro extends Automovel {

	@Override
	public int quantidadeDeRodas() {
		return 4;
	}
	
	@Override
	public void acelerar() {
		System.out.println("Carro acelerando!");
		super.acelerar();
	}

}
