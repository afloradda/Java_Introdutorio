package br.com.devsdoagi.Exerc011.Map;

    /*
    3. Saldo de Clientes
    Armazene os saldos dos clientes em um Map<String, Double>, onde a chave é o número da conta e o valor é o saldo.

    Métodos sugeridos:
    - void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial) – cadastra um cliente.
    - void depositar(Map<String, Double> contas, String numeroConta, double valor) – atualiza o saldo após um depósito.
    - void exibirSaldos(Map<String, Double> contas) – exibe todos os clientes com seus saldos.

    */

import java.util.Map;

public class Atvd003 {
    public static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial){
        try {
            System.out.println("Adicionando conta: " + numeroConta);
            contas.put(numeroConta, saldoInicial);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double saldoInicial) {
        if (!contas.isEmpty()){
            try {
                contas.put(numeroConta, contas.getOrDefault(numeroConta, 0.0) + saldoInicial);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Map vazio, favor adicionar elementos chamando a função 'adicionarCliente()'");
        }

    }

    public static void exibirSaldos(Map<String, Double> contas){
        if(contas.isEmpty()){
            System.out.println("Map vazio, favor adicionar elementos chamando a função 'adicionarCliente()'");
        } else {
            System.out.println("Segue as contas listadas em Map: ");
            contas.forEach((conta, saldo) -> System.out.println("- Número Conta: " + conta + "| Saldo: " + saldo));
        }
    }

    public static void main(String[] args) {

    }
}
