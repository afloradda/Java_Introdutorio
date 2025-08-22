package br.com.devsdoagi.Exerc008;

/* MINI HACKATON INDIVIDUAL - SISTEMA BANCÁRIO */

    /*
    3. Classe Conta (abstrata)
    - Atributos privados: numeroConta, saldo, Cliente titular.
    - Construtor para inicializar.
    - Implementa métodos de depositar e sacar.
    - Método abstrato aplicarJuros().
    */


abstract class Conta implements OperacoesBancarias{
    private String numeroConta;
    private double saldo;
    private Cliente cliente;
    private String titular;

    public Conta(String numeroConta, double saldo, Cliente cliente, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = new Cliente(cliente.getNome(), cliente.getCpf());
        this.titular = titular;
    }

    public Conta(String numeroConta, Cliente cliente, String titular) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if( valor <= 0) {
            System.out.println("Impossivel deposito de números menores ou iguais a zero");
        } else {
            setSaldo(getSaldo() + valor);
        }
    }

    public void sacar(double valor) {
        if(getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("O valor que deseja sacar é maior do que o total atual em conta. Verifique: " + getSaldo());
        }

    }

    public abstract void aplicarJuros();

    // public abstract double aplicarJuros();


}
