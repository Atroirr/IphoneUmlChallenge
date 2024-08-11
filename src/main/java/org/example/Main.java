package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Musica");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}