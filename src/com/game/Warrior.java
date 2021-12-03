package com.game;

public class Warrior {
   public static Warrior of(String clazz){
        switch (clazz){
            case "Warrior":
                return new Warrior();
            case "Knight":
                return new Knight();
            default:
                throw new IllegalArgumentException("Unknown Warrior type: " + clazz);
        }
    }
    private int health = 50;
    private static int attack = 5;

    public boolean isAlive(){
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public void attack (Warrior warrior){
        warrior.getDamage(this);
    }
    private void getDamage(Warrior warrior){
        health -= warrior.getAttack();
    }
}
