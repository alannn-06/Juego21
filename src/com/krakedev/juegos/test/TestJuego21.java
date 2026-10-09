package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {
        Juego21 juego = new Juego21();

        Jugador j1 = new Jugador("Alan");
        Jugador j2 = new Jugador("Carlos");
        Jugador j3 = new Jugador("Sofia");

        juego.agregarJugador(j1);
        juego.agregarJugador(j2);
        juego.agregarJugador(j3);

        System.out.println("--- INICIANDO SIMULACIÓN DE 10 PARTIDAS DE JUEGO 21 ---");

        for (int partida = 1; partida <= 10; partida++) {
            for (Jugador j : juego.getJugadores()) {
                j.getCartas().clear();
                j.setPuntajeCartas(0);
            }

            juego.inicializar();

            System.out.println("\n--- PARTIDA #" + partida + " ---");
            ArrayList<Jugador> ganadores = juego.jugar();

            for (Jugador j : juego.getJugadores()) {
                System.out.println("Jugador " + j.getNickname() + " - Puntaje total: " + j.getPuntajeCartas());
            }

            if (!ganadores.isEmpty()) {
                System.out.println("TENEMOS GANADOR EN LA PARTIDA " + partida );
                for (Jugador g : ganadores) {
                    System.out.println(g.getNickname() + " con 21 puntos.");
                }
            } else {
                System.out.println("No hubo ganadores con 21 puntos en esta partida.");
            }
        }
    }
}