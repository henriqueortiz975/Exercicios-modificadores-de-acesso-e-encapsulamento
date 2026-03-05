package exercicio10_criandoclassecarroencapsulamento;

public class Carro {
    private String modelo;
    private String marca;
    public int ano;
    
    public void setModelo(String modelo){
        this.modelo = modelo;     
    }
    
    public void setMarca(String marca){
        this.marca = marca;   
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void verificarano(int ano){
        this.ano = ano;
        if(ano < 1886){
            System.out.println("Ano do carro invalido");
        }else{
            System.out.println("ano do carro: " + ano);
        }
    }
    
}
