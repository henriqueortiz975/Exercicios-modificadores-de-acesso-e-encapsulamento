package com.mycompany.criando_uma_classe_com_private_e_metodos_public;

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
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void status(){
        System.out.println(nome);
        System.out.println(preco);
    }
    
}
