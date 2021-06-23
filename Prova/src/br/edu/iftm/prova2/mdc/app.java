// 5 - Escreva um programa recurso que encontre máximo divisor comum (mdc) de dois inteiros.

package br.edu.iftm.prova2.mdc;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        System.out.println("Exercicio 5: ");

        MDC mdc = new MDC();
        Scanner leia = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = leia.nextInt();

        System.out.printf("O valor do MDC é: %d", mdc.mdc(valor1, valor2));
    }
}
