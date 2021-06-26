//De acordo com o que aprendemos sobre árvore binária de pesquisa, apresente os valores de saída 
//da árvore abaixo de acordo com o percurso: preordem, inordem e posordem

package br.edu.iftm.arvore;

public class arvoreBinaria {
    public static void main(String[] args) {

        System.out.println("Exercicio 3\n");

        System.out.println("PreOrder: ");
        System.out.print("8, 4, 2, 1, 3, 6, 5, 12, 10, 11, 14, 13, 15\n\n");

        System.out.println("InOrder: ");
        System.out.print("1, 2, 3, 4, 5, 6, 8, 10, 11, 12, 13, 14, 15\n\n");

        System.out.println("PosOrder: ");
        System.out.print("1, 3, 2, 5, 6, 4, 11, 10, 13, 15, 14, 12, 8");
        System.out.println();

    }

}
