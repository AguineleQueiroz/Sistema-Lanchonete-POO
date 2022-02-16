/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

/**
 * Classe que representa um sanduiche no sistema da lanchonete.
 * @author Aguinle Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public class Sanduiche {

    /**
     *
     */
    private int id;

    /**
     *
     */
    private String nome;

    /**
     *
     */
    private String tipo_pao;

    /**
     *
     */
    private String tipo_recheio;

    /**
     *
     */
    private double preco;

    /**
     * Construtores de classe
     *
     * @param id
     * @param nome
     * @param tipo_pao
     * @param tipo_recheio
     * @param preco
     */
    public Sanduiche(int id, String nome, String tipo_pao, String tipo_recheio,
            double preco) {
        this.id = id;
        this.nome = nome;
        this.tipo_pao = tipo_pao;
        this.tipo_recheio = tipo_recheio;
        this.preco = preco;
    }

    /**
     * Construtor de classe.
     */
    public Sanduiche() {
    }

    /**
     * Obtém o ID de um sanduiche nos registros do sistema.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID de um sanduiche nos registros do sistema.
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome de um sanduiche nos registros do sistema.
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome de um sanduiche nos registros do sistema
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o tipo de pão de um sanduiche nos registros do sistema
     *
     * @return tipo_pao
     */
    public String getTipo_pao() {
        return tipo_pao;
    }

    /**
     * Define o tipo de pão de um sanduiche nos registros do sistema
     *
     * @param tipo_pao
     */
    public void setTipo_pao(String tipo_pao) {
        this.tipo_pao = tipo_pao;
    }

    /**
     * Obtém o tipo de recheio de um sanduiche nos registros do sistema
     *
     * @return
     */
    public String getTipo_recheio() {
        return tipo_recheio;
    }

    /**
     * Define o tipo de recheio de um sanduiche nos registros do sistema
     *
     * @param tipo_recheio
     */
    public void setTipo_recheio(String tipo_recheio) {
        this.tipo_recheio = tipo_recheio;
    }

    /**
     * Obtém o preço de um sanduiche nos registros do sistema
     *
     * @return preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço de um sanduiche nos registros do sistema
     *
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Sobescreve o toString de Object.
     *
     * @return String
     */
    @Override
    public String toString() {
        String texto = String.format("\nSanduiche: "
                + "\nID do lanche %d"
                + "\nNome: %s"
                + "\nTipo de Pão: %s"
                + "\nRecheio: %s"
                + "\nPreço: %.2f",
                getId(), getNome(), getTipo_pao(), getTipo_recheio(), getPreco());
        return texto;
    }
}
