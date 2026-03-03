package exercicio2_validacao_de_dados_em_metodos_set;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        if(preco > 0){
            return preco;
       }else{
            System.out.println("ERRO-valor invalido-ERRO");
            return preco;
        }   
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
}

