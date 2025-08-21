package br.com.devsdoagi.Exerc007;

public class EmprestimoPessoal extends Emprestimo {

    public EmprestimoPessoal(double valor, double taxaJuros) {
        super(valor, taxaJuros);
    }

    @Override
    public double calcularParcela(int meses) {
        return (valor * (1 + getTaxaJuros() * meses)) / meses;
    }
}
