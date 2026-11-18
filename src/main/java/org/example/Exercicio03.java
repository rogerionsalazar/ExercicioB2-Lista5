package br.com.Javabásico.Lista05;

import java.util.Scanner;
//3. Números primos. Ler 8 números inteiros e mostrar só os que são primos. Primo é maior
//que 1 e só divide por 1 e por ele mesmo.
//Array: os 8 números
//Função: boolean ehPrimo(int numero)
//Procedimento: exibirPrimos(int[] numeros)
//Exemplo: entrada 4 7 9 11 1 13 20 2 → Primos: 7 11 13 2
public class Exercicio03 {

    static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void exibirPrimos(int[] numeros) {
        System.out.print("Primos:");
        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.print(" " + numeros[i]);
            }
        }
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        exibirPrimos(numeros);
    }
}