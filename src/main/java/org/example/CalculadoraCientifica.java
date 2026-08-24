package org.example;

public class CalculadoraCientifica implements OperacoesMatematicas{

    double n1 = 20;
    double n2 = 45;

    @Override
    public void Somar() {
        System.out.println("Somando");
    }

    @Override
    public void Subtrair() {
        System.out.println("Subtraindo");
    }

    @Override
    public void Multiplicar() {
        System.out.println("Multiplicando");
    }

    @Override
    public void Dividir() {
        System.out.println("Dividindo");
    }
}
