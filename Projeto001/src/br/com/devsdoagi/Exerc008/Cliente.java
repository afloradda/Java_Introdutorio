package br.com.devsdoagi.Exerc008;

/* MINI HACKATON INDIVIDUAL - SISTEMA BANCÁRIO */

    /*
    1. Classe Cliente
    - Atributos privados: nome, cpf.
    - Construtor para inicializar.
    - Métodos getters e setters.
    */


public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
