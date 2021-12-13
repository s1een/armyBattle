package com.game;

public class Defender extends Warrior{
    private int defense = 2;

    public Defender() {
        super(60, 3);
    }

    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }

    @Override
    public void getDamage(hasAttack warrior){
        if (defense > warrior.getAttack()){
            health = 60;
        }
        else{
        health -= warrior.getAttack() - defense;}
    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
