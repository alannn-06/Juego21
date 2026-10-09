package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        int maximo = 10;
        
        System.out.println("Probrando generarAleatorio:");
        for (int i = 0; i < 100; i++) {
            int aleatorio = dealer.generarAleatorio(maximo);
            System.out.println("Aleatorio " + (i + 1) + ": " + aleatorio);
        }
    }
}