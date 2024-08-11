package org.example;

public interface AparelhoTelefonico {
    default void ligar() {
        System.out.println("Ligando telefone");
    }
    default  void atender() {
        System.out.println("Atendendo telefone");
    }
    default void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
}
