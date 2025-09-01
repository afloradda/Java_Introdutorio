package br.com.devsdoagi.Exerc014;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    // Atributos
    private String nome;
    private String cpf;
    private String email;
    private List<Investimento> investimentos;

    // Construtor
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.investimentos = new ArrayList<>();
    }

    // Métodos sugeridos
    public void adicionaInvestimento(Investimento inv) {
        investimentos.add(inv);
    }

    public double getTotalInvestido() {
        double total = 0;
        for(Investimento inv : investimentos){
            total += inv.getValor();
        }
        return total;
    }

    // Getters
    public String getNome() { return this.nome; }
    public String getCpf() { return this.cpf; }
    public String getEmail() { return this.email; }
    public List<Investimento> getInvestimentos() { return investimentos; }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", investimentos=" + investimentos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
