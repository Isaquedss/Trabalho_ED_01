package br.edu.iftm.fila.testes;

import br.edu.iftm.fila.classes.Cliente;
import br.edu.iftm.fila.estruturadedados.FilaComPrioridade;

public class PrincipalFilaComPrioridade {

    public static void main(String[] args) {

        FilaComPrioridade<Cliente> fila2 = new FilaComPrioridade<Cliente>();

        System.out.println("Exercicio 2: ");
        System.out.println();
        fila2.enfileirar(new Cliente("Gestante 5 Meses", 2));
        fila2.enfileirar(new Cliente("Vovô", 1));
        fila2.enfileirar(new Cliente("10 Itens", 3));
        fila2.enfileirar(new Cliente("Gestante 10 Meses", 2));
        fila2.enfileirar(new Cliente("Sem prioridade", 4));
        fila2.enfileirar(new Cliente("Vovó", 1));
        fila2.enfileirar(new Cliente("13 Itens", 3));
        System.out.println(fila2);
        System.out.println();
    }

}
