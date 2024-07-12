package com.main;

public class Player {
    private String name;
    private String role;
    private int health;
    private int stamina;

    // Constructor
    public Player(String name, String role) {
        this.name = name;
        this.role = role;
        this.health = 100; // start value
        this.stamina = 100; // start value
    }
}
