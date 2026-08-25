package org.example;

public class Deezer implements Musica{

    @Override
    public void Play() {
        System.out.println("Deezer tocando");
    }

    @Override
    public void Pause() {
        System.out.println("Deezer pausado");
    }

    @Override
    public void Stop() {
        System.out.println("Deezer parado");
    }
}
