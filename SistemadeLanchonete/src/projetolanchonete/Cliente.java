/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

import java.util.Iterator;

/**
 * Classe que representa o Cliente um sistema da lanchonete.
 *
 * @author Aguinle Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public class Cliente extends Pessoa implements Comparable<Pedido> {

    /**
     *
     */
    private String ultimos_pedidos;

    /**
     *
     */
    private static int contador_private = 0;

    /**
     *
     */
    protected static int contador_protected = 0;

    /**
     * Construtores da Classe.
     *
     * @param nome
     * @param telefone
     * @param endereco
     * @param cpf
     * @param ultimos_pedidos
     */
    public Cliente(String nome, String telefone,
            String endereco, String cpf, String ultimos_pedidos) {
        super(nome, telefone, endereco, cpf);
        this.ultimos_pedidos = ultimos_pedidos;
        Cliente.contador_private = Cliente.contador_private + 1;
        Cliente.contador_protected = Cliente.contador_protected + 1;

    }

    /**
     * Construtor de classe
     *
     * @param ultimos_pedidos
     */
    public Cliente(String ultimos_pedidos) {
        this.ultimos_pedidos = ultimos_pedidos;
    }

    /**
     * Construtor de classe.
     */
    public Cliente() {
        contador_private = contador_private + 1;
        contador_protected = contador_protected + 1;
    }

    /**
     * Óbtem os Ultimos pedidos de um cliente.
     *
     * @return ultimos pedidos
     */
    public String getUltimos_pedidos() {
        return ultimos_pedidos;
    }

    /**
     * Define os Últimos pedidos de um cliente.
     *
     * @param ultimos_pedidos
     */
    public void setUltimos_pedidos(String ultimos_pedidos) {
        this.ultimos_pedidos = ultimos_pedidos;
    }

    /**
     * Obtém numero de instancias do tipo cliente.
     *
     * @return contador_private
     */
    public static int getContador_private() {

        return contador_private;
    }

    /**
     *
     * @param pedido
     * @return
     */
    @Override
    public int compareTo(Pedido pedido) {
        int conta_pedidos = 0;
        for (Cliente cliente : Sistema.getLista_cliente()) {
            for (Iterator<Pedido> it = Sistema.getLista_pedido().iterator(); it.hasNext();) {
                pedido = it.next();
                if (cliente.getCpf().equals(it.next().getCpf_cliente())) {
                    conta_pedidos++;
                    return 0;
                } else if (!cliente.getCpf().equals(it.next().getCpf_cliente())) {
                    return 1;
                } else {
                    return -1;
                }
            }
            System.out.println(cliente.getNome() + " fez " + conta_pedidos);
        }
        return 0;
    }

    /**
     * Sobrescreve o toString de Object.
     *
     * @return String representando um objeto.
     */
    @Override
    public String toString() {
        String texto = String.format("\nCliente: "
                + "\nNome: %s"
                + "\nCPF: %s"
                + "\nTelefone: %s"
                + "\nEndereco: %s"
                + "\nUltimos pedidos: %s",
                getNome(), getCpf(), getTelefone(), getEndereco(),
                getUltimos_pedidos(), "\n");
        return texto;
    }

    @Override
    public void alterarSenha() {
    }
}
