/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!*/

package atividades;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Criação do Set para armazenar os inteiros
		Set<Integer> numeros = new HashSet<>();

		// Inicialização do Set com 10 valores inteiros
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um número inteiro: ");
			int numeroDigitado = leia.nextInt();        	
			numeros.add(i);
		}

		// Scanner para ler a entrada do usuário

		System.out.println("Digite um número para ser encontrado: ");
		int numeroDigitado2 = leia.nextInt();

		// Verifica se o número digitado está no Set
		if (numeros.contains(numeroDigitado2)) {
			System.out.println("Número " + numeroDigitado2 + " Encontrado!");
		} else {
			System.out.println("O número " + numeroDigitado2 + " não foi encontrado!");
		}

		// Fecha o scanner
		leia.close();


	}

}
