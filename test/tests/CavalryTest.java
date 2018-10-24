package tests;

import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryTest {
    private Archer archer;
    private Cavalry cavalry;
    private Castle castle;
    private Infantry infantry;
    private Monk monk;
    private Siege siege;
    private Villager villager;
    private Barracks barracks;
    private Cavalry cavalry2;
    @Before
    public void create() {
        cavalry= new Cavalry(50,10);
    }

    @Test
    public void getHitPoints() {
        assertEquals(50, cavalry.getHitPoints(),0.002);
    }

    @Test
    public void setHitPoints() {
        cavalry.setHitPoints(110);
        assertEquals(100,cavalry.getHitPoints(),0.002);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(10,cavalry.getAttackPoints(),0.001);
    }

    @Test
    public void isAlive(){
        assertTrue(cavalry.isAlive());
    }

    @Test
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