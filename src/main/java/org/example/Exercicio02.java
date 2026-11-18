package br.com.Javabásico.Lista05;

import java.util.Scanner;
//2. Número ao contrário. Ler 5 números inteiros positivos e mostrar cada um com os
//dígitos invertidos.
//Array: os 5 números
//Função: int inverterNumero(int numero) (dica: use % 10 e / 10)
//Procedimento: exibirInvertidos(int[] numeros)
//Exemplo: 123 ao contrário: 321
public class Exercicio02 {

    static int inverterNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero = numero / 10;
        }
        return invertido;
    }

    static void exibirInvertidos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ao contrário: " + inverterNumero(numeros[i]));
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        exibirInvertidos(numeros);
    }
}
