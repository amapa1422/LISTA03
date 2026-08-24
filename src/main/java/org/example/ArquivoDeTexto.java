package org.example;

public class ArquivoDeTexto implements Armazenamento{

    @Override
    public void Carregar() {
        System.out.println("O arquivo de texto esta sendo carrgado ");
    }

    @Override
    public void Salvar() {
        System.out.println("O banco de dados esta sendo salvo ");
    }
}
