//1 - Escreva um programa usando uma Fila, que simule a brincadeira da “Batata Quente”. 
//A brincadeira consiste de um grupo de crianças que ficam em círculo, sentados ou em pé. 
//E uma criança fica fora da roda, de costa ou com os olhos vendados, dizendo a frase: “Batata quente, 
//quente, quente … queimou” Enquanto isso, os demais vão passando uma bola de mão em mão até ouvirem a 
//palavra “queimou”. Quem estiver com a bola nesse momento sai da roda. Ganha o último que sobrar.

package br.edu.iftm.prova2.fila;

import java.util.Random;

public class app {

    public static void main(String[] args) {

        System.out.println("Exercicio 1 :");

        Fila<Integer> fila = new Fila<>();

        for (int i = 0; i < 10; i++) {
            fila.enfileirar(i);
        }

        Random aleatorio = new Random();
        int num = 0;
        while (num == 0) {
            num = aleatorio.nextInt(10);
        }

        System.out.println("Numero = " + num);

        while (fila.tamanho() > 1) {
            for (int i = 0; i < num; i++) {
                fila.enfileirar(fila.desenfileira());
            }
            System.out.println("Eliminado: " + fila.desenfileira());
        }

        System.out.println("Ganhador: " + fila.desenfileira());
    }

}
