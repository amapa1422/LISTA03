package org.example;

public class RepositorioCliente implements Repositorio<Cliente>{


    @Override
    public void Salvar(Cliente objeto) {
        System.out.println("Cliente salvo ");
    }

    @Override
    public Cliente Buscar(int id) {
        System.out.println("Buscando cliente ");
        return null;
    }


}
