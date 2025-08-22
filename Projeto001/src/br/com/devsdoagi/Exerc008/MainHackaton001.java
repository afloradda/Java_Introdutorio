package br.com.devsdoagi.Exerc008;

public class MainHackaton001 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ana Julia de Carvalho Leandro", "1234-56781/45");

        ContaCorrente cc = new ContaCorrente("9800.000.444", 1180.90, c1, "Ana Julia");
        ContaPoupanca cp = new ContaPoupanca("000.000.111", 2000.70, c1, "Ana Julia C.");

        System.out.println("-----------------------------------------------------");
        System.out.println("Saldo Atual Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Atual Conta Poupança: " + cp.getSaldo());
        System.out.println("-----------------------------------------------------");
        System.out.println(" ");

        cc.depositar(35.00);
        cp.sacar(38.50);

        System.out.println("---------------APÓS-OPERAÇÕES-BANCARIAS--------------");
        System.out.println("Saldo Atual Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Atual Conta Poupança: " + cp.getSaldo());
        System.out.println("-----------------------------------------------------");
        System.out.println(" ");

        cc.aplicarJuros();
        cp.aplicarJuros();

    }
}
