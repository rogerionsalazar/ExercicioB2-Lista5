package br.com.Javabásico.Lista05;

import java.util.Scanner;
//6. Lista de chamada com iniciais. Ler o nome completo de 4 alunos e mostrar cada nome
//com suas iniciais.
//Array: os 4 nomes
//Função: String gerarIniciais(String nomeCompleto) (dica: split(" "))
//Procedimento: exibirChamada(String[] nomes)
//Exemplo: 1. maria da silva (M.D.S.)
public class Exercicio06 {

    static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().split(" ");
        String iniciais = "";
        for (int i = 0; i < partes.length; i++) {
            if (partes[i].length() > 0) {
                iniciais = iniciais + Character.toUpperCase(partes[i].charAt(0)) + ".";
            }
        }
        return iniciais;
    }

    static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome completo do aluno " + (i + 1) + ":");
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);
    }
}