package com.mycompany.exercicio3_contabancaria_saldoprotegido;

public class Exercicio3_ContaBancaria_SaldoProtegido {

    public static void main(String[] args) {
        ContaBancaria objconta = new ContaBancaria();
        objconta.titular = "Henrique Ibarra Ortiz Urbano";
        objconta.setSaldo(134.50);
        objconta.getSaldo();
        objconta.depositar(120);
        objconta.sacar(200);

    }

}
