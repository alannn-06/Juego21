package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

    private ArrayList<Jugador> jugadores;
    private Dealer dealer;

    public Juego21() {
        jugadores = new ArrayList<Jugador>();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public void cargarValores() {
        if (dealer != null && dealer.getNaipe() != null) {
            for (Carta carta : dealer.getNaipe()) {
                String val = carta.getValor();
                if (val.equals("A")) {
                    carta.setValorJuego(11);
                } else if (val.equals("J") || val.equals("Q") || val.equals("K")) {
                    carta.setValorJuego(10);
                } else {
                    carta.setValorJuego(Integer.parseInt(val));
                }
            }
        }
    }

    public void inicializar() {
        dealer = new Dealer();
        cargarValores();
    }

    public void agregarJugador(Jugador jugador) {
        if (jugador != null) {
            jugadores.add(jugador);
        }
    }

    public void repartirCarta(Jugador jugador) {
        if (dealer != null && jugador != null) {
            Carta carta = dealer.entregarCarta();
            jugador.recibirCarta(carta);
        }
    }

    public void repartirRonda() {
        for (Jugador jugador : jugadores) {
            repartirCarta(jugador);
        }
    }
}