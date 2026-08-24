package org.example;

public interface Imprimivel {

    void Imprimir();

    default void MostrarMonitor() {
        System.out.println("Exibindo no Monitor ");
    }
}
