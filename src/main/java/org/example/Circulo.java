package org.example;

public class Circulo implements FormaGeometrica{
    double l = 5;

    @Override
    public void CalcularArea() {
        double area = l * l;
        System.out.println("A area do circulo e "+ area);
    }
}
