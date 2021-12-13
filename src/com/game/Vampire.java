package com.game;

public class Vampire extends Warrior{
    private int vampirism = 50;

    public Vampire() {
        super(40,4);

    }
    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void attack(Warrior warrior) {
        int currentDmg = warrior.getHealth();
        int tmp;
        warrior.getDamage(this);
        currentDmg -= warrior.getHealth();
        if(currentDmg >= warrior.getHealth()){
            tmp = currentDmg - warrior.getHealth();
            health += tmp;
        }else{
            healCalc(currentDmg);
        }
    }
    private void healCalc(int currentDmg){
        int r = health + (currentDmg * 50) / 100;
        if(r >= getInitHealth()) health = getInitHealth();
        else health = r;
    }
    @Override
    public void getDamage(hasAttack warrior){
       health -= warrior.getAttack();
    }
}
