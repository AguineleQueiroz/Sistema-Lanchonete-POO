/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

/**
 * Classe que representa um produto no sistema da lanchonete.
 * @author Aguinle Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public class Produto {

    /**
     *
     */
    private String nome;

    /**
     *
     */
    private String descricao;

    /**
     *
     */
    private int quantidade_produto;

    /**
     *
     */
    private int id_produto;

    /**
     *
     */
    private float valor;

    /**
     * Construtores de classe
     *
     * @param nome
     * @param descricao
     * @param quantidade_produto
     * @param id_produto
     * @param valor
     */
    public Produto(String nome, String descricao, int quantidade_produto,
            int id_produto, float valor) {
        this.nome = nome;
        this.quantidade_produto = quantidade_produto;
        this.descricao = descricao;
        this.id_produto = id_produto;
        this.valor = valor;
    }

    /**
     * Construtor de classe.
     */
    public Produto() {
    }

    /**
     * Obtém o nome de um produto
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome de um produto
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém quantidade de um produto
     *
     * @return quantidade_produto
     */
    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    /**
     * Define quantidade de um produto
     *
     * @param quantidade_produto
     */
    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    /**
     * Obtém descrição de um produto
     *
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define uma descrição de um produto
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o ID de um produto
     *
     * @return id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * Define o ID de um produto
     *
     * @param id_produto
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * Obtém o valor de um produto
     *
     * @return valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * Define o valor de um produto
     *
     * @param valor
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * Sobescreve o toString de Object.
     *
     * @return String
     */
    @Override
    public String toString() {
        String texto = String.format("\n Produto:  "
                + "\nNome: %s"
                + "\nQuantidade do produto [und]: %d"
                + "\nDescrição: %s"
                + "\nId do produto: %d"
                + "\nValor: %.2f",
                getNome(), getQuantidade_produto(), getDescricao(), getId_produto(),
                getValor(), "\n");
        return texto;
    }

}
