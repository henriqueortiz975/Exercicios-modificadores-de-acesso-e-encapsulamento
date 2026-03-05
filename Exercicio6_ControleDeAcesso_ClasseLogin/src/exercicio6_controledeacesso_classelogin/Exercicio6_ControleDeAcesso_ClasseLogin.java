package exercicio6_controledeacesso_classelogin;

public class Exercicio6_ControleDeAcesso_ClasseLogin {

public static void main(String[] args) {
    Usuario objconta = new Usuario();
    System.out.println("o login foi feito corretamente: "
    + objconta.autenticar("Henrique Ibarra", "senha123")); }
    
}
