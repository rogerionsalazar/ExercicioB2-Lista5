package br.com.Javabásico.Lista05;

import java.util.Scanner;
//1. Quantidade de dígitos. Ler 5 números inteiros positivos e mostrar quantos dígitos cada
//um tem.
//Array: os 5 números
//Função: int contarDigitos(int numero) (dica: divida por 10 até chegar a 0)
//Procedimento: exibirDigitos(int[] numeros)
//Exemplo: 1234 tem 4 dígito(s)
public class Exercicio01 {

    static int contarDigitos(int numero) {
        int quantidade = 0;
        while (numero > 0) {
            numero = numero / 10;
            quantidade++;
        }
        return quantidade;
    }

    static void exibirDigitos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " tem " + contarDigitos(numeros[i]) + " dígito(s)");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        exibirDigitos(numeros);
    }
}