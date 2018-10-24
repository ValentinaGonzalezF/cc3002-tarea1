package tests;
import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArcherTest {
    private Archer archer;
    private Cavalry cavalry;
    private Castle castle;
    private Archer archer2;
    private Infantry infantry;
    private Monk monk;
    private Siege siege;
    private Villager villager;
    private Barracks barracks;
    @Before
    public void create() {
        archer= new Archer(50, 10);
    }

    @Test
    public void getHitPoints() {
        assertEquals(50, archer.getHitPoints(),0.002);
    }

    @Test
    public void setHitPoints() {
        archer.setHitPoints(70);
        assertEquals(70.0,archer.getHitPoints(),0.002);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(10,archer.getAttackPoints(),0.001);
    }

    @Test
    public void isAlive(){
        assertTrue(archer.isAlive());
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