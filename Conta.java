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
public class Conta {
    int numero;
    double saldo;
    double limite;
    
    void depositar(double valor) {
        this.saldo += valor;
    }
    
    void sacar(double valor) {
        this.saldo -= valor;
    }
    
    void extrato(){
        System.out.println("Saldo: "+this.saldo );
    }
}