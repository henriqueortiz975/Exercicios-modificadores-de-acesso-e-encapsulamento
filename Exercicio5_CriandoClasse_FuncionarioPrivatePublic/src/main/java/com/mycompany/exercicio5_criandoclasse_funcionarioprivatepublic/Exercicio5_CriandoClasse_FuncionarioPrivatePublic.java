package com.mycompany.exercicio5_criandoclasse_funcionarioprivatepublic;

public class Exercicio5_CriandoClasse_FuncionarioPrivatePublic {

    public static void main(String[] args) {
        Funcionario objfuncionario = new Funcionario();
        objfuncionario.setNome("Henrique Ibarra");
        objfuncionario.setSalario(1320.40);
        
        System.out.println("nome do funcionario: " + objfuncionario.getNome());
        System.out.println("salario do funcionario: " + objfuncionario.getSalario());


    }
}
