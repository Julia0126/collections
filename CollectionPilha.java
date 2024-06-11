package atividades;

import java.util.Scanner;
import java.util.Stack;

public class CollectionPilha {

    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();
        Scanner leia = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲\n");
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adicionar livro na pilha");
            System.out.println("2: Listar todos os livros");
            System.out.println("3: Retirar livro da pilha");
            System.out.println("0: Sair");
            System.out.println("\n▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro:");
                    String nome = leia.nextLine();
                    pilha.push(nome);
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    listarPilha(pilha);
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        String retirarLivro = pilha.pop();
                        System.out.println("\nO Livro " + retirarLivro + " foi retirado!");
                        listarPilha(pilha);
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

    private static void listarPilha(Stack<String> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("\nA Pilha está vazia!");
        } else {
            System.out.println("\nLista de Livros na Pilha:");
            for (String livro : pilha) {
                System.out.println(livro);
            }
        }
    }
}
