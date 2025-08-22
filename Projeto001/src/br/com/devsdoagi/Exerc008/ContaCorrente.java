package br.com.devsdoagi.Exerc008;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numeroConta, double saldo, Cliente cliente, String titular) {
        super(numeroConta, saldo, cliente, titular);
    }

    @Override
    public void depositar(double valor) {
        if( valor <= 0) {
            System.out.println("Impossivel deposito em conta corrente de números menores ou iguais a zero");
        } else {
            setSaldo(getSaldo() + valor);
        }
    }

    @Override
    public void sacar(double valor) {
        if(getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("O valor que deseja sacar é maior do que o total atual em conta corrente. Verifique: " + getSaldo());
        }
    }

    @Override
    public void aplicarJuros(){
        System.out.println("Aplicando Juros...");
    }

}
