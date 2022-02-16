
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

import java.util.Scanner;
import projetolanchonete.Pessoa;

/**
 * Classe que representa um Funcionário do sistema da lanchonete.
 *
 * @author Aguinle Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public class Colaborador extends Pessoa {
   
    /**
     *
     */
    private String cargo;

    /**
     *
     */
    private double salario;

    /**
     *
     */
    private String senha_usuario;

    /**
     * Construtores de classe
     *
     * @param nome
     * @param telefone
     * @param endereco
     * @param cpf
     * @param cargo
     * @param salario
     * @param senha_usuario
     */
    public Colaborador(String nome, String telefone, String endereco, String cpf,
            String cargo, double salario, String senha_usuario) {
        super(nome, telefone, endereco, cpf);
        this.cargo = cargo;
        this.salario = salario;
        this.senha_usuario = senha_usuario;
    }

    /**
     * Construtor de classe.
     */
    public Colaborador() {
        super();
    }

    /**
     * Obtém o cargo de um colaborador.
     *
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o cargo de um colaborador.
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtém o Salario de um colaborador.
     *
     * @return salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salario de um colaborador.
     *
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Obtém a Senha de um colaborador.
     *
     * @return senha de um colaborador
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * Define o senha de um colaborador.
     *
     * @param senha_usuario
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    /**
     * Possibilita a redefinição de senha para colaborador.
     */
    @Override
    public void alterarSenha() {
        try {
            boolean valor = false;
            Scanner scan = new Scanner(System.in);
            System.out.println("\nInforme o seu CPF: ");
            String cpf_informado = scan.nextLine();
            String nova_senha;
            for (Colaborador colaborador : Sistema.getColaboradores_lista()) {
                if (cpf_informado.equals(colaborador.getCpf())) {
                    System.out.println(colaborador.toString());
                    System.out.println("\nInforme nova senha: ");
                    nova_senha = scan.nextLine();
                    colaborador.setSenha_usuario(nova_senha);
                    Util.Sucesso("\nSenha Alterada com Sucesso!");
                    valor = true;
                    break;
                }
            }
            if (valor == false) {
                Util.Erro("CPF não encontrado! Tente novamente!");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        Sistema.menuFuncionario();

    }

    /**
     * Sobescreve o toString de Object.
     *
     * @return String
     */
    @Override
    public String toString() {
        String texto = String.format("\n Funcionário:  "
                + "\nNome: %s"
                + "\nTelefone: %s"
                + "\nEndereco: %s"
                + "\nCPF: %s"
                + "\nCargo: %s"
                + "\nSalário: %.2f",
                getNome(), getTelefone(), getEndereco(), getCpf(), getCargo(), getSalario(), "\n");
        return texto;
    }

}
