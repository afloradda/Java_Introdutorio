package br.com.devsdoagi.Exerc013;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private List<Transacoes> extrato;

    public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public int getNumero() { return this.numero; }
    public double getSaldo() { return this.saldo; }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {

        if(valor > 0){
            System.out.println("Realizando deposito no valor de: " + valor);
            setSaldo(getSaldo() + valor);
            extrato.add(new Transacoes("Deposito", valor, getNumero(), getNumero()));
        } else {
            System.out.println("Valor solicitado é igual ou menor que zero.");
        }
    }

    public void sacar(double valor) {
        if(valor > getSaldo()) {
            System.out.println("Tentativa de saque com valor maior do que o existente em conta.");
        } else {
            System.out.println("Realizando saque no valor de: " + valor);
            setSaldo(getSaldo() - valor);
            extrato.add(new Transacoes("Saque", valor, getNumero(), getNumero()));
        }
    }

    public void transferir(double valor, Conta destino) {
        if(valor > getSaldo()) {
            System.out.println("Transferencia negada: Valor da transferencia excede limite de saldo atual.");
        } else {
            setSaldo(getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
            extrato.add(new Transacoes("Tranferência", valor, getNumero(), destino.getNumero()));
            System.out.println("Transferência realizada!");
        }
    }

    public void mostrarExtrato(){
        System.out.println("---------------------------");

        for(Transacoes indice : extrato) {
            System.out.println("- " + indice);
            System.out.println("---------------------------");
        }

    }

}
