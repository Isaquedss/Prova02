package br.edu.iftm.prova2.fibonacci;

import java.util.Scanner;

// 3 - Escreva um programa utilizando recorrência que gere a sequência fibonacci de acordo com 
//tamanho informado pelo usuário.

import jdk.jshell.execution.Util;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Exercicio 3:");

        System.out.print("Informe o tamanho do fibonacci: ");

        Scanner leia = new Scanner(System.in);

        int valor = leia.nextInt();

        for (int i = 0; i < valor; i++) {
            System.out.print(" " + Recorrencia.fibonacci(i));
        }
        System.out.println("\n");
    }
}
