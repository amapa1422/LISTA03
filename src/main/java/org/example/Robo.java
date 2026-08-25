package org.example;

public class Robo implements Movivel{

    @Override
    public void MoverParaFrente() {
        System.out.println("O robo esta se movendo para frente ");
    }

    @Override
    public void MoverParaTras() {
        System.out.println("O robo esta se movendo para tras ");
    }
}
