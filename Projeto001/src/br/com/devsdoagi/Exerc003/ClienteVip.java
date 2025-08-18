package br.com.devsdoagi.Exerc003;

/* BLOCO DE ENCAPSULAMENTO */

    /*
    3. Cliente VIP (Setor Financeiro)
    Crie a classe ClienteVip com os atributos privados:
    nome (String), cpf (String), limiteCredito (double)


    - [X] Implemente os métodos get e set, validando que:
         1. o limite de crédito deve estar entre R$ 1.000,00 e R$ 100.000,00
         2. crie o método exibirCliente() para mostrar os dados de forma formatada.
    */

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito){
        if(limiteCredito >= 1000 && limiteCredito <= 10000){
            this.limiteCredito = limiteCredito;
        } else {
            System.out.println("Crédito fora dos limites estabelecidos.");
        }
    }

    public void exibirCliente(){
        System.out.println("Olá, " + getNome() + "!");
        System.out.println(getCpf());
        System.out.println("Limite atual de crédito: " + getLimiteCredito());
    }
}
