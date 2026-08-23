package org.example;

public class Microondas implements EletroDomesticos{


    @Override
    public void Ligar() {
        System.out.println("O mircroondas esta sendo ligado ");
    }

    @Override
    public void Desligar() {
        System.out.println("O microondas esta sendo desligado ");
    }
}
