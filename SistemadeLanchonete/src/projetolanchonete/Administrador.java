package projetolanchonete;

import java.util.Scanner;
import projetolanchonete.Colaborador;

/**
 * Classe que representa o Administrador um sistema da lanchonete.
 * @author Aguinele Queiroz
 * @author Cássia Pires
 * @author Fábio Borges
 */
public class Administrador extends Colaborador {

    /**
     * Construtores de Classe
     *
     * @param cargo
     * @param salario
     * @param senha_usuario
     * @param nome
     * @param telefone
     * @param endereco
     * @param cpf
     */
    public Administrador(String nome, String telefone, String endereco,
            String cpf, String cargo, double salario, String senha_usuario) {
        super(nome, telefone, endereco, cpf, cargo, salario, senha_usuario);
    }

    /**
     * Construtor de classe.
     */
    public Administrador() {
        super();
    }
    
    @Override
    public void alterarSenha(){
        try {
            boolean valor = false;
            Scanner scan = new Scanner(System.in);
            System.out.println("\nInforme o seu CPF: ");
            String cpf_informado = scan.nextLine();
            String  nova_senha;
            for (Colaborador colaborador: Sistema.getColaboradores_lista()){
                if(cpf_informado.equals(colaborador.getCpf()) && "Administrador".equals(colaborador.getCargo())){
                    System.out.println("\nSenha Atual: " + colaborador.getSenha_usuario());
                    System.out.println("\nNova senha de Administrador: ");
                    nova_senha = scan.nextLine();
                    colaborador.setSenha_usuario(nova_senha);
                    Util.Sucesso("\nSenha Alterada com Sucesso!");
                    valor = true;
                    break;
                }
            }
            if(valor == false){
                Util.Erro("\nInforme CPF correto ou entre com um usuário Administrador.");
            }
        }catch (Exception e) {
            e.getMessage();
        }
        Sistema.menuAdministrador();
        
    }
    
    /**
     * Sobescreve o toString de Object.
     *
     * @return String
     */
    @Override
    public String toString() {
        String texto = String.format("\n Administrador:  "
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
