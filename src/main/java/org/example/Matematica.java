package org.example;

public class Matematica implements Utilitario{

    @Override
    public int CalcularFatorial(int numero) {

        int resultado = 1;


        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }
}
