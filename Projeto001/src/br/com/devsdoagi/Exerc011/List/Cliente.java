package br.com.devsdoagi.Exerc011.List;

/* Classe voltada para Atvd006 */

public class Cliente {
    private String nome;
    private double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
