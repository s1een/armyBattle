package com.game;

public class Healer extends Warrior{
    private static int heal = 2;
   public Healer(){
       super(60,0);
   }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void healPerson(Warrior warrior){
       if(warrior.getInitHealth() < warrior.getHealth() + heal){
           warrior.health = warrior.getInitHealth();
       }else{
           warrior.health += heal;
       }
    }
        @Override
    public void handleSignalFrom(Warrior warrior) {
       healPerson(warrior);
       super.transmitSignal();
    }
}
