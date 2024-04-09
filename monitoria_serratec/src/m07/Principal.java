package m07;

public class Principal {
	public static void main(String[] args) {

//		Erros e listas

		try {
//			Tentativa de executar o código
			String b = null;
			b.chars();
			double a = 100 / 0;
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Não é possível dividir por zero.");
		} catch (NullPointerException nullPointerException) {
			System.out.println("Erro, objeto nulo.");
		} catch (Exception exception) {
//			Caso algum erro seja lançado
			System.out.println("Erro genérico.");
		} finally {
			
		}

		System.out.println("Fora do try_catch");

	}
}
