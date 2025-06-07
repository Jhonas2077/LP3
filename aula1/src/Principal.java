
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
    
    public static void main (String[] args){
        
        //criação de um objeto para leitura?
        Scanner sc = new Scanner(System.in);
        
        //criação de novos objetos
        Pessoa p1 = new Pessoa("Jão", 17);
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        //preencher dados da pessoa 1
        System.out.println("Digite o nome da pessoa 1:");
        p1.nome = sc.next();
        System.out.println("Digite a idade da pessoa 1:");
        p1.idade = sc.nextInt();
        
        //preencher dados da pessoa 2
        System.out.println("\nDigite o nome da pessoa 2:");
        p1.nome = sc.next();
        System.out.println("Digite a idade da pessoa 2:");
        p1.idade = sc.nextInt();
        
        //preencher dados da pessoa 3
        System.out.println("\nDigite o nome da pessoa 3:");
        p1.nome = sc.next();
        System.out.println("Digite a idade da pessoa 3:");
        p1.idade = sc.nextInt();
        
        //mostrar os dados das pessoas
        System.out.println("Pessoa 1: " + p1.nome + "\nIdade" + p1.idade);
        System.out.println("Pessoa 2: " + p2.nome + "\nIdade" + p2.idade);
        System.out.println("Pessoa 3: " + p3.nome + "\nIdade" + p3.idade);
        
        
       /* try 
        {
        
        
        }
        
        catch (java.util.InputMismatchException){
            
        }
        
        finally{
                
        }
        */
        
    }
}
