package com.mycompany.exercicio7_subclassea_atributoprotected;

public class Exercicio7_SubClassea_AtributoProtected {

    public static void main(String[] args) {
        Aluno objaluno = new Aluno();
        objaluno.setIdade(17);
        objaluno.setNome("Henrique Ibarra");
        System.out.println("nome do aluno: " + objaluno.getNome());
        System.out.println("idade do aluno: " + objaluno.getIdade());
    }
}
