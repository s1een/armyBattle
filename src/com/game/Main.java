package com.game;

public class Main {
    public static void main(String[] args) {
        var w1 = new Warrior();
        var w2 = new Knight();
        Battle.fight(w1,w2);
    }
}
