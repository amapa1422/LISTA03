package org.example;

import java.time.LocalTime;

public class Relogio implements Horario{

    @Override
    public String HoraAtual() {
        return LocalTime.now().toString();
    }
}
