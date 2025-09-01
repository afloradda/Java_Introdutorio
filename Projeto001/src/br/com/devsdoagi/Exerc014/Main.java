package br.com.devsdoagi.Exerc014;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String cpf;
        Scanner sc = new Scanner(System.in);

        SistemaInvestimento sistemaInvestimento = new SistemaInvestimento();

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU CARTEIRA DE INVESTIMENTO ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Adicionar Investimento");
            System.out.println("3 - Listar Investimento de um Cliente");
            System.out.println("4 - Relátorio Geral");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1: Cadastrar Cliente");
                    System.out.println("Digite abixo os atributos para criação do cliente.");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    cpf = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Cliente c = new Cliente(nome, cpf, email);
                    sistemaInvestimento.cadastrarCliente(c);
                    System.out.println("--------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Opção 2: Adicionar Investimento");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Informe seu CPF: ");
                    cpf = sc.nextLine();

                    sistemaInvestimento.buscarCliente(cpf);

                    System.out.println("Qual o tipo de Investimento? Escreva por extenso.");
                    String tipo = sc.nextLine();
                    System.out.println("Qual o valor investido?");
                    double valor = sc.nextDouble();
                    sc.nextLine(); // limpa o \n do buffer

                    Investimento investimento = new Investimento(tipo, valor);
                    sistemaInvestimento.adicionarInvestimento(cpf, investimento);
                    System.out.println("--------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Opção 3: Listar Investimentos de um Cliente");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Informe seu CPF: ");
                    cpf = sc.nextLine();
                    sistemaInvestimento.listarInvestimentos(cpf);
                    System.out.println("--------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Opção 4: Relatório Geral");
                    System.out.println("--------------------------------------------------");
                    sistemaInvestimento.relatorioGeral();
                    System.out.println("--------------------------------------------------");
                    break;
                case 0:
                    System.out.println("Opção 5: Encerrando progrma.");
                    System.out.println("--------------------------------------------------");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();

    }
}
