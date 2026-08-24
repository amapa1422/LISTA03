package org.example;

public class Boleto implements Pagamento{

    @Override
    public void Pagar() {
        System.out.println("O boleto esta sendo pago ");
    }
}
