package org.example;

public class Televisao implements ControleRemoto{

    @Override
    public void AumentarVolume() {
        System.out.println("O controle esta aumentando o volume da TV ");
    }

    @Override
    public void DiminuirVolume() {
        System.out.println("O controle esta diminuindo o volume da TV ");
    }
}
