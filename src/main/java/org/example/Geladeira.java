package org.example;

public class Geladeira implements EletroDomesticos{

    @Override
    public void Ligar() {
        System.out.println("A geladeira esta sendo ligada ");
    }

    @Override
    public void Desligar() {
        System.out.println("A geladeira esta sendo desligado ");
    }
}
