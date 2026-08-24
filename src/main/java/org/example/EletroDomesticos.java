package org.example;

public interface EletroDomesticos {

    void Ligar();
    void Desligar();

    default void VerificarEstado() {
        System.out.println("Verificando estado ");
    }
}
