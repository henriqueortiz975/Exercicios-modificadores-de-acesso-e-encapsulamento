package com.mycompany.exercicio6_controledeacesso_classelogin;

public class Usuario {
    private String login = "Henrique Ibarra";
    private String senha = "senha123";
    
    
    public boolean autenticar(String login, String senha){
          if(this.login == login && this.senha == senha){           
              return true;
          }else{
              return false;
          } 
    }
}
