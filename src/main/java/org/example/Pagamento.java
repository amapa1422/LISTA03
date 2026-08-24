package org.example;

public interface Pagamento {

    void Pagar();
    default void CancelarPagamento() {
        System.out.println("Cancelamento no metodo de pagamento ");
    }
}
