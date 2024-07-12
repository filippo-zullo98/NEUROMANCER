package com.main;

import java.util.ArrayList;
import java.util.List;

/* main class */
public class Engine {
    private List<Player> players;

    public Engine() {
          players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
      players.add(player);
    }

    public void startGame() {
        // Logica per avviare il gioco
    }
        // metti qui gli altri metodi
}
