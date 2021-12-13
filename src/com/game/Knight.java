package com.game;

public class Knight extends Warrior {
    private int attack = 7;
    public Knight() {
        super(50, 7);
    }
    @Override
    public int getAttack() {
        return attack;
    }
}
