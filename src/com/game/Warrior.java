package com.game;

import java.util.Objects;

public class Warrior implements hasAttack{
    protected int health;
    protected int attack;
    private Warrior behind;
    private int initialHealth;
   public static Warrior of(String clazz){
        switch (clazz){
            case "Warrior":
                return new Warrior();
            case "Knight":
                return new Knight();
            case "Defender":
                return new Defender();
            case "Rookie":
                return new Rookie();
            case "Vampire":
                return new Vampire();
            case "Lancer":
                return new Lancer();
            case "Healer":
                return new Healer();
            default:
                throw new IllegalArgumentException("Unknown Warrior type: " + clazz);
        }
    }
    public Warrior(int hp,int dmg) {
        health = hp;
        attack = dmg;
        setInitHealth(hp);
    }
    public Warrior(){
       health = 50;
       attack = 5;
       setInitHealth(health);
    }

    public void transmitSignal(){
       if(!Objects.isNull(this.getBehind())){
           this.getBehind().handleSignalFrom(this);
       }
    }
    public void handleSignalFrom(Warrior warrior){
       if(!Objects.isNull(warrior.getBehind())){
           warrior.getBehind().transmitSignal();
       }
    }
    private void setInitHealth(int hp){
       initialHealth = hp;
    }
    public int getInitHealth(){
       return initialHealth;
    }
    protected Warrior getBehind() {
        return behind;
    }

    public void setBehind(Warrior behind) {
        this.behind = behind;
    }
    protected void setBehindWarrior(Warrior warrior){
       setBehind(warrior);
    }

    public boolean isAlive(){
        return health > 0;
    }

    public int getHealth() {
        return health;
    }
    public int getAttack() {
        return attack;
    }
    public void attack (Warrior warrior){
        warrior.getDamage(this);
        transmitSignal();
    }
    public void getDamage(hasAttack warrior){
        health -= warrior.getAttack();
    }

}
