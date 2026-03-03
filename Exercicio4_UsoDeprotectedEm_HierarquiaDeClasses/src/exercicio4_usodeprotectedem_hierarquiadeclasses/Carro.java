package exercicio4_usodeprotectedem_hierarquiadeclasses;

public class Carro extends Veiculo{
    public String nome;
    protected double velocidadeMaxima;
    
    public double getVelo(){
        return velocidadeMaxima;
    }
    
    public String modelo(){
        return nome;
    }
}
