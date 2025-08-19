package br.com.devsdoagi.Exerc004;

public class ContaCorrente extends ContaBancaria{
    public double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial){
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;

    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean sacarComChequeEspecial(double valor){
        if(valor <= getSaldo() + limiteChequeEspecial){
            setSaldo((getSaldo() + limiteChequeEspecial) - valor);
            return true;
        } else {
            return false;
        }
    }
}
