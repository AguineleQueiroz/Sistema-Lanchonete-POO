/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

/**
 * Classe que apresenta estrutura de notificações do sistema da lanchonete.
 * @author Aguinle Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public class Util {

    /**
     *
     */
    private static final String ANSI_RESET = "\u001B[0m";

    /**
     *
     */
    private static final String ANSI_RED = "\u001B[31m";

    /**
     *
     */
    private static final String ANSI_GREEN = "\u001B[32m";

    /**
     *
     */
    private static final String ANSI_BLUE = "\u001B[34m";

    /**
     * Printa uma mensagem de sucesso na tela
     *
     * @param mensagem
     */
    public static void Sucesso(String mensagem) {
        System.out.println(ANSI_GREEN + mensagem + ANSI_RESET);
    }

    /**
     * Printa uma mensagem de notificação na tela
     *
     * @param mensagem
     */
    public static void Notifica(String mensagem) {
        System.out.println(ANSI_BLUE + mensagem + ANSI_RESET);
    }

    /**
     * Printa uma mensagem de erro na tela
     *
     * @param mensagem
     */
    public static void Erro(String mensagem) {
        System.out.println(ANSI_RED + mensagem + ANSI_RESET);
    }
}
