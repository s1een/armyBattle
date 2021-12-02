package com.game;

public class Battle {
    public static boolean fight(Warrior w1, Warrior w2) {
        Warrior attacker = w1;
        Warrior defender = w2;
        while (attacker.isAlive()){
            Warrior.attack(attacker,defender);
            var temp = new Warrior();
            temp = defender;
            defender = attacker;
            attacker = temp;
        }
        var res = w1.isAlive();
        System.out.println(res ? "Winner -> Warrior 1": "Winner -> Warrior 2");
        return w1.isAlive();
    }
}
