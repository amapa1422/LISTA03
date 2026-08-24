package org.example;

public class ContaCorrente implements Banco{

    @Override
    public void Sacar() {
        System.out.println("Esta sacando do banco na conta corrente ");
    }

    @Override
    public void Depositar() {
        System.out.println("Esta depositando do banco na conta corrente ");
    }

    @Override
    public void VerSaldo() {
        System.out.println("Esta vendo o saldo do banco na conta corrente ");
    }
}
