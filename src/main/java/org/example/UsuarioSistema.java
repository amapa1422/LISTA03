package org.example;

public class UsuarioSistema implements Autenticavel{

    @Override
    public void Login() {
        System.out.println("O usuario esta fazendo login ");
    }

    @Override
    public void Logout() {
        System.out.println("O usuario esta fazendo logout ");
    }
}
