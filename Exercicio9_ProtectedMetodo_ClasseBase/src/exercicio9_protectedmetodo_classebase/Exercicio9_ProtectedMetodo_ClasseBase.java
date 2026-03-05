package exercicio9_protectedmetodo_classebase;

public class Exercicio9_ProtectedMetodo_ClasseBase {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        System.out.println("Cachorro:");
        cachorro.fazerSom();
        System.out.println("");
        System.out.println("Gato: ");
        gato.fazerSom();
    }
    
}
