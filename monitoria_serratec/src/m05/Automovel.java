package m05;

public abstract class Automovel implements Veiculo {

	protected double velocidade;
	protected int distanciaAPercorrer;

	@Override
	public void movimentar(Integer distancia) {
		this.distanciaAPercorrer = distancia;
	}

	@Override
	public void acelerar() {
		this.velocidade += 10;
	}

	@Override
	public void freiar() {
		this.velocidade -= 10;
		if (this.velocidade < 0) {
			this.velocidade = 0;
		}
	}

	@Override
	public void parar() {
		this.velocidade = 0;
	}

	@Override
	public Boolean estaSeMovimentando() {
		return this.velocidade > 0;
	}
	
	public abstract int quantidadeDeRodas();

}
