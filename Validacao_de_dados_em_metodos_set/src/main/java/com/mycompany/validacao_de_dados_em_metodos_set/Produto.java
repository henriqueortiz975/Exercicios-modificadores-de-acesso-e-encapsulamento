package com.mycompany.validacao_de_dados_em_metodos_set;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
        System.out.println(nome);
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if(preco > 0){         
        this.preco = preco;
            System.out.println(preco);
       }else{
            System.out.println("ERRO-valor invalido-ERRO");
        }   
    }

}
