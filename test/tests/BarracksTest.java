package tests;

import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarracksTest {
    private Barracks barracks;
    private Archer archer;
    private Cavalry cavalry;
    private Castle castle;
    private Infantry infantry;
    private Monk monk;
    private Siege siege;
    private Villager villager;
    private Barracks barracks2;
    @Before
    public void create() {
        barracks= new Barracks(50, 15);
    }

    @Test
    public void getHitPoints() {
        assertEquals(50, barracks.getHitPoints(),0.002);
    }

    @Test
    public void setHitPoints() {
        barracks.setHitPoints(60);
        assertEquals(15,barracks.getHitPoints(),0.002);
    }

    @Test
    public void getMaxPoint() {
        assertEquals(15,barracks.getMaxPoint(),0.001);
    }
    @Test
    public void isAlive(){
        assertTrue(barracks.isAlive());
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