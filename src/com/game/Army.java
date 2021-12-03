package com.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class Army {
    Collection<Warrior> units = new ArrayList<>();
    Army addUnits(String classWarrior,int count){
        for (int i = 0; i < count; i++) {
            Warrior warrior = Warrior.of(classWarrior);
            units.add(warrior);
        }
        return this;}

    public Optional<Warrior> getFirst() {
        return units.stream().filter(Warrior::isAlive).findFirst();
    }
}
