package m05;

public interface Veiculo {
	void movimentar(Integer distancia);
	
	Boolean estaSeMovimentando();

	void acelerar();

	void freiar();
	
	void parar();
}
