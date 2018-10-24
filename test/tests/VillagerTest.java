package tests;

import cc3002.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VillagerTest {
    Villager vil;

    @Before public void create() {
        vil = new Villager(50, 10);
    }

    @Test
    public void getPoint(){
        assertEquals(50,vil.getHitPoints(),0.002);
    }
    public void attack() {

    }

    @Test
    public void receiveAttackCastle() {
    }

    @Test
    public void receiveAttackCavalry() {
    }

    @Test
    public void receiveAttackMonk() {
    }

    @Test
    public void receiveAttackInfantry() {
    }

    @Test
    public void receiveAttackSiege() {
    }

    @Test
    public void receiveAttackVillager() {
    }

    @Test
    public void receiveAttackArcher() {
    }
}