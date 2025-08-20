package br.com.devsdoagi.Exerc005;

public class EmprestimoPessoal extends Emprestimo{

    public EmprestimoPessoal(double valorEmprestado){
        super(valorEmprestado);
    }

    @Override
    public double calcularParcela(int meses){
        return getValorEmprestado() / (2.0 * meses);
    }
}
