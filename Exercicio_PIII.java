/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_piii;

/**
 *
 * @author marcelo
 */
public class Exercicio_PIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerentes gerentes = new Gerentes();
        
        gerentes.setUsuario("João");
        gerentes.setSenha("1234");
        gerentes.setSalario(5000);
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome ("Marcelo");
        funcionario.setSalario(2500);
         
        System.out.println("Nome....: " +funcionario.getNome());
        System.out.println("Salario.: " +funcionario.getSalario());
        
        System.out.println("Nome Gerente..: "+gerentes.getUsuario());
        System.out.println("Senha Gerente.: "+gerentes.getSenha());
        System.out.println("Salario.......: "+gerentes.getSalario());
        System.out.println("Bonificacao...: "+gerentes.bonificacao());
        System.out.println("Telefone......: "+gerentes.telefone());
    }
    
}
