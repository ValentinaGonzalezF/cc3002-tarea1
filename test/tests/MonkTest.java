package tests;
import cc3002.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkTest {
    private Monk monk;
    private Archer archer;
    private Cavalry cavalry;
    private Castle castle;
    private Infantry infantry;
    private Monk monk2;
    private Siege siege;
    private Villager villager;
    private Barracks barracks;
    @Before
    public void create() {
        monk= new Monk(50,5);
    }

    @Test
    public void getHitPoints() {
        assertEquals(50, monk.getHitPoints(),0.002);
    }

    @Test
    public void setHitPoints() {
        monk.setHitPoints(1300);
        assertEquals(100,monk.getHitPoints(),0.002);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(5,monk.getAttackPoints(),0.001);
    }

    @Test
    public void isAlive(){
        monk.setHitPoints(0);
        assertFalse(monk.isAlive());
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
    public void receiveAttackSiege() {
    }

    @Test
    public void receiveAttackVillager() {
    }

    @Test
    public void receiveAttackArcher() {
    }
}