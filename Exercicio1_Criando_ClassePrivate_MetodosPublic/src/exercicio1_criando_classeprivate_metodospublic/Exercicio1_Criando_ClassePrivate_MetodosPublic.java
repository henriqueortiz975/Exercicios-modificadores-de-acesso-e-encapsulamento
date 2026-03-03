package exercicio1_criando_classeprivate_metodospublic;

public class Exercicio1_Criando_ClassePrivate_MetodosPublic {

        public static void main(String[] args) {
        Produto objproduto = new Produto();
        objproduto.setNome("lapis");
        objproduto.setPreco(1.20);
        
        System.out.println("Nome do produto: " + objproduto.getNome());
        System.out.println("custo do produto: " + objproduto.getPreco());
    }
}

    

