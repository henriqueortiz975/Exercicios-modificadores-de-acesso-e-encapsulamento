package com.mycompany.exercicio1_criando_classeprivate_metodospublic;

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
        this.preco = preco;
        System.out.println(preco);
    }

}
