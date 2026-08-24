package org.example;

public class Calculadora implements OperacoesMatematicas{
    double n1 = 4;
    double n2 = 2;

    @Override
    public void Somar() {
        double total = n1 + n2;
        System.out.println("O resultado da soma e de "+total);
    }

    @Override
    public void Subtrair() {
        double total = n1 - n2;
        System.out.println("O resultado da subtracao e de "+total);
    }

    @Override
    public void Multiplicar() {
        double total = n1 * n2;
        System.out.println("O resultado da multiplicacao e de "+total);
    }

    @Override
    public void Dividir() {
        double total = n1 / n2;
        System.out.println("O resultado da divisao e de "+total);
    }
}
