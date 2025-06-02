/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482311039
 */
public class Smartphone implements PC, Celular{
    
    String tel, email;
    
public Smartphone(String tel, String email){
    super();//siginifica que da para fazer mais coisas, nem utiliza essas variaveis
    this.tel = tel;
    this.email = email;
    
    
}
    @Override
    public void verificarEmail() {
        System.out.println("Verificando email...");
    }

    @Override
    public void realizarChamada() {
        System.out.println("Realizando chamada...");
    }
    
}
