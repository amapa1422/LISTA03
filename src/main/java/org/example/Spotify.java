package org.example;

public class Spotify implements Musica{

    @Override
    public void Play() {
        System.out.println("Spotify tocando");
    }

    @Override
    public void Pause() {
        System.out.println("Spotify pausado");
    }

    @Override
    public void Stop() {
        System.out.println("Spotify parado");
    }
}
