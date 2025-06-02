
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482311039
 */
public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ContaCorrente novaConta;
        novaConta = new ContaCorrente();
        
        novaConta.definirSaldoInicial(1000);
        
        novaConta.sacar(500f);
        
        novaConta.depositar(50f);
        
        novaConta.sacar(600f);
        
    }
}
