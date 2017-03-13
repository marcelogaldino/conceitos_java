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
public class Funcionario {
    private double salario;
    private String nome;
    
    public String getNome() {
        return nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double bonificacao() {
        return this.salario * 0.1;
    }
}
