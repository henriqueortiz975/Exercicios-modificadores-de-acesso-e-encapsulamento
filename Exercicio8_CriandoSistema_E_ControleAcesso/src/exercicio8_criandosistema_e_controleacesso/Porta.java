package exercicio8_criandosistema_e_controleacesso;

public class Porta {
   private boolean aberta;
   
       public void abrir(){
       aberta = true;
       System.out.println("A porta foi aberta.");
    } 
       public void fechar(){
       aberta = false;
       System.out.println("A porta foi fechada");
   }
}
