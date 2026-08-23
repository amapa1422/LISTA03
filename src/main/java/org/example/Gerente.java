package org.example;

public class Gerente implements Funcionario{
    double salario = 5000;
    double desconto = 245;

    @Override
    public void CalcularSalario() {
        double total = salario - desconto;
        System.out.println("O salario do gerente e de " + total);
    }
}
