package org.example;

public interface Banco {

    void Sacar();
    void Depositar();
    void VerSaldo();

    default double taxaJuros() {
        return 0;
    }
}
