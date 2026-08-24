package org.example;

public class Twitch implements Transmissao{

    @Override
    public void IniciarTransmissao() {
        System.out.println("A transmissao da Twitch esta iniciando ");
    }

    @Override
    public void FinalizarTransmissao() {
        System.out.println("A transmissao da Twitch esta finalizando ");
    }
}
