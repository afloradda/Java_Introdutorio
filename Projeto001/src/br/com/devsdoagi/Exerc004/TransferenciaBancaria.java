package br.com.devsdoagi.Exerc004;

public class TransferenciaBancaria extends Transacao{
    private String contaOrigem;
    private String contaDestino;

    public TransferenciaBancaria(String id, double valor, String data, String contaOrigem, String contaDestino){
        super(id, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public String resumoTransferenca(){
        return "Transferência de R$" + valor + "de " + this.contaOrigem + " para " + this.contaDestino + ".";
    }
}
