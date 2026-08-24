package org.example;

public class Administrador implements Autenticavel{

    @Override
    public void Login() {
        System.out.println("O administrador esta fazendo login ");
    }

    @Override
    public void Logout() {
        System.out.println("O usuario esta fazendo logout ");
    }
}
