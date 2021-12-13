package com.game;

public class Rookie extends Warrior{
    private int health = 7;
    private static int attack = 1;
    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public void getDamage(hasAttack warrior) {
        health -= warrior.getAttack();
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
