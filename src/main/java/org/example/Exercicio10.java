package br.com.Javabásico.Lista05;

import java.util.Scanner;
//10. Torre de Hanói. São 3 pinos (A, B e C) e discos de tamanhos diferentes no pino A. É
//preciso levar todos para o pino C, movendo um disco por vez e sem nunca colocar um
//disco maior sobre um menor. Ler a quantidade de discos de 3 jogos e mostrar os
//movimentos de cada jogo e o total de movimentos.
//Array: a quantidade de discos dos 3 jogos
//Função: int contarMovimentos(int discos) recursiva
//Procedimento: hanoi(int n, char origem, char destino, char auxiliar) recursivo
//Exemplo: 2 discos → Mover disco 1 de A para B · Mover disco 2 de A para C · Mover
//disco 1 de B para C · Total: 3 movimentos
public class Exercicio10 {

    static int contarMovimentos(int discos) {
        if (discos == 0) {
            return 0;
        }
        return 2 * contarMovimentos(discos - 1) + 1;
    }

    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }
        hanoi(n - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        hanoi(n - 1, auxiliar, destino, origem);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] jogos = new int[3];

        for (int i = 0; i < jogos.length; i++) {
            System.out.println("Digite a quantidade de discos do jogo " + (i + 1) + ":");
            jogos[i] = sc.nextInt();
        }

        for (int i = 0; i < jogos.length; i++) {
            System.out.println("Jogo " + (i + 1) + ":");
            hanoi(jogos[i], 'A', 'C', 'B');
            System.out.println("Total: " + contarMovimentos(jogos[i]) + " movimentos");
        }
    }
}