package br.com.Javabásico.Lista05;
//8. Sorteio da Mega-Sena. Sortear 6 números de 1 a 60 sem repetir nenhum e mostrar o
//resultado. Para sortear use (int) (Math.random() * 60) + 1.
//Array: os 6 números sorteados
//Função: int[] sortear(int quantidade, int maximo) e boolean contem(int[]
//numeros, int valor)
//Procedimento: exibir(int[] numeros)
//Exemplo: Números sorteados: 5 12 38 29 7 3
public class Exercicio08 {

    static boolean contem(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return true;
            }
        }
        return false;
    }

    static int[] sortear(int quantidade, int maximo) {
        int[] numeros = new int[quantidade];
        int preenchidos = 0;

        while (preenchidos < quantidade) {
            int sorteado = (int) (Math.random() * maximo) + 1;
            if (!contem(numeros, sorteado)) {
                numeros[preenchidos] = sorteado;
                preenchidos++;
            }
        }
        return numeros;
    }

    static void exibir(int[] numeros) {
        System.out.print("Números sorteados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println();
    }

    static void main() {
        int[] numeros = sortear(6, 60);
        exibir(numeros);
    }
}
