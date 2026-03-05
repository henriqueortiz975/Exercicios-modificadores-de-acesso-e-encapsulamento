package exercicio5_criandoclasse_funcionarioprivatepublic;

public class Exercicio5_CriandoClasse_FuncionarioPrivatePublic {

    public static void main(String[] args) {
        Funcionario objfuncionario = new Funcionario();
        objfuncionario.setNome("Henrique Ibarra");
        objfuncionario.setSalario(1343.30);
        
        System.out.println("Funcionario: " + objfuncionario.getNome());
        System.out.println("Salario: " + objfuncionario.getSalario());

    }
    
}
