package br.com.Javabásico.Lista05;

import java.util.Scanner;
//9. Fibonacci recursivo. Ler N de 1 a 30 e mostrar os N primeiros termos da sequência de
//Fibonacci e a soma deles. Cada termo é a soma dos dois anteriores, começando por 0 e 1.
//Array: os N termos
//Função: int fibonacci(int n) recursiva, sem laço, e int somar(int[] termos)
//Procedimento: exibir(int[] termos)
//Exemplo: N = 10 → 0 1 1 2 3 5 8 13 21 34 e soma 88
public class Exercicio09 {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int somar(int[] termos) {
        int soma = 0;
        for (int i = 0; i < termos.length; i++) {
            soma += termos[i];
        }
        return soma;
    }

    static void exibir(int[] termos) {
        for (int i = 0; i < termos.length; i++) {
            System.out.print(termos[i] + " ");
        }
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite N (de 1 a 30):");
            n = sc.nextInt();
        } while (n < 1 || n > 30);

        int[] termos = new int[n];
        for (int i = 0; i < termos.length; i++) {
            termos[i] = fibonacci(i);
        }

        exibir(termos);
        System.out.println("Soma: " + somar(termos));
    }
}