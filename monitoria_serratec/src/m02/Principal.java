package m02;

import java.util.Scanner;

import m03.Cliente;

public class Principal {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Pessoa p1 = new Pessoa();

		System.out.println("Digite o nome da pessoa: ");
		String nome = leia.next();

		System.out.println("Digite a idade da pessoa: ");
		Integer idade = leia.nextInt();
		
		if(idade >= 18) {
			p1.setNome(nome);
			p1.setIdade(idade);
			System.out.println("Os dados da pessoa são:");
			System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.getIdade());			
		} else {
			System.out.println("A pessoa deve ser maior de idade.");
		}
		
		String texto = leia.next();
		Integer inteiro = leia.nextInt();
		Long inteiroGrande = leia.nextLong();
		Double real = leia.nextDouble();
		Float flutuante = leia.nextFloat();
		
		Byte bites = leia.nextByte();

		leia.close();
	}
}
