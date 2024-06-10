/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
Mostre na tela todas as cores que foram adicionadas. 
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.*/

package atividades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {



		{
			// Criação do ArrayList para armazenar as cores
			ArrayList<String> cores = new ArrayList<>();

			// Scanner para ler a entrada do usuário
			Scanner leia = new Scanner(System.in);

			// Solicita ao usuário que digite 5 cores
			System.out.println("Digite 5 cores:");
			for (int i = 0; i < 5; i++) {
				System.out.print("Cor " + (i + 1) + ": ");
				String cor = leia.nextLine();
				cores.add(cor);
			}

			// Mostra na tela todas as cores que foram adicionadas
			System.out.println("\nCores adicionadas:");
			for (String cor : cores) {
				System.out.println(cor);
			}

			// Ordena as cores em ordem crescente
			Collections.sort(cores);

			// Mostra na tela todas as cores ordenadas em ordem crescente
			System.out.println("\nCores ordenadas em ordem crescente:");
			for (String cor : cores) {
				System.out.println(cor);
			}

			// Fecha o scanner
			leia.close();
		}
	}
}

