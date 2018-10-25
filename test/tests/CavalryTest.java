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
        castle= new Castle(50, 100,20);
        archer = new Archer(50, 20);
        cavalry2 = new Cavalry(50, 15);
        infantry=new Infantry(50,20);
        monk=new Monk(10,7);
        siege= new Siege(50,15);
        villager= new Villager(50,3);
        barracks= new Barracks(50, 110);
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
        cavalry.attack(infantry);
        assertEquals(40,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCastle() {
        cavalry.receiveAttackCastle(castle);
        assertEquals(26,cavalry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCavalry() {
        cavalry.receiveAttackCavalry(cavalry2);
        assertEquals(35,cavalry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackMonk() {
        cavalry.receiveAttackMonk(monk);
        assertEquals(53.5,cavalry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackInfantry() {
        cavalry.receiveAttackInfantry(infantry);
        assertEquals(26,cavalry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackSiege() {
        cavalry.receiveAttackSiege(siege);
        assertEquals(35.0,cavalry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackVillager() {
        cavalry.receiveAttackVillager(villager);
        assertEquals(48.5,cavalry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackArcher() {
        cavalry.receiveAttackArcher(archer);
        assertEquals(30,cavalry.getHitPoints(),0.001);
    }
}