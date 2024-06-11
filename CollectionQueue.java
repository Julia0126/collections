package atividades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲\n");
			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adicionar cliente na fila");
			System.out.println("2: Listar todos os clientes");
			System.out.println("3: Retirar cliente da fila");
			System.out.println("0: Sair");
			System.out.println("\n▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome:");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado!");
				break;
			case 2:
				listarfila(fila);
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					String retirarcliente = fila.poll();
					System.out.println("\nO Cliente " + retirarcliente + " foi retirado!");
					listarfila(fila);
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (opcao != 0);

		leia.close();
	}

	private static void listarfila(Queue<String> fila) {
		if (fila.isEmpty()) {
			System.out.println("\nA Fila está vazia!");
		}  
			System.out.println("\nLista de clientes na fila:");
			for (String cliente : fila) {
				System.out.println(cliente);
			}
		


	}



}
