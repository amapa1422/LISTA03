package org.example;

public class BancoDeDados implements Armazenamento{

    @Override
    public void Carregar() {
        System.out.println("O banco de dados esta sendo carrgado ");
    }

    @Override
    public void Salvar() {
        System.out.println("O banco de dados esta sendo salvo ");
    }
}
