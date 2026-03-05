package com.mycompany.exercicio8_criandosistema_controleacesso;

public class Porta {
   private boolean aberta;
   
   public boolean abrir(){
       if(aberta == true){
           return true;
       }else{
           return false;
       }
}
   public boolean fechar(){
       if(aberta == false){
           return false;
       }else{
           return true;
       }
   }
}
