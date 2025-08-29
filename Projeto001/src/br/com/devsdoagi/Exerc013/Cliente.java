package br.com.devsdoagi.Exerc013;

import java.util.Objects;

public class Cliente {
    private int id;
    private final String nome;
    private final String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }
    public String getNome() { return this.nome; }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}
