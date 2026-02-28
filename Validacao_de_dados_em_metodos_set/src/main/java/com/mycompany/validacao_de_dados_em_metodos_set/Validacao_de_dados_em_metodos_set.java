/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validacao_de_dados_em_metodos_set;

/**
 *
 * @author User
 */
public class Validacao_de_dados_em_metodos_set {

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
