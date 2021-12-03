package com.game;

public class Main {
    public static void main(String[] args) {
        var w1 = new Warrior();
        var w2 = new Knight();
        Battle.fight(w1,w2);
        var army1 = new Army();
        army1.addUnits("Warrior",5);
        var army2 = new Army();
        army2.addUnits("Knight",2);
        Battle.army_fight(army1,army2);
    }
}
