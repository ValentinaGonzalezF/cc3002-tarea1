package tests;
import cc3002.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SiegeTest {
    private Archer archer;
    private Cavalry cavalry;
    private Castle castle;
    private Infantry infantry;
    private Monk monk;
    private Siege siege;
    private Villager villager;
    private Barracks barracks;
    private Siege siege2;

    @Before
    public void create() {
        siege= new Siege(50,16);
    }

    @Test
    public void getHitPoints() {
        assertEquals(50, siege.getHitPoints(),0.002);
    }

    @Test
    public void setHitPoints() {
        siege.setHitPoints(-20);
        assertEquals(0,siege.getHitPoints(),0.002);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(16,siege.getAttackPoints(),0.001);
    }

    @Test
    public void isAlive(){
        assert(siege.isAlive());
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
    public void receiveAttacksiege() {
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