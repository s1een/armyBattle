package com.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    @DisplayName("Test 1: Warrior vs Knight")
    void Test1() {
        var carl = new Warrior();
        var jim = new Knight();


        var result = Battle.fight(carl, jim);

        assertFalse(result, "Carl should have lose");
    }

    @Test
    @DisplayName("Test 2: Knight vs Warrior")
    void Test2() {
        var ramon = new Knight();
        var slevin = new Warrior();


        var result = Battle.fight(ramon, slevin);

        assertTrue(result, "Ramon should have won");
    }

    @Test
    @DisplayName("Test 3: Warrior vs Warrior")
    void Test3() {
        var bob = new Warrior();
        var mars = new Warrior();

        Battle.fight(bob, mars);
        var result = bob.isAlive();

        assertTrue(result, "Bob is Alive");
    }

    @Test
    @DisplayName("Test 4: Knight vs Warrior")
    void Test4() {
        var zeus = new Knight();
        var godkiller = new Warrior();

        Battle.fight(zeus, godkiller);
        var result = zeus.isAlive();

        assertTrue(result, "Zeus is Alive");
    }

    @Test
    @DisplayName("Test 5: Warrior vs Warrior")
    void Test5() {
        var husband = new Warrior();
        var wife = new Warrior();

        Battle.fight(husband, wife);
        var result = wife.isAlive();

        assertFalse(result, "Wife is Alive");
    }

    @Test
    @DisplayName("Test 6: Warrior vs Knight")
    void Test6() {
        var dragon = new Warrior();
        var knight = new Knight();

        Battle.fight(dragon, knight);
        var result = knight.isAlive();

        assertTrue(result, "Knight is Alive");
    }

    @Test
    @DisplayName("Test 7: Warrior vs Knight")
    void Test7() {
        var unit_1 = new Warrior();
        var unit_2 = new Knight();
        var unit_3 = new Warrior();
        Battle.fight(unit_1, unit_2);
        var result = Battle.fight(unit_2, unit_3);

        assertFalse(result, "unit_2 should have won");
    }
    @Test
    @DisplayName("Battle 1")
    void Test8(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",1);
        army_2.addUnits("Warrior",2);
        var result =  Battle.army_fight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 2")
    void Test9(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",2);
        army_2.addUnits("Warrior",3);
        var result =  Battle.army_fight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 3")
    void Test10(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",5);
        army_2.addUnits("Warrior",7);
        var result =  Battle.army_fight(army_1,army_2);
        assertFalse(result,"Army_2 should have won");
    }
    @Test
    @DisplayName("Battle 4")
    void Test11(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",20);
        army_2.addUnits("Warrior",21);
        var result =  Battle.army_fight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 5")
    void Test12(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",10);
        army_2.addUnits("Warrior",11);
        var result =  Battle.army_fight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
    @Test
    @DisplayName("Battle 6")
    void Test13(){
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits("Warrior",11);
        army_2.addUnits("Warrior",7);
        var result =  Battle.army_fight(army_1,army_2);
        assertTrue(result,"Army_1 should have won");
    }
}