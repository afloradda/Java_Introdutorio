package br.com.devsdoagi.Exerc013;

import java.util.*;

public class BancoDigitalHackaton {

    private static void cadastrarCliente(Scanner sc) {
        String cpf = null;
        String nome = null;
        String regexCpf = "\\d{3}(?:\\.?|-?)\\d{3}(?:\\.?|-?)\\d{3}(?:\\.?|-?)\\d{2}";
        String regexFormatacaoCpf = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";
        boolean cpfValido = false;
        while (!cpfValido) {
            System.out.print("Informe o nome: ");
            nome = sc.nextLine();
            System.out.print("Informe o CPF: ");
            cpf = sc.nextLine();
            if (cpf.matches(regexCpf)) {
                cpfValido = true;
                cpf = cpf.replaceFirst(regexFormatacaoCpf, "$1.$2.$3-$4");
            } else System.out.println("O CPF deve conter 11 dígitos.");
        }
        Cliente c = new Cliente(nome, cpf);
        if (!clientes.add(c)) {
            System.out.println("Cliente já existe!");
        } else {
            clientes.add(c);
            System.out.println("Cliente cadastrado!");
        }
        // Dica: pedir nome e CPF, criar objeto Cliente
        // ✅ Adicionar no Set de clientes
        // ✅ Garantir que CPF não esteja duplicado (Set já ajuda nisso)
    }

    private static void cadastrarConta(Scanner sc) {
        // Dica: solicitar CPF do cliente
        // Verificar se cliente existe no Set
        // Criar Conta e adicionar no Map de contas usando numeroConta como chave
        System.out.println("Digite o cpf: ");
        String cpf = sc.nextLine();

        boolean existe = false;

        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                existe = true;
                System.out.println("CPF encontrado!");
                break;
            }
        }
        //codigo

    }

    private static void deposito(Scanner sc) {
        // Dica: solicitar número da conta e valor
        // Verificar se conta existe
        // Adicionar valor ao saldo da conta
        // Registrar transação no extrato da conta
    }

    private static void saque(Scanner sc) {
        // Dica: solicitar número da conta e valor
        // Verificar saldo suficiente
        // Subtrair valor do saldo
        // Registrar transação no extrato da conta
    }

    private static void transferencia(Scanner sc) {
        int contaOrigem = 0;
        int contaDestino = 0;
        double valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            try {
                System.out.print("Informe o número da conta de origem: ");
                contaOrigem = sc.nextInt();
                if (!contas.containsKey(contaOrigem)) {
                    System.out.println("Conta não encontrada!");
                    break;
                }
                System.out.print("Informe o número da conta de destino: ");
                contaDestino = sc.nextInt();
                if (!contas.containsKey(contaDestino)) {
                    System.out.println("Conta não encontrada!");
                    break;
                }
                System.out.print("Informe o valor da transferência: ");
                valor = sc.nextDouble();
                valorValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida!");
                sc.nextLine();
            }
        }
        Transacoes t = new Transacoes("transferência", valor, contaOrigem, contaDestino);
        System.out.println("Transferência realizada!");
        // Dica: solicitar conta origem, conta destino e valor
        // Verificar saldo na conta origem
        // Atualizar saldos de ambas as contas
        // Registrar transação em ambas contas
    }

    private static void consultarSaldo(Scanner sc) {
        // Dica: solicitar número da conta
        // Exibir saldo atual
    }

    private static void extrato(Scanner sc) {
        String numeroConta;
        System.out.print("Informe o número da conta: ");
        numeroConta = sc.nextLine();
        contas.get(numeroConta).mostrarExtrato();
        // Dica: solicitar número da conta
        // Listar todas as transações registradas na conta
    }

    private static void listarClientes() {
        clientes.forEach(System.out::println);
        // Dica: percorrer Set de clientes e exibir informações
    }

    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;
        int opcao;

        while (rodando) {
            System.out.println("\n=== MENU BANCO DIGITAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("5 - Transferência");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Extrato");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    cadastrarCliente(sc);
                    break;
                case 2:
                    cadastrarConta(sc);
                    break;
                case 3:
                    deposito(sc);
                    break;
                case 4:
                    saque(sc);
                    break;
                case 5:
                    transferencia(sc);
                    break;
                case 6:
                    consultarSaldo(sc);
                    break;
                case 7:
                    extrato(sc);
                    break;
                case 8:
                    listarClientes();
                    break;
                case 9:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();

    }
}
