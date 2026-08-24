package org.example;

public class Passaro implements Animal, Voador{

    @Override
    public void Comer() {
        System.out.println("O passaro esta comendo ");
    }

    @Override
    public void Voar() {
        System.out.println("O passaro esta voando ");
    }
}
