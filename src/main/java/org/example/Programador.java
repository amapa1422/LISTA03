package org.example;

public class Programador implements Funcionario{
    double salario =  4000;
    double desconto = 245;


    @Override
    public void CalcularSalario() {
        double total = salario - desconto;
        System.out.println("O salario do programador e de "+ total);
    }
}
