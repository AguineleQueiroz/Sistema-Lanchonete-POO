/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolanchonete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que apresenta a interface de interação do sistema da lanchonete.
 * @author Aguinle Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public class Sistema {

    /**
     *  Vetor que armazena os colaboradores que são registrados no sistema.
     */
    private static final Colaborador colaboradores_lista[] = new Colaborador[15];

    /**
     * ArrayList que armazena os produtos que são registrados no sistema.
     */
    private static final ArrayList<Produto> vetor_produto = new ArrayList<>();

    /**
     *  ArrayList que armazena os sanduiches que são registrados no sistema.
     */
    private static final ArrayList<Sanduiche> vetor_sanduiches = new ArrayList<>();

    /**
     *  ArrayList que armazena os clientes que são registrados no sistema.
     */
    private static final ArrayList<Cliente> lista_cliente = new ArrayList<>();

    /**
     *  ArrayList que armazena os pedidos que são registrados no sistema.
     */
    private static final ArrayList<Pedido> lista_pedido = new ArrayList<>();

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        /**
         * Cadastro de Funcionarios para teste.
         */
        colaboradores_lista[0] = new Colaborador("Aguinele Queiroz", "38 9 98427814", ""
                + "Rua das Almas - 1000", "25487936901", "Funcionario", 2000, "123456");
        colaboradores_lista[1] = new Colaborador("Cassia Pires", "38 9 98667888", ""
                + "Rua da Saudade - 75", "12345678901", "Administrador", 2500, "abc254s");
        colaboradores_lista[2] = new Colaborador("João das Neves", "38 9 88659825", ""
                + "Avenida 1º de Maio - 154", "10785274101", "Funcionario", 2000, "a73hgsa1");
        colaboradores_lista[3] = new Colaborador("Luana Oliveira", "38 9 88757847", ""
                + "Avenida Silvio Santos - 50", "10278945601", "Funcionario", 2000, "123456");
        colaboradores_lista[4] = new Colaborador("Paulo Lima", "38 9 94965899", ""
                + "Rua Tres Marias - 203", "16545678901", "Funcionario", 2000, "absc47x5");
        colaboradores_lista[5] = new Colaborador("Geovane dos Santos", "38 9 78945621", ""
                + "Rua 9 de maio - 1510", "12345675201", "Funcionario", 2000, "123456");
        colaboradores_lista[6] = new Colaborador("Brenda Silva", "38 9 12336544", ""
                + "Rua da Saude - 7545", "25487975301", "Funcionario", 2000, "abc254s");
        colaboradores_lista[7] = new Colaborador("Jonathan Orlando", "38 9 11112222", ""
                + "Avenida sem fim - 154", "10785225401", "Funcionario", 2000, "a73hgsa1");
        colaboradores_lista[8] = new Colaborador("Juliana Silveira", "38 9 22223333", ""
                + "Rua 4 de paus - 57", "10278935901", "Funcionario", 2000, "123456");
        colaboradores_lista[9] = new Colaborador("Douglas Lima", "38 9 55554545", ""
                + "Rua Tres de ouro - 23", "15745678901", "Funcionario", 2000, "absc47x5");
        colaboradores_lista[10] = new Colaborador("Samuel Alexandre", "38 9 78789898", ""
                + "Rua Tres de ouro - 851", "35915775901", "Funcionario", 2000, "absc47x5");
        colaboradores_lista[11] = new Colaborador("Julia Pereira", "38 9 42624868", ""
                + "Rua januaria pereira - 426", "10278935901", "Funcionario", 2000, "123456");
        colaboradores_lista[12] = new Colaborador("Sarah Fernandes", "38 9 35958626", ""
                + "Rua De baixo - 4232", "15752575901", "Funcionario", 2000, "absc47x5");
        colaboradores_lista[13] = new Colaborador("Alexandre Junior", "38 9 19989819", ""
                + "Rua Tres de espadas - 7", "68275001401", "Funcionario", 2000, "absc47x5");
        colaboradores_lista[14] = new Colaborador("David Ferreira", "38 9 46654598", ""
                + "Rua Copacabana - 42", "28317845601", "Funcionario", 2000, "absc47x5");
        /**
         * Cadastro prévio de pedidos para teste.
         */
        lista_pedido.add(new Pedido("12345678901", "11/02/2022", "12:45", "13:15", ""
                + "Hamburguer com fritas e refrigerante(coca-cola)2L", 1, "Em preparo", (float) 35.85));

        lista_pedido.add(new Pedido("68275001401", "11/02/2022", "11:45", "12:25", ""
                + "Sanduiche vegano", 4, "Em preparo", (float) 17.00));

        lista_pedido.add(new Pedido("14785236901", "11/02/2022", "12:35", "13:15", ""
                + "Hamburguer Duplo Sem Queijo", 2, "Entregue", (float) 20.45));

        lista_pedido.add(new Pedido("15786231001", "11/02/2022", "13:45", "14:15", ""
                + "X-Tudo Premium", 3, "Enviado", (float) 18.85));
        /**
         * Cadastro de Clientes.
         */
        lista_cliente.add(new Cliente("Aguinele queiroz", "38 9 98427814", "Rua das Almas - 789", ""
                + "12345678901", "X- burguer, Refrigerante 2L, Sanduiche de Pernil"));
        lista_cliente.add(new Cliente("Cassia Pires ", "38 9 98456514", "Rua das Ostras - 741", ""
                + "14785236901", "Sanduiche Vegano, Refrigerante de Limao 1.5L"));
        lista_cliente.add(new Cliente("Pedro Silva", "38 9 88997788", "Rua 3 de paus - 123", ""
                + "35915775901", "Sanduiche de Pernil"));
        lista_cliente.add(new Cliente("Samara Souza", "38 9 25814738", "Rua mil oitavas - 1234", ""
                + "15786231001", "X- burguer"));

        /**
         * Cadastro de Produtos.
         */
        vetor_produto.add(new Produto("Pao", "Pão de Forma", 270, 111, (float) 1.50));
        vetor_produto.add(new Produto("Carne", "Carne moida 1kg", 25, 45, (float) 9.85));
        vetor_produto.add(new Produto("Hamburguer", "Hamburguer Vegetariano 160g", 270, 13, (float) 2.75));
        vetor_produto.add(new Produto("Maionese", "Maionese Chinesa 250g", 100, 32, (float) 3.45));
        vetor_produto.add(new Produto("Copo", "Copo de plástico 400ml", 300, 65, (float) 0.75));

        /**
         * Cadastro de Lanches.
         */
        vetor_sanduiches.add(new Sanduiche(94, "Sanduiche do Gordo", "Pao Doce",
                "Milho Verde, Frango, fritas, bacon, hamburguer, maionese", (float) 12.50));
        vetor_sanduiches.add(new Sanduiche(95, "Sanduiche do Joao", "Pao Quadrado",
                "Milho verde, Peito de Frango, tomate, alface, bacon", (float) 9.85));
        vetor_sanduiches.add(new Sanduiche(96, "Sanduiche vegano", "Pao Redondo",
                "Milho verde, ervilha, tomate, alface", (float) 15.75));
        vetor_sanduiches.add(new Sanduiche(97, "Sanduiche Americano", "Pao de Forma",
                "Salsicha, molho de tomate", (float) 7.45));
        vetor_sanduiches.add(new Sanduiche(98, "Sanduiche de fit", "Pao Integral",
                "Milho verde, Peito de Frango, tomate, alface", (float) 8.75));
        
        // Teste Contador.
        int total_private = Cliente.getContador_private();
        int total_protected = Cliente.contador_protected ;
        System.out.printf("\nQuantidade de clientes [Private]: %d", total_private );
        System.out.printf("\nQuantidade de clientes [Protected]: %d", total_protected, "\n" );
        // Login de Usuarios.
        fazerlogin();
      
    }

    /**
     * Realiza login de usuario. Retorna Menu de chamadas para os usuários de
     * acordo com suas respectivas permissoes de acesso.
     */
    public static void fazerlogin() {
        System.out.println("\n---------- Login ----------\n");
        Scanner sc = new Scanner(System.in);
        String cpf_usuario;
        String senha;
        System.out.println("CPF: ");
        cpf_usuario = sc.nextLine();

        Colaborador login;
        login = new Colaborador();

        // Verifica a existencia de usuario com o CPF informado.
        for (Colaborador colaboradores_lista1 : colaboradores_lista) {
            if (colaboradores_lista1.getCpf().equals(cpf_usuario)) {
                login = colaboradores_lista1;
                Util.Sucesso("CPF encontrado.");
                break;
            }
        }
        // Verifica se a senha informada está correta.
        if (login.getCpf() == null || "".equals(login.getCpf())) {
            Util.Erro("CPF não encontrado, tente novamente.");
            fazerlogin();
        } else {
            System.out.println("Senha: ");
            senha = sc.nextLine();

            if (login.getSenha_usuario().equals(senha)) {
                Util.Sucesso("Senha confirmada");
                // Verifica o cargo do Colaborador e retorna menu de opções relativo a sua permissão de acesso
                if ("Administrador".equals(login.getCargo())) {
                    Util.Notifica("\nBem Vindo, " + login.getNome());
                    Util.Notifica("\nVocê esta logado no sistema como " + login.getCargo());
                    menuAdministrador();
                } else if ("Funcionario".equals(login.getCargo())) {
                    Util.Notifica("\nBem Vindo, " + login.getNome());
                    Util.Notifica("\nVocê esta logado no sistema como " + login.getCargo());
                    menuFuncionario();
                }
            } else {
                Util.Erro("Senha Incorreta! Tente novamente.");
                fazerlogin();
            }
        }
    }

    /**
     * Menu de métodos que exigem privilegios de Funcionário para serem
     * chamados.
     */
    public static void menuFuncionario() {
        Lanchonete func_lanchonete = new Lanchonete();
        Util.Notifica("\n\n************* Sistema Lanchonete v1.0.0 *************");
        System.out.println("\nDigite somente o número da opção desejada:"
                + "\n\n1 - Cadastrar Clientes         7 - Listar Pedidos"
                + "\n2 - Editar Clientes            8 - Listar Pedidos de um cliente"
                + "\n3 - Remover Clientes           9 - Listar Clientes"
                + "\n4 - Cadastrar Pedidos          10 - Alterar Senha"
                + "\n5 - Editar Pedidos             11 - Logout"
                + "\n6 - Remover Pedidos            12 - Encerrar Sistema\n");
        Scanner scan = new Scanner(System.in);
        String opc = scan.nextLine();
        switch (opc) {
            case "1":
                func_lanchonete.cadastrarCliente();
                break;
            case "2":
                func_lanchonete.editarCliente();
                break;
            case "3":
                func_lanchonete.removerCliente();
                break;
            case "4":
                func_lanchonete.cadastrarPedido();
                break;
            case "5":
                func_lanchonete.editarPedido();
                break;
            case "6":
                func_lanchonete.removerPedido();
                break;
            case "7":
                func_lanchonete.ListarPedidos();
                break;
            case "8":
                func_lanchonete.listarPedido();
                break;
            case "9":
                func_lanchonete.listarCliente();
                break;
            case "10":
                Colaborador func = new Colaborador();
                func.alterarSenha();
                break;
            case "11":
                Sistema.fazerlogin();
                break;
            case "12":
                System.out.println((char) 27 + "[31m\nSaindo...\u001B[0m");
                System.out.println((char) 27 + "[31m\nSistema finalizado.\u001B[0m");
                break;
            default:
                System.out.println((char) 27 + "[31m\nOpção invalida\u001B[0m");
        }
    }

    /**
     * Menu de métodos que exigem privilegios de Administrador para serem
     * chamados.
     */
    public static void menuAdministrador() {
        Lanchonete admin_lanchonete = new Lanchonete();
        Util.Notifica("\n\n************* Sistema Lanchonete v1.0.0 *************");
        System.out.println("\nDigite somente o número da opção desejada:"
                + "\n\n1 - Cadastrar Usuarios             9 - Remover Lanches"
                + "\n2 - Editar Usuarios                10 - Listar Colaboradores cadastrados no Sistema"
                + "\n3 - Remover Usuarios               11 - Listar Produtos cadastrados"
                + "\n4 - Cadastrar Produtos             12 - Listar Lanches cadastrados"
                + "\n5 - Editar Produtos                13 - Emitir Relatorio"
                + "\n6 - Remover Produtos               14 - Alterar Senha"
                + "\n7 - Cadastrar Lanches              15 - Logout"
                + "\n8 - Editar Lanches                 16 - Encerrar Sistema\n");
        Scanner scan = new Scanner(System.in);
        String opc = scan.nextLine();
        switch (opc) {
            case "1":
                admin_lanchonete.cadastrarColaborador();
                break;
            case "2":
                admin_lanchonete.editarColaborador();
                break;
            case "3":
                admin_lanchonete.removerColaborador();
                break;
            case "4":
                admin_lanchonete.cadastrarProduto();
                break;
            case "5":
                admin_lanchonete.editarProduto();
                break;
            case "6":
                admin_lanchonete.removerProduto();
                break;
            case "7":
                admin_lanchonete.cadastrarSanduiches();
                break;
            case "8":
                admin_lanchonete.editarSanduiches();
                break;
            case "9":
                admin_lanchonete.removerSanduiches();
                break;
            case "10":
                admin_lanchonete.listarColaboradores();
                break;
            case "11":
                admin_lanchonete.listarProduto();
                break;
            case "12":
                admin_lanchonete.listarSanduiches();
                break;
            case "13":
                System.out.println("Insira a opção desejada: "
                        + "\n\n1 - Relatorio de Clientes"
                        + "\n2 - Relatorio de Pedidos Realizados"
                        + "\n3 - Relatorio de Colaboradores Cadastrados"
                        + "\n4 - Relatorio de Produtos em Estoque"
                        + "\n5 - Fechar\n");
                String opt = scan.nextLine();
                switch (opt) {
                    case "1":
                        admin_lanchonete.relatorioClientes();
                        menuAdministrador();
                        break;
                    case "2":
                        admin_lanchonete.relatorioPedidos();
                        menuAdministrador();
                        break;
                    case "3":
                        admin_lanchonete.relatorioColaboradores();
                        menuAdministrador();
                        break;
                    case "4":
                        admin_lanchonete.relatorioProdutos();
                        menuAdministrador();
                        break;
                    case "5":
                        System.out.println((char) 27 + "[31m\nConcluindo...\u001B[0m");
                        menuAdministrador();
                        break;
                    default:
                        System.out.println((char) 27 + "[31m\nOpção invalida\u001B[0m");
                }
                break;
            case "14":
                Administrador admin = new Administrador();
                admin.alterarSenha();
                break;
            case "15":
                Sistema.fazerlogin();
                break;
            case "16":
                System.out.println((char) 27 + "[31m\nSaindo...\u001B[0m");
                System.out.println((char) 27 + "[31m\nSistema finalizado.\u001B[0m");
                break;
            default:
                System.out.println((char) 27 + "[31m\nOpção invalida\u001B[0m");
        }
    }

    /**
     * Obtém lista de relatorioColaboradores registrados no sistema.
     *
     * @return colaboradores_lista
     */
    public static Colaborador[] getColaboradores_lista() {
        return colaboradores_lista;
    }

    /**
     * Obtém lista de relatorioProdutos registrados no sistema.
     *
     * @return vetor_produto
     */
    public static ArrayList<Produto> getVetor_produto() {
        return vetor_produto;
    }

    /**
     * Obtém lista de sanduiches registrados no sistema.
     *
     * @return vetor_sanduiches
     */
    public static ArrayList<Sanduiche> getVetor_sanduiches() {
        return vetor_sanduiches;
    }

    /**
     * Obtém lista de cliente registrados no sistema.
     *
     * @return lista_cliente
     */
    public static ArrayList<Cliente> getLista_cliente() {
        return lista_cliente;
    }

    /**
     * Obtém lista de relatorioPedidos registrados no sistema.
     *
     * @return lista_pedido
     */
    public static ArrayList<Pedido> getLista_pedido() {
        return lista_pedido;
    }
}
