/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para mostrar funcionalidades básicas da conta corrente
 * @author 2830482311039
 */
public class ContaCorrente {
    float saldo;
    //método construtor
    public ContaCorrente(float saldo){
        this.saldo = saldo;
        
    }
    public ContaCorrente(){
        
    }
            
    public void definirSaldoInicial(float valor){
        
        saldo = valor;
        //System.out.println("Digite um valor numérico");
            
        
        System.out.println("Seu saldo é de: " +saldo);
        //valor = 0;
    }
    
    public void depositar(float valor){  
      saldo = (saldo + valor); 
        System.out.println("\nDepósito realizado com sucesso!!!!!");
        System.out.println("Seu saldo atual é de: " + saldo);
        //valor = 0;
    }
    
   /* public int sacar (float valor){
        if(saldo < valor){
            System.out.println("\nSaldo insuficiente"); 
            //valor = 0;
            return 0;
        }
        else{
            System.out.println("\nSaque realizado com sucesso!!!!!");
            
            saldo = saldo - valor;
            System.out.println("\nSaldo atual: " + saldo);
         
            return 1;
        }
    } 
    */
    public boolean sacar (float valor){
        if(saldo < valor){
            System.out.println("\nSaldo insuficiente"); 
            //valor = 0;
            return false;
        }
        else{
            System.out.println("\nSaque realizado com sucesso!!!!!");
            
            saldo = saldo - valor;
            System.out.println("Saldo atual: " + saldo);
         
            return true;
        }
    } 
    
}//fim da classe ContaCorrente
