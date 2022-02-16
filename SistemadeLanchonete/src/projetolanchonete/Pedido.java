/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

/**
 * Classe que representa um pedido no sistema da lanchonete.
 * @author Aguinle Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public class Pedido implements Comparable<Pedido> {

    /**
     *
     */
    private String cpf_cliente;

    /**
     *
     */
    private String data;

    /**
     *
     */
    private String hora_pedido;

    /**
     *
     */
    private String hora_entrega;

    /**
     *
     */
    private String descricao;

    /**
     *
     */
    private int id_pedido;

    /**
     *
     */
    private String status_pedido;
    
    /**
     *
     */
    private float valor_total;

    /**
     * Construtores de classe.
     *
     * @param cpf_cliente
     * @param data
     * @param hora_pedido
     * @param hora_entrega
     * @param descricao
     * @param id_pedido
     * @param status_pedido
     * @param valor_total
     */
    public Pedido(String cpf_cliente, String data, String hora_pedido,
            String hora_entrega, String descricao, int id_pedido,
            String status_pedido, float valor_total ) {
        this.cpf_cliente = cpf_cliente;
        this.data = data;
        this.hora_pedido = hora_pedido;
        this.hora_entrega = hora_entrega;
        this.descricao = descricao;
        this.id_pedido = id_pedido;
        this.status_pedido = status_pedido;
        this.valor_total = valor_total;
    }

    /**
     * Construtor de classe.
     */
    public Pedido() {

    }

    /**
     * Obtém data do pedido.
     *
     * @return data
     */
    public String getData() {
        return data;
    }

    /**
     * Obtém CPF do cliente.
     *
     * @return cpf_cliente
     */
    public String getCpf_cliente() {
        return cpf_cliente;
    }

    /**
     * Define CPF do cliente
     *
     * @param cpf_cliente
     */
    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    /**
     * Define a data do pedido
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obtém hora do pedido.
     *
     * @return hora_pedido
     */
    public String getHora_pedido() {
        return hora_pedido;
    }

    /**
     * Define a hora do pedido
     *
     * @param hora_pedido
     */
    public void setHora_pedido(String hora_pedido) {
        this.hora_pedido = hora_pedido;
    }

    /**
     * Obtém a hora de entrega do pedido
     *
     * @return hora_entrega
     */
    public String getHora_entrega() {
        return hora_entrega;
    }

    /**
     * Define a hora de entrega do pedido
     *
     * @param hora_entrega
     */
    public void setHora_entrega(String hora_entrega) {
        this.hora_entrega = hora_entrega;
    }

    /**
     * Obtém a descrição do pedido
     *
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do pedido
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o ID do pedido
     *
     * @return id_pedido
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * Define o ID do pedido
     *
     * @param id_pedido
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * Obtém o status do pedido
     *
     * @return status_pedido
     */
    public String getStatus_pedido() {
        return status_pedido;
    }

    /**
     * Define o status do pedido
     *
     * @param status_pedido
     */
    public void setStatus_pedido(String status_pedido) {
        this.status_pedido = status_pedido;
    }

    /**
     * Obtém o valor do pedido
     * @return valor_total
     */
    public float getValor_total() {
        return valor_total;
    }

    /**
     * Define o valor do pedido
     * @param valor_total
     */
    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }
    
    @Override
    public int compareTo(Pedido pedido) {
        if (id_pedido == pedido.id_pedido) {
            return 0;
        } else if (id_pedido > pedido.id_pedido) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * Sobescreve o toString de Object.
     *
     * @return String
     */
    @Override
    public String toString() {
        String texto;
        texto = String.format("\nPedido:"
                + "\nCPF do Cliente: %s"
                + "\nData: %s"
                + "\nHora do pedido: %s"
                + "\nHora da entrega: %s"
                + "\nDescrição: %s"
                + "\nStatus Pedido: %s"
                + "\nId do pedido: %d"
                + "\nValor Total: ",
                getCpf_cliente(), getData(), getHora_pedido(), getHora_entrega(),
                getDescricao(), getStatus_pedido(), getId_pedido(), getValor_total());

        return texto;
    }

}
