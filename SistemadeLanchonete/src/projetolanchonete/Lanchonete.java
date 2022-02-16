/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Aguinele Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public final class Lanchonete {

    /**
     * Métodos de Administrador.
     * Método para cadastro de um colaborador no sistema.
     */
    public  void cadastrarColaborador() {
        System.out.println("\n----------- Cadastro de Usuarios -----------\n");

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < Sistema.getColaboradores_lista().length; i++) {
            try {
                Colaborador novo_colaborador = new Colaborador();

                System.out.println("\nNome completo: ");
                novo_colaborador.setNome(scan.nextLine());

                System.out.println("Telefone: ");
                novo_colaborador.setTelefone(scan.nextLine());

                System.out.println("Endereço: ");
                novo_colaborador.setEndereco(scan.nextLine());

                System.out.println("CPF: ");
                novo_colaborador.setCpf(scan.nextLine());

                System.out.println("Cargo: ");
                novo_colaborador.setCargo(scan.nextLine());

                System.out.println("Salário: ");
                novo_colaborador.setSalario(scan.nextDouble());
                scan.nextLine();

                System.out.println("Senha de Usuario: ");
                novo_colaborador.setSenha_usuario(scan.nextLine());

                Sistema.getColaboradores_lista()[i] = novo_colaborador;
            } catch (Exception excpt) {
                excpt.getMessage();
            }
        }
        Sistema.menuAdministrador();
    }

    /**
     * Método para edição de valores dos atributos de um colaborador cadastrado
     * no sistema.
     */
    public  void editarColaborador() {
        System.out.println("\n----------- Editar Usuario -----------\n");
        Scanner scan = new Scanner(System.in);
        String cpf_informado;
        System.out.println("\nInforme o cpf do cliente: ");
        cpf_informado = scan.nextLine();
        for (Colaborador colaborador : Sistema.getColaboradores_lista()) {
            if (cpf_informado.equals(colaborador.getCpf())) {
                System.out.println(colaborador.toString());
                System.out.println("\nInsira a opção: "
                        + "\n1 - Alterar Telefone "
                        + "\n2 - Alterar Endereço "
                        + "\n3 - Alterar Cargo"
                        + "\n4 - Alterar Salario"
                        + "\n5 - Alterar Senha de Usuario"
                        + "\n6 - fechar\n");
                String opc = scan.nextLine();
                switch (opc) {
                    case "1":
                        String novo_telefone;
                        System.out.println("\nInforme o novo novo_telefone: ");
                        novo_telefone = scan.nextLine();
                        colaborador.setTelefone(novo_telefone);
                        break;
                    case "2":
                        String novo_endereco;
                        System.out.println("\nInforme o novo Endereço: ");
                        novo_endereco = scan.nextLine();
                        colaborador.setEndereco(novo_endereco);
                        break;
                    case "3":
                        String novo_cargo;
                        System.out.println("\nInforme novo Cargo: ");
                        novo_cargo = scan.nextLine();
                        colaborador.setCargo(novo_cargo);
                        break;
                    case "4":
                        Double novo_salario;
                        System.out.println("\nInforme o novo Salario: ");
                        novo_salario = scan.nextDouble();
                        colaborador.setSalario(novo_salario);
                        break;
                    case "5":
                        String nova_senha;
                        System.out.println("\nInforme Nova Senha: ");
                        nova_senha = scan.nextLine();
                        colaborador.setSenha_usuario(nova_senha);
                        break;
                    case "6":
                        break;
                    default:
                        System.out.println((char) 27 + "[31m\nOpção inválida\u001B[0m");
                }
            }
        }
        Sistema.menuAdministrador();
    }

    /**
     * Método para exclusão de um Colaborador dos registros do sistema.
     */
    public  void removerColaborador() {
        System.out.println("\n----------- Excluir Usuario -----------\n");
        Scanner scan = new Scanner(System.in);
        try {
            String cpf_usr;
            System.out.println("CPF do Usuario: ");
            cpf_usr = scan.nextLine();

            for (int usr = 0; usr < Sistema.getColaboradores_lista().length; usr++) {
                if (Sistema.getColaboradores_lista()[usr].getCpf().equals(cpf_usr)) {
                    Sistema.getColaboradores_lista()[usr] = null;
                    break;
                }
            }
            //Verifica se usuario foi removido e retorna notificação
            boolean valor = false;
            for (Colaborador colaboradores : Sistema.getColaboradores_lista()) {
                if (colaboradores.getCpf().equals(cpf_usr)) {
                    valor = true;
                    break;
                }
            }
            if (valor == true) {
                Util.Erro("Usuario Não Removido!");
            } else {
                Util.Sucesso("Usuario removido!");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        Sistema.menuAdministrador();
    }

    /**
     * Método para cadastro de um produto no sistema.
     */
    public  void cadastrarProduto() {
        System.out.println("\n----------- Cadastro de Produtos -----------\n");
        Scanner scan = new Scanner(System.in);
        try {
            Produto produto_info = new Produto();

            System.out.println("Nome: ");
            produto_info.setNome(scan.nextLine());
            scan.reset();
            System.out.println("Descrição: ");
            produto_info.setDescricao(scan.nextLine());
            scan.reset();
            System.out.println("Quantidade do Produto [und]: ");
            produto_info.setQuantidade_produto(scan.nextInt());
            scan.reset();

            System.out.println("Id do produto: ");
            produto_info.setId_produto(scan.nextInt());
            scan.reset();
            System.out.println("Valor: ");
            produto_info.setValor(scan.nextFloat());

            Sistema.getVetor_produto().add(produto_info);
            // verifica se produto foi adicionado ao vetor
            if (Sistema.getVetor_produto().contains(produto_info)) {
                Util.Sucesso("Produto Cadastrado!");
            } else {
                Util.Erro("Produto não foi cadastrado!");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        Sistema.menuAdministrador();
    }

    /**
     * Método para edição de valores dos atributos de um produto cadastrado no
     * sistema.
     */
    public  void editarProduto() {
        System.out.println("\n----------- Editar Produto -----------\n");
        Scanner scan = new Scanner(System.in);
        int id_informado;
        System.out.println("\nInforme o ID do produto: ");
        id_informado = scan.nextInt();
        for (Produto produto : Sistema.getVetor_produto()) {
            if (id_informado == produto.getId_produto()) {
                System.out.println(produto.toString());
                System.out.println("\nInsira a opção: "
                        + "\n1 - Alterar Nome"
                        + "\n2 - Alterar ID do Produto"
                        + "\n3 - Alterar Descrição"
                        + "\n4 - Alterar Quantidade do Produto"
                        + "\n5 - Alterar Valor"
                        + "\n6 - fechar");
                int opc = scan.nextInt();
                switch (opc) {
                    case 1:
                        String novo_nome;
                        System.out.println("\nInforme o novo Nome: ");
                        novo_nome = scan.nextLine();
                        produto.setNome(novo_nome);
                        break;
                    case 2:
                        int novo_id;
                        System.out.println("\nInforme o novo ID do produto: ");
                        novo_id = scan.nextInt();
                        produto.setId_produto(novo_id);
                        break;
                    case 3:
                        String novo_descricao;
                        System.out.println("\nInforme nova descrição: ");
                        novo_descricao = scan.nextLine();
                        produto.setDescricao(novo_descricao);
                        break;
                    case 4:
                        int novo_quantidade_produto;
                        System.out.println("\nInforme o nova Quantidade: ");
                        novo_quantidade_produto = scan.nextInt();
                        produto.setQuantidade_produto(novo_quantidade_produto);
                        break;
                    case 5:
                        float novo_preco;
                        System.out.println("\nInforme Novo Preço: ");
                        novo_preco = scan.nextFloat();
                        produto.setValor((float) novo_preco);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println((char) 27 + "[31m\nOpção inválida\u001B[0m");
                }
            }
        }
        Sistema.menuAdministrador();
    }

    /**
     * Método para exclusão de um produto cadastrado no sistema.
     */
    public  void removerProduto() {
        System.out.println("\n----------- Excluir Produto -----------\n");
        Scanner scan = new Scanner(System.in);
        try {
            boolean teste = false;
            int id_produto;
            System.out.println("ID do Produto: ");
            id_produto = scan.nextInt();
            for (Produto produto_info : Sistema.getVetor_produto()) {
                if (produto_info.getId_produto() == id_produto) {
                    Sistema.getVetor_produto().remove(produto_info);
                    teste = true;
                }
            }
            // verifica se produto foi removido
            if (teste == true) {
                Util.Sucesso("Produto Removido!");
            } else {
                Util.Erro("Produto não foi removido!");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        Sistema.menuAdministrador();
    }

    /**
     * Método para cadastrar sanduiches no sistema da lanchonete.
     */
    public  void cadastrarSanduiches() {
        System.out.println("\n----------- Cadastro de sanduiches ----------\n");
        Scanner scan = new Scanner(System.in);
        try {
            Sanduiche lanche = new Sanduiche();

            System.out.println("ID do Lanche: ");
            lanche.setId(scan.nextInt());
            scan.nextLine();
            System.out.println("Nome do Lanche: ");
            lanche.setNome(scan.nextLine());

            System.out.println("Tipo de pão: ");
            lanche.setTipo_pao(scan.nextLine());

            System.out.println("Recheio: ");
            lanche.setTipo_recheio(scan.nextLine());

            System.out.println("Preço: ");
            lanche.setPreco(scan.nextDouble());

            Sistema.getVetor_sanduiches().add(lanche);

            if (Sistema.getVetor_sanduiches().contains(lanche)) {
                Util.Sucesso("Lanche cadastrado!");
            } else {
                Util.Erro("Não foi possivel cadastrar o Lanche.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        Sistema.menuAdministrador();
    }

    /**
     * Possibilita edição de valores dos atributos de um objeto Sanduiche.
     */
    public  void editarSanduiches() {
        System.out.println("\n----------- Editar Lanche -----------\n");
        Scanner scan = new Scanner(System.in);
        int id_informado;
        System.out.println("\nInforme o ID do Lanche: ");
        id_informado = scan.nextInt();
        for (Sanduiche lanche : Sistema.getVetor_sanduiches()) {
            if (id_informado == lanche.getId()) {
                System.out.println(lanche.toString());
                System.out.println("\nInsira a opção: "
                        + "\n\n1 - Alterar ID: "
                        + "\n2 - Alterar Nome: "
                        + "\n3 - Alterar Tipo de Pão: "
                        + "\n4 - Alterar Tipo de recheio: "
                        + "\n5 - Alterar Preço: "
                        + "\n6 - fechar\n");
                int opc = scan.nextInt();
                switch (opc) {
                    case 1:
                        int novo_id;
                        System.out.println("\nInforme o novo ID do Lanche: ");
                        novo_id = scan.nextInt();
                        lanche.setId(novo_id);
                        break;
                    case 2:
                        String novo_nome;
                        System.out.println("\nInforme o novo Nome: ");
                        novo_nome = scan.nextLine();
                        lanche.setNome(novo_nome);
                        break;
                    case 3:
                        String novo_tipo_pao;
                        System.out.println("\nInforme novo tipo de pão: ");
                        novo_tipo_pao = scan.nextLine();
                        lanche.setTipo_pao(novo_tipo_pao);
                        break;
                    case 4:
                        String novo_recheio;
                        System.out.println("\nInforme o novo Recheio: ");
                        novo_recheio = scan.nextLine();
                        lanche.setTipo_recheio(novo_recheio);
                        break;
                    case 5:
                        double novo_preco;
                        System.out.println("\nInforme Novo Preço: ");
                        novo_preco = scan.nextDouble();
                        lanche.setPreco((float) novo_preco);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println((char) 27 + "[31m\nOpção inválida\u001B[0m");
                }
            }
        }
        Sistema.menuAdministrador();
    }

    /**
     * Possibilita remoção de sanduiches da lista de lanches cadastrados no
     * sistema.
     */
    public  void removerSanduiches() {
        Scanner scan = new Scanner(System.in);
        int id_lanche;
        try {
            boolean teste = false;
            System.out.println("\n ID do lanche: ");
            id_lanche = scan.nextInt();
            for (Sanduiche lanche : Sistema.getVetor_sanduiches()) {
                if (id_lanche == lanche.getId()) {
                    Sistema.getVetor_sanduiches().remove(lanche);
                    teste = true;
                }
            }
            if (teste == true) {
                Util.Sucesso("Lanche Removido!");
            } else {
                Util.Erro("Lanche não foi removido!");
            }
        } catch (Exception excpt) {
            excpt.getStackTrace();
        }
        Sistema.menuAdministrador();
    }

    /**
     * Printa na tela lista de Colaboradores cadastrados no sistema da
     * lanchonete.
     */
    public  void listarColaboradores() {
        System.out.println("\n-------------- Pessoas cadastradas ------------\n");
        for (Colaborador pessoa : Sistema.getColaboradores_lista()) {
            if (pessoa != null) {
                System.out.println(pessoa.toString());
            }
        }
        Sistema.menuAdministrador();
    }

    /**
     * Printa na tela lista de Produtos cadastrados no sistema da lanchonete.
     */
    public  void listarProduto() {
        System.out.println("\n-------------- Produto Cadastrados ------------\n");
        for (Produto produto : Sistema.getVetor_produto()) {
            System.out.println(produto.toString());
        }
        Sistema.menuAdministrador();
    }

    /**
     * Printa na tela lista de sanduiches cadastrados no sistema da lanchonete.
     */
    public  void listarSanduiches() {
        System.out.println("\n-------------- Lanches Cadastrados ------------\n");
        for (Sanduiche lanches : Sistema.getVetor_sanduiches()) {
            System.out.println(lanches.toString());
        }
        Sistema.menuAdministrador();
    }
    
    
    /**
     * Emite relatorio de Clientes da lanchonete registrados no sistema.
     */
    public  void relatorioClientes() {
        try {
            FileWriter fileWriter = new FileWriter("filesjson\\Clientes.json");
            for (Cliente cliente : Sistema.getLista_cliente()) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    String json = gson.toJson(cliente);

                    fileWriter.write(json);
                    fileWriter.write("\n,");
                    fileWriter.flush();

                    System.out.println(json);

                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Lanchonete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Emite relatorio de Pedidos realizados.
     */
    public  void relatorioPedidos() {
        try {
            FileWriter fileWriter = new FileWriter("filesjson\\Pedidos.json");
            for (Pedido pedido : Sistema.getLista_pedido()) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    String json = gson.toJson(pedido);

                    fileWriter.write(json);
                    fileWriter.write("\n,");
                    fileWriter.flush();

                    System.out.println(json);

                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Lanchonete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Emite relatorio de Colaboradores registrados no sistema.
     */
    public  void relatorioColaboradores() {
        try {
            FileWriter fileWriter = new FileWriter("filesjson\\Colaboradores.json");
            for (Colaborador colaborador : Sistema.getColaboradores_lista()) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    String json = gson.toJson(colaborador);

                    fileWriter.write(json);
                    fileWriter.write("\n,");
                    fileWriter.flush();

                    System.out.println(json);

                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Lanchonete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Emite relatorio de Produtos em estoque.
     */
    public  void relatorioProdutos() {
        try {
            FileWriter fileWriter = new FileWriter("filesjson\\Produtos.json");
            for (Produto produto : Sistema.getVetor_produto()) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    String json = gson.toJson(produto);

                    fileWriter.write(json);
                    fileWriter.write("\n,");
                    fileWriter.flush();

                    System.out.println(json);

                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Lanchonete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Métodos de Funcionários.
     * Método para realizar o cadastro de um cliente no sistema.
     */
    public  void cadastrarCliente() {
        Scanner scan = new Scanner(System.in);
        try {
            // cria objeto do tipo usuario e armazena seus atributos
            Cliente cliente_info = new Cliente();

            System.out.println("Nome completo: ");
            cliente_info.setNome(scan.nextLine());

            System.out.println("CPF: ");
            cliente_info.setCpf(scan.nextLine());

            System.out.println("Telefone: ");
            cliente_info.setTelefone(scan.nextLine());

            System.out.println("Endereço: ");
            cliente_info.setEndereco(scan.nextLine());

            System.out.println("Ultimos pedidos: ");
            cliente_info.setUltimos_pedidos(scan.nextLine());

            Sistema.getLista_cliente().add(cliente_info);

            if (Sistema.getLista_cliente().contains(cliente_info)) {
                Util.Sucesso("Cliente Cadastrado!");
            } else {
                Util.Erro("Cliente não foi cadastrado!");
            }
        } catch (Exception excpt) {
            excpt.getMessage();
        }
        Sistema.menuFuncionario();
    }

    /**
     * Método para edição de valores referente aos atributos de um cliente.
     */
    public  void editarCliente() {
        Scanner scan = new Scanner(System.in);
        String cpf_informado;
        System.out.println("\nInforme o cpf do cliente: ");
        cpf_informado = scan.nextLine();
        for (Cliente cliente : Sistema.getLista_cliente()) {
            if (cpf_informado.equals(cliente.getCpf())) {
                System.out.println(cliente.toString());
                System.out.println("\nInsira a opção: "
                        + "\n1 - Alterar Telefone "
                        + "\n2 - Alterar Endereço "
                        + "\n3 - Alterar 'Ultimos Pedidos'"
                        + "\n4 - fechar\n ");
                String opc = scan.nextLine();
                switch (opc) {
                    case "1":
                        String novo_telefone;
                        System.out.println("\nInforme o novo novo_telefone: ");
                        novo_telefone = scan.nextLine();
                        cliente.setTelefone(novo_telefone);
                        break;
                    case "2":
                        String novo_endereco;
                        System.out.println("\nInforme o novo Endereço: ");
                        novo_endereco = scan.nextLine();
                        cliente.setEndereco(novo_endereco);
                        break;
                    case "3":
                        String edit_ultimos_pedidos;
                        System.out.println("\nInforme alterações: ");
                        edit_ultimos_pedidos = scan.nextLine();
                        cliente.setUltimos_pedidos(edit_ultimos_pedidos);
                        break;
                    case "4":
                        break;
                    default:
                        System.out.println((char) 27 + "[31m\nOpção inválida\u001B[0m");
                }
            }
        }
        Sistema.menuFuncionario();
    }

    /**
     * Possibilita a exclusão de um cliente dos registros do sistema usando seu
     * CPF.
     */
    public  void removerCliente() {
        Scanner scan = new Scanner(System.in);
        String cpf_informado;
        try {
            boolean teste = false;
            System.out.println("\nCPF do cliente: ");
            cpf_informado = scan.nextLine();
            for (Cliente cliente : Sistema.getLista_cliente()) {
                if (cpf_informado.toUpperCase().equals(cliente.getCpf().toUpperCase())) {
                    Sistema.getLista_cliente().remove(cliente);
                    teste = true;
                }
            }
            if (teste == true) {
                Util.Sucesso("Cliente Removido!");
            } else {
                Util.Erro("Cliente não foi removido!");
            }
        } catch (Exception excpt) {
            excpt.getStackTrace();
        }
        Sistema.menuFuncionario();
    }

    /**
     * Consulta se determinado cliente existe no sistema.
     *
     * @return objeto do tipo cliente.
     */
    public  String pesquisarCliente() {
        Scanner scan = new Scanner(System.in);
        String cpf_informado;
        try {
            System.out.println("\nInforme o cpf do cliente: ");
            cpf_informado = scan.nextLine();
            for (Cliente cliente : Sistema.getLista_cliente()) {
                if (cpf_informado.equals(cliente.getCpf())) {
                    return cliente.toString();
                }
            }
        } catch (Exception excpt) {
            excpt.getStackTrace();
            String mensagem = ((char) 27 + "[31m\nCliente não registrado!\u001B[0m");
            return mensagem;
        }
        Sistema.menuFuncionario();
        return null;
    }

    /**
     * Método para cadastrar de um pedido de um cliente registrado.
     */
    public  void cadastrarPedido() {
        Scanner scan = new Scanner(System.in);
        try {
            // cria objeto do tipo pedido 
            Pedido pedido_info = new Pedido();

            System.out.println("CPF do cliente:  ");
            pedido_info.setCpf_cliente(scan.nextLine());

            System.out.println("Data do pedido: DD/MM/YYYY ");
            pedido_info.setData(scan.nextLine());

            System.out.println("Hora do pedido: 00:00 ");
            pedido_info.setHora_pedido(scan.nextLine());

            System.out.println("Hora da Entrega: 00:00 ");
            pedido_info.setHora_entrega(scan.nextLine());

            System.out.println("Descrição: ");
            pedido_info.setDescricao(scan.nextLine());

            System.out.println("Status do pedido: [Aberto/Fechado/Em preparo/Cancelado] ");
            pedido_info.setStatus_pedido(scan.nextLine());

            System.out.println("ID do pedido: ");
            pedido_info.setId_pedido(scan.nextInt());

            System.out.println("Valor Total: ");
            pedido_info.setValor_total(scan.nextFloat());
            
            Sistema.getLista_pedido().add(pedido_info);

            if (!Sistema.getLista_pedido().contains(pedido_info)) {
                Util.Erro("Pedido não cadastrado!");
            } else {
                Util.Sucesso("Pedido Cadastrado!");
            }
        } catch (Exception excpt) {
            excpt.getMessage();
        }
        Sistema.menuFuncionario();
    }

    /**
     * Método para edição de valores referentes aos atributos de um pedido.
     */
    public  void editarPedido() {
        Scanner scan = new Scanner(System.in);
        String id_informado;
        pesquisarPedido();
        System.out.println("\nInforme o ID do pedido: ");
        id_informado = scan.nextLine();
        String opt;
        for (Pedido pedidos : Sistema.getLista_pedido()) {
            if (id_informado.equals(pedidos.getId_pedido())) {
                System.out.println(pedidos.toString());
                System.out.println("\nInsira a opção: "
                        + "\n1 - Alterar CPF "
                        + "\n2 - Alterar Horario de Entrega "
                        + "\n3 - Descrição "
                        + "\n4 - Status do Pedido\n"
                        + "\n5 - Valor Total do Pedido\n");
                opt = scan.nextLine();
                switch (opt) {
                    case "1":
                        String cpf_novo;
                        System.out.println("\nInforme o novo CPF: ");
                        cpf_novo = scan.nextLine();
                        pedidos.setCpf_cliente(cpf_novo);
                        break;
                    case "2":
                        String novo_horario_entrega;
                        System.out.println("\nInforme o novo Horario de Entrega: 00:00 ");
                        novo_horario_entrega = scan.nextLine();
                        pedidos.setHora_entrega(novo_horario_entrega);
                        break;
                    case "3":
                        String nova_descricao;
                        System.out.println("\nInforme Nova Descrição: ");
                        nova_descricao = scan.nextLine();
                        pedidos.setDescricao(nova_descricao);
                        break;
                    case "4":
                        String novo_status;
                        System.out.println("\nInforme novo status do pedido: ");
                        novo_status = scan.nextLine();
                        pedidos.setStatus_pedido(novo_status);
                        break;
                    case "5":
                        float novo_valor_total;
                        System.out.println("\nInforme novo valor total: ");
                        novo_valor_total = scan.nextFloat();
                        pedidos.setValor_total(novo_valor_total);
                        break;
                    default:
                        System.out.println((char) 27 + "[31m\nOpção inválida\u001B[0m");
                }
            }
        }
        Sistema.menuFuncionario();
    }

    /**
     * Remove um pedido relacionado a um CPF de um cliente.
     */
    public  void removerPedido() {
        try {
            boolean teste = false;
            pesquisarPedido();
            Scanner scan = new Scanner(System.in);
            String id_informado;
            System.out.println("\nInforme ID de pedido: ");
            id_informado = scan.nextLine();
            for (Pedido pedidos : Sistema.getLista_pedido()) {
                if (id_informado.equals(pedidos.getId_pedido())) {
                    Sistema.getLista_pedido().remove(pedidos);
                    teste = true;
                }
            }
            if (teste == true) {
                Util.Sucesso("Pedido Removido!");
            } else {
                Util.Erro("Pedido não foi removido!");
            }
        } catch (Exception excpt) {
            excpt.getStackTrace();
        }
        Sistema.menuFuncionario();
    }

    /**
     * @return String com descrição do objeto pedido.
     */
    public  String pesquisarPedido() {
        Scanner scan = new Scanner(System.in);
        String cpf_informado;
        try {
            System.out.println("\nInforme o cpf do cliente: ");
            cpf_informado = scan.nextLine();
            for (Pedido pedidos : Sistema.getLista_pedido()) {
                if (cpf_informado.equals(pedidos.getCpf_cliente())) {
                    return pedidos.toString();
                }
            }
        } catch (Exception e) {
            e.getMessage();
            String mensagem = ((char) 27 + "[31m\nNão existe pedidos registrados!\u001B[0m");
            return mensagem;
        }
        Sistema.menuFuncionario();
        return null;
    }

    /**
     * Printa na tela os pedidos de um cliente.
     */
    public  void listarPedido() {
        Scanner scan = new Scanner(System.in);
        String cpf_informado;
        try {
            System.out.println("\nInforme o cpf do cliente: ");
            cpf_informado = scan.nextLine();
            for (Pedido pedidos : Sistema.getLista_pedido()) {
                if (cpf_informado.equals(pedidos.getCpf_cliente())) {
                    System.out.println(pedidos.toString());
                }
            }

        } catch (Exception e) {
            e.getMessage();
            System.out.println((char) 27 + "[31m\nNão existe pedidos registrados!\u001B[0m");
        }
        Sistema.menuFuncionario();
    }

    /**
     * Ordena pelo ID e Printa lista de pedidos realizados na lanchonete.
     */
    public  void ListarPedidos() {
        Collections.sort(Sistema.getLista_pedido());
        for (Pedido pedido : Sistema.getLista_pedido()) {
            System.out.println(pedido.toString());
        }

        Sistema.menuFuncionario();

    }

    /**
     * Printa os clientes na tela.
     */
    public  void listarCliente() {
        for (Cliente cliente : Sistema.getLista_cliente()) {
            System.out.println(cliente.toString());
        }

        Sistema.menuFuncionario();
    }

}
