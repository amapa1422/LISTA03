package org.example;

public class Temperatura implements Conversor{

    @Override
    public double converter(double celsius) {
        return (celsius * 9/ 5) + 32;
    }
}
