package exercicio3_contabancaria_saldoprotegido;

public class Exercicio3_ContaBancaria_SaldoProtegido {

    public static void main(String[] args) {
        ContaBancaria objconta = new ContaBancaria();
        objconta.titular = "Henrique Ibarra Ortiz Urbano";
        objconta.setSaldo(134.50);
        System.out.println("Titular da conta: " + objconta.titular);
        System.out.println("Saldo da conta atual: " + objconta.getSaldo());

        objconta.depositar(120);
        objconta.sacar(200);
   
    }
    
}
