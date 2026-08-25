package org.example;

public interface Repositorio<T> {

    void Salvar(T objeto);

    T Buscar (int id);
}
