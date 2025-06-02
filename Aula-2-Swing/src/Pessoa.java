/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482311039
 */
  public class Pessoa{
      public  String nome;
      public  char sexo;
      public  String idioma;
    
    public Pessoa(String nome, char sexo, String idioma){
     this.nome = nome;
     this.sexo = sexo;
     this.idioma = idioma;
      
    }
    public Object[] obterDados(){
        return new Object[] {nome, sexo,idioma};
    }
    
    
    }
    