package br.com.devsdoagi.Exerc014;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SistemaInvestimento {
    Scanner sc = new Scanner(System.in);
    // Atributos
    private Map<String, Cliente> clientes;  // chave = CPF

    // Construtor
    public SistemaInvestimento() {
        clientes = new HashMap<>();
    }

    // Métodos sugeridos
    public void cadastrarCliente(Cliente cliente) {
        // ✅ Adiciona cliente no map, verifica duplicidade de CPF

        if(clientes.containsKey(cliente.getCpf())){
            System.out.println("⚠️ Cliente já cadastrado. Tente novamente.");
        } else {
            clientes.put(cliente.getCpf(), new Cliente(cliente.getNome(), cliente.getCpf(), cliente.getEmail()));
            System.out.println("✅ Cliente cadastrado com sucesso!");
        }

    }

    public Cliente buscarCliente(String cpf) {

        // ✅ Retorna o cliente pelo CPF ou null se não encontrado

        if(clientes.containsKey(cpf)) {
            try {
                return clientes.get(cpf);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            return null;
        }
    }

    public void adicionarInvestimento(String cpf, Investimento inv) {
        // ✅ Busca o cliente e adiciona o investimento
        // ✅ Tratamento de exceção se cliente não encontrado
        if (!clientes.isEmpty()){
            try {
                buscarCliente(cpf).adicionaInvestimento(inv);
                System.out.println("✅ Investimento adicionado com sucesso!");
            } catch (NullPointerException e) {
                System.out.println("⚠️ Cliente não existe! Cadastrar através da opção 1.");
                System.out.println("Erro: " + e);
            }
        } else {
            System.out.println("⚠️ HashMap de clientes vazio! Cadastrar através da opção 1.");
        }


    }

    public void listarInvestimentos(String cpf) {
        // ✅ Lista todos os investimentos de um cliente

        try {
            Cliente cli = buscarCliente(cpf);
            System.out.println("Investimento do cliente: " + cli.getNome());
            for(Investimento investimento : cli.getInvestimentos()){
                System.out.println("Investimentos " + investimento.getTipo() + " -> R$" + investimento.getValor());
            }
        }catch (Exception e) {
            System.out.println("⚠️ Ocorreu um erro ao listar os investimentos: " + e.getMessage());
        }
    }

    public void relatorioGeral() {
        // ✅ Lista todos os clientes e seus totais investidos

        for(Cliente cliente :  clientes.values()){
            System.out.println("Nome: " + cliente.getNome() +" -> CPF: " + cliente.getCpf());

            for(Investimento investimento : cliente.getInvestimentos()){
                System.out.println("Investimentos " + investimento.getTipo() + " -> R$" + investimento.getValor());
            }

            System.out.println("Total investido: R$ " + cliente.getTotalInvestido());
            System.out.println();
        }
    }

}
