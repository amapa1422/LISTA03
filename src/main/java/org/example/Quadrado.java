package org.example;

public class Quadrado implements FormaGeometrica{
    double raio = 5;

    @Override
    public void CalcularArea() {
        double area = 3.14 * raio*raio;
        System.out.println("Area " + area);
    }
}
