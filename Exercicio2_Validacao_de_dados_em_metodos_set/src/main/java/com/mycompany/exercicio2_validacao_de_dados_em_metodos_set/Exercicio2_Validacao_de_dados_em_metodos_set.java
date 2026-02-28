package com.mycompany.exercicio2_validacao_de_dados_em_metodos_set;

public class Exercicio2_Validacao_de_dados_em_metodos_set {

     public static void main(String[] args) {
        Produto objproduto = new Produto();
        objproduto.setNome("lapis");
        objproduto.setPreco(1.20);

        System.out.println("");

        System.out.println("teste se não aceita o preço negattivo:");
        objproduto.setNome("maça");
        objproduto.setPreco(-1.20);

    }
}
