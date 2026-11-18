package org.example;

import java.util.Scanner;

public class EXEC01_quantidadedigito {

    public static int contarDigitos(int numero) {
            int contador = 0;
            while (numero > 0) {
                contador++;
                numero /= 10;
            }
            return contador;
        }

        public static void exibirDigitos(int[] numeros) {
            for (int numero : numeros) {
                System.out.println(numero + " tem "
                        + contarDigitos(numero)
                        + " dígito(s)");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[5];

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número: ");
                numeros[i] = sc.nextInt();
            }

            exibirDigitos(numeros);
        }
    }
