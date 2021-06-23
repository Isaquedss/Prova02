//2 - Escreva uma programa que testa se uma sequência de caracteres fornecida pelo usuário é uma 
//palíndromo, ou seja, é uma palavra que ao lermos ela ao contrário, e tem o as mesma escrita da 
//palavra na sequencia normal.

package br.edu.iftm.prova2.palindromo;

import java.util.Scanner;

public class palindromo1 {
    public static void main(String[] args) {

        System.out.println("Exercicio 2: ");

        Scanner leia = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Digite alguma palavra ou digite 'sair' para encerrar: ");
            valor = leia.next();
            resultadoImpresso(valor);
        }
    }

    public static void resultadoImpresso(String palavra) {
        System.out.println(palavra + " é palindromo? " + palindromoTeste(palavra));
    }

    public static String palindromoTeste(String palavra) {

        Pilha<Character> pilha = new Pilha<Character>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));

        }
        String palavraInversa = "";
        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return "sim";
        }

        return "não";
    }

}
