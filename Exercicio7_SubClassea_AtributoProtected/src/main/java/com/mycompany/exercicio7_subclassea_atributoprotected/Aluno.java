package com.mycompany.exercicio7_subclassea_atributoprotected;

public class Aluno extends Pessoa {
    public String nome;

    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
        public String getNome(){
        return nome;
    }
}
