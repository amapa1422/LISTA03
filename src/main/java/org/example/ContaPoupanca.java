package org.example;

public class ContaPoupanca implements Banco{

    @Override
    public void Sacar() {
        System.out.println("Sacando");
    }

    @Override
    public void Depositar() {
        System.out.println("Depositando");
    }

    @Override
    public void VerSaldo() {
        System.out.println("Vendo saldo");
    }

    @Override
    public double taxaJuros() {
        return 10.5;
    }
}
