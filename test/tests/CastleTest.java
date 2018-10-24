package tests;

import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {
    private Castle castle;
    private Archer archer;
    private Cavalry cavalry;
    private Castle castle2;
    private Infantry infantry;
    private Monk monk;
    private Siege siege;
    private Villager villager;
    private Barracks barracks;
    @Before
    public void create() {
        castle= new Castle(50, 100,20);
    }

    @Test
    public void getHitPoints() {
        assertEquals(50, castle.getHitPoints(),0.002);
    }

    @Test
    public void setHitPoints() {
        castle.setHitPoints(80);
        assertEquals(80,castle.getHitPoints(),0.002);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(20,castle.getAttackPoints(),0.001);
    }

    @Test
    public void getMaxPoint() {
        assertEquals(100,castle.getMaxPoint(),0.001);
    }

    @Test
    public void isAlive(){
        assertTrue(castle.isAlive());
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
}