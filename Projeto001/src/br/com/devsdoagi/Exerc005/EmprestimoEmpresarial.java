package br.com.devsdoagi.Exerc005;

public class EmprestimoEmpresarial extends Emprestimo {

    public EmprestimoEmpresarial(double valorEmprestado) {
        super(valorEmprestado);
    }

    @Override
    public double calcularParcela(int meses) {
        return super.calcularParcela((meses * 1) + 100) ;
    }
}
