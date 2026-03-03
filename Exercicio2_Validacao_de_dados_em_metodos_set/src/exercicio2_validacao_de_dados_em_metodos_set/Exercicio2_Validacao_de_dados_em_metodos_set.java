package exercicio2_validacao_de_dados_em_metodos_set;

public class Exercicio2_Validacao_de_dados_em_metodos_set {

    public static void main(String[] args) { 
        Produto objproduto = new Produto();
        objproduto.setNome("lapis");
        objproduto.setPreco(1.20);
        System.out.println("Nome do produto: " + objproduto.getNome());
        System.out.println("custo do produto: " + objproduto.getPreco());
        
        
        
        Produto teste_de_erro = new Produto();
        teste_de_erro.setNome("maça");
        teste_de_erro.setPreco(-1.20);
        System.out.println("Nome do produto: " + teste_de_erro.getNome());
        System.out.println("custo do produto: " + teste_de_erro.getPreco());

    }
    
}
