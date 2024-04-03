package m01;

import m02.Pessoa;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hello, World!");

		// byte, short, int e long - inteiros, ex: 10, 1000, 4990
		byte b = 10;
		short s = 100;
		int i = 1000;
		long j = 10000;

		// char - letra, ex: c, b, d = 'c'
		char c = 'c';

		// String - texto, ex: "meu texto aqui";
		String str = "abc_10";

		// Boolean - true (verdadeiro) ou false (falso)
		boolean f = false;
		boolean t = true;

		// Flutuantes - Real
		float fl = 10.0f;
		double d = 10.0;

//		Operadores aritimeticos

//		Soma +
//		Subtração -
//		Divisão /
//		Multiplicação *

		int soma = 10 + 10; // 20
		int subtracao = 10 - 10; // 0
		double divisao = 10.0 / 10.0; // 1.0
		double multiplicacao = 10.0 * 10.0; // 100.0

//		++
//		--

//		soma = soma + 1;
		soma++;

		soma--;

//		soma = soma * 10;
		soma *= 10;

//		Operadores lógicos

//		> maior que
//		< menor que
//		== comparação
//		>= maior ou igual que
//		<= menor ou igual que

		boolean verdadeiro = 30 > 10; // true;

		boolean falso = 30 < 10; // falso;

		boolean resultado = 30 <= 10; // falso;

		boolean resultado2 = 30 < 30; // falso;

		boolean resultado3 = 30 <= 30; // verdadeiro;

		// Laços
		for (int index = 0; index <= 100; index++) {
//			System.out.println("Index: " + index);
		}

		boolean continua = true;
		while (continua) {
			double randomico = Math.random();
			continua = randomico < 0.5;
			System.out.println("Número " + randomico);
		}
		System.out.println("Número maior que 0,5!");

		////////////////////////////////////////////////

		do {
			double randomico = Math.random();
			continua = randomico < 0.5;
			System.out.println("Número " + randomico);
		} while (continua);
		System.out.println("Número maior que 0,5!");

		// Condicionais - IF - ELSE

		if (20 < 10) {
			System.out.println("Condição atendida!");
		} else {
			System.out.println("Condição não atendida!");
		}

//		IF - ELSE IF - ELSE
		if (20 < 10) {
			System.out.println("Condição atendida!");
		} else if (20 < 30) {
			System.out.println("Segunda condição atendida!");
		} else {
			System.out.println("Condição não atendida!");
		}
		
//		Switch
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Pessoa p = new Pessoa();
//		
//		p.idade = 19;
//		p.nome = "Nome";
		
		
		
		
		
		
		
		
		
		
		
	}
}
