package org.example;

public class CartaoDeCredito implements Pagamento{

    @Override
    public void Pagar() {
        System.out.println("O cartao de credito esta sendo pago ");
    }
}
