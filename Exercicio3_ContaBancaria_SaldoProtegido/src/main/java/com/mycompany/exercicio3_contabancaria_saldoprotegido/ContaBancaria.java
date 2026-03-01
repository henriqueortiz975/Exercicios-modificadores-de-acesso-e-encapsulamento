package com.mycompany.exercicio3_contabancaria_saldoprotegido;

public class ContaBancaria {
    public String titular;
    private double saldo;

    public double getSaldo(){
        System.out.println("conta: " + titular);
        System.out.println("saldo: " + saldo);
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(int depositar){
        saldo += depositar;
        System.out.println("a quantidade que foi depositada: " + depositar);
    }

    public void sacar(int sacar){
        System.out.println("a quantidade do saque requirido foi: " + sacar);
        if(saldo > sacar){
            System.out.println("seu saque de: " + sacar + " foi completo.");
            saldo -= sacar;
            System.out.println("seu saldo de agora é: " + saldo);
        }else{
            System.out.println("seu saque de: " + sacar + " foi recusada por ser acima do valor.");
        }
    }

}
