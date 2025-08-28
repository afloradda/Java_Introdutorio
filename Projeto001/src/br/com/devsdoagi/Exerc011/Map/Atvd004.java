package br.com.devsdoagi.Exerc011.Map;

    /*
    4. Relatório de Empréstimos
    Um banco armazena os valores dos empréstimos ativos em um Map<String, List<Double>>, onde a chave é o CPF do cliente e o valor é uma lista com os valores das parcelas.

    Métodos sugeridos:
    - void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela) – adiciona uma nova parcela ao cliente.
    - double totalDevedor(Map<String, List<Double>> emprestimos, String cpf) – retorna o total devedor de um cliente.
    - void exibirRelatorioDevedor(Map<String, List<Double>> emprestimos) – exibe o total devedor de todos os clientes.

    */


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Atvd004 {
    public static void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela){
        emprestimos.putIfAbsent(cpf, new ArrayList<>());
        emprestimos.get(cpf).add(valorParcela);
    }

    public static double totalDevedor(Map<String, List<Double>> emprestimos, String cpf){
        double total = 0.0;

        if (emprestimos.containsKey(cpf)){
            List<Double> parcelas = emprestimos.getOrDefault(cpf, List.of());

            for (Double parcela : parcelas) {
                total += parcela;
            }

        }
        return total;
    }

    protected void exibirRelatorioDevedor(Map<String, List<Double>> emprestimos){
        emprestimos.forEach((cpf, parcelas) ->
                System.out.println("CPF " + cpf + " - Total Devedor: R$ " + totalDevedor(emprestimos, cpf))
        );
    }

    public static void main(String[] args) {

    }

}
