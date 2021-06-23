// 4 - Escreva um programa que trate o seguinte menu:

//Empilhar elemento
//Desempilhar elemento
//Mostrar o topo
//Imprimir tudo zerando a pilha
//Sair

package br.edu.iftm.prova2.pilha;

import java.util.Scanner;
import java.util.Stack;

public class app {
    public static void main(String[] args) {

        System.out.println("Exercicio 4: ");

        Scanner leia = new Scanner(System.in);

        int valor = 0;
        Stack<Object> pilha = new Stack<>();

        while (valor != 5) {

            System.out.println("1) Empilhar elemento");
            System.out.println("2) Desempilhar elemento");
            System.out.println("3) Mostrar o topo");
            System.out.println("4) Imprimir tudo zerando a pilha");
            System.out.println("5) Sair");

            System.out.print("\nDigite uma das opções acima: ");
            valor = leia.nextInt();
            System.out.println();

            switch (valor) {
                case 1:
                    Scanner empilhar = new Scanner(System.in);
                    System.out.print("Digite o valor para empilhar: ");
                    Object empilharValor = empilhar.nextLine();
                    pilha.add(empilharValor);
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia");
                    } else {
                        pilha.remove(pilha.lastElement());
                        System.out.println("Elemente removido.");
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia");
                    } else {
                        System.out.println("O topo da pilha é: " + pilha.lastElement());
                    }
                    break;
                case 4:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha já esta vazia");
                    } else {
                        System.out.println("A pilha criada foi: " + pilha);
                        pilha.clear();
                        System.out.println("A pilha foi zerada " + pilha);
                    }

                    break;
                case 5:
                    System.out.println("A pilha criada foi: " + pilha);
                    System.out.println("Você saiu do programa!");
                    break;
            }

            System.out.println("--------------------------------");

        }

    }

}
