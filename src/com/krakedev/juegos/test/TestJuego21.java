package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {
        Juego21 juego = new Juego21();

        juego.agregarJugador(new Jugador("Jugador 1"));
        juego.agregarJugador(new Jugador("Jugador 2"));
        juego.agregarJugador(new Jugador("Jugador 3"));

        juego.inicializar();
        juego.repartirRonda();

        System.out.println("--- CARTAS REPARTIDAS A LOS JUGADORES ---");
        for (Jugador j : juego.getJugadores()) {
            j.imprimir();
            System.out.println("-----------------------------------------");
        }
    }
}