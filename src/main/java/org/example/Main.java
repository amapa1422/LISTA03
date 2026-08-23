package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void p(String texto)

    {
        System.out.println();
    }

    public static void l(String texto)

    {
        System.out.println("*********************************");
    }
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.Acelerar();
        moto.Acelerar();
        l("");

        Violao violao = new Violao();
        Piano piano = new Piano();

        violao.Tocar();
        piano.Tocar();
        l("");

        Geladeira geladeira =  new Geladeira();
        Microondas microondas = new Microondas();

        geladeira.Ligar();
        geladeira.Desligar();
        microondas.Ligar();
        microondas.Desligar();
        l("");

        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();

        quadrado.CalcularArea();
        circulo.CalcularArea();
        l("");

        Gerente gerente = new Gerente();
        Programador programador = new Programador();

        gerente.CalcularSalario();
        programador.CalcularSalario();




    }
}
