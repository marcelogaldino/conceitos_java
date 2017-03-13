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
public class Gerentes extends Funcionario implements SubGerentes {
    private String usuario;
    private String senha;
    private double salario;
    
    @Override
    public String telefone(){
        return "012345678";
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public String getSenha() {
        return senha;
    }
    
    @Override
    public double getSalario() {
        return salario;
    }
    
    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double bonificacao() {
        return this.getSalario() * 0.5;
    }
}
