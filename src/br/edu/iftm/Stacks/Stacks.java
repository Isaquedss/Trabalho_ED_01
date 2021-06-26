//1 - Usando a classe Pilha ou Stack, desenvolva um algoritmo que resolva o 
//quebra cabeça Torre de Hanoi;
package br.edu.iftm.Stacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<Integer> partida = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        partida.push(3);
        partida.push(2);
        partida.push(1);

        torreDeHanoi(partida.size(), partida, destino, auxiliar);
    }

    public static void torreDeHanoi(int n, Stack<Integer> partida, Stack<Integer> destino, Stack<Integer> auxiliar) {
        if (n > 0) {
            torreDeHanoi(n - 1, partida, auxiliar, destino);
            destino.push(partida.pop());
            System.out.println();
            System.out.println("Partida: " + partida);
            System.out.println("Destido: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreDeHanoi(n - 1, auxiliar, destino, partida);
        }
    }

}
