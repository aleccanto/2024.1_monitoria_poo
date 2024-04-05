package m05;

public class Principal {
	public static void main(String[] args) {

		Veiculo veiculo = new Carro();

		veiculo.movimentar(50);

		if (veiculo.estaSeMovimentando()) {
			System.out.println("O veiculo está se movimentando.");
		} else {
			System.out.println("O veiculo não está se movimentando.");
		}

		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();

		if (veiculo.estaSeMovimentando()) {
			System.out.println("O veiculo está se movimentando.");
		} else {
			System.out.println("O veiculo não está se movimentando.");
		}

		veiculo.freiar();
		veiculo.freiar();

		if (veiculo.estaSeMovimentando()) {
			System.out.println("O veiculo está se movimentando.");
		} else {
			System.out.println("O veiculo não está se movimentando.");
		}

		veiculo.parar();

		if (veiculo.estaSeMovimentando()) {
			System.out.println("O veiculo está se movimentando.");
		} else {
			System.out.println("O veiculo não está se movimentando.");
		}
	}
}
