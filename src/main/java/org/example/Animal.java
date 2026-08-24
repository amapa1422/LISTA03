package org.example;

public interface Animal {

    void Comer();

    default void dormir(){
        System.out.println("Zzzz... ");
    }
}
