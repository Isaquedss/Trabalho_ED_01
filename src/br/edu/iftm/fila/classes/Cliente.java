package br.edu.iftm.fila.classes;

public class Cliente implements Comparable<Cliente> {

    private String nome;
    private int prioridade;

    public Cliente() {

    }

    public Cliente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Cliente " + nome;
    }

    @Override
    public int compareTo(Cliente o) {
        if (this.prioridade > o.getPrioridade()) {
            return 1;
        } else if (this.prioridade < o.getPrioridade()) {
            return -1;
        } else {
            return 0;
        }

    }
}