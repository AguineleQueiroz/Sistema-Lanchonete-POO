/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

/**
 * Classe que representa um modelo de objeto pessoa no sistema da lanchonete.
 * @author Aguinle Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public abstract class Pessoa {

    /**
     *
     */
    private String nome;

    /**
     *
     */
    private String telefone;

    /**
     *
     */
    private String endereco;

    /**
     *
     */
    private String cpf;

    /**
     * Construtores de classe
     *
     * @param nome
     * @param telefone
     * @param endereco
     * @param cpf
     */
    public Pessoa(String nome, String telefone, String endereco,
            String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    /**
     * Construtor de classe.
     */
    public Pessoa() {
    }

    /**
     * Obtém o nome de uma pessoa nos registros do sistema
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome de uma pessoa nos registros do sistema.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o telefone de uma pessoa nos registros do sistema
     *
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o Telefone de uma pessoa nos registros do sistema
     *
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o Endereço de uma pessoa nos registros do sistema
     *
     * @return endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço de uma pessoa nos registros do sistema
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o CPF de uma pessoa no sistema
     *
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF de uma pessoa nos registros do sistema
     *
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método para redefinição Senha de usuario.
     * Polimorfismo
     */
    public abstract void alterarSenha();
    
    /**
     * Sobescreve o toString de Object.
     *
     * @return String
     */
    @Override
    public String toString() {
        String texto;
        texto = String.format("\nNome: %s"
                + "\nTelefone: %s"
                + "\nEndereco: %s"
                + "\nCPF: %s",
                getNome(), getTelefone(), getEndereco(), getCpf(), "\n");
        return texto;
    }

}
