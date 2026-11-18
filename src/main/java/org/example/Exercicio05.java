package br.com.Javabásico.Lista05;

import java.util.Scanner;
//5. Contar vogais. Ler 3 palavras ou frases e mostrar quantas vogais cada uma tem, sem
//diferenciar maiúscula de minúscula.
//Array: as 3 frases
//Função: int contarVogais(String texto)
//Procedimento: exibirContagem(String[] frases)
//Exemplo: Programacao → 5 vogais
public class Exercicio05 {

    static int contarVogais(String texto) {
        String vogais = "aeiouáéíóúâêôãõà";
        texto = texto.toLowerCase();
        int quantidade = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) >= 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    static void exibirContagem(String[] frases) {
        for (int i = 0; i < frases.length; i++) {
            System.out.println(frases[i] + " → " + contarVogais(frases[i]) + " vogais");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.println("Digite a palavra ou frase " + (i + 1) + ":");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);
    }
}