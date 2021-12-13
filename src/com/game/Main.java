package com.game;

public class Main {
    public static void main(String[] args) {
        Army a1 = new Army();
        Army a2 = new Army();
        a1.addUnits("Lancer",1);
        a2.addUnits("Rookie",1);
        a2.addUnits("Defender",1);
        a2.addUnits("Healer",1);
        Battle.armyFight(a1,a2);

    }
}
