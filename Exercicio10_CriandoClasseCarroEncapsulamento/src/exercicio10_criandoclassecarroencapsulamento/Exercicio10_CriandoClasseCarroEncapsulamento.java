package exercicio10_criandoclassecarroencapsulamento;

public class Exercicio10_CriandoClasseCarroEncapsulamento {

    public static void main(String[] args) {
        Carro objcarro = new Carro();
        objcarro.setMarca("Toyota");
        objcarro.setModelo("Corolla");
        System.out.println("Modelo do carro: " + objcarro.getModelo());
        System.out.println("marca do carro:: " + objcarro.getMarca());
        objcarro.verificarano(2019);
    }
    
}
