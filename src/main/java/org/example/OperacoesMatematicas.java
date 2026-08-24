package org.example;

public interface OperacoesMatematicas {

    void Somar();
    void Subtrair();
    void Multiplicar();
    void Dividir();

    default void Potencial() {
        System.out.println("Calculando potencia ");
    }
}
