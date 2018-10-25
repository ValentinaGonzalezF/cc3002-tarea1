package tests;

import cc3002.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VillagerTest {
    private Villager villager;
    private Archer archer;
    private Cavalry cavalry;
    private Castle castle;
    private Infantry infantry;
    private Monk monk;
    private Siege siege;
    private Villager villager2;
    private Barracks barracks;


    @Before public void create() {
        villager = new Villager(50, 10);
        infantry= new Infantry(50,25);
        castle= new Castle(50, 100,20);
        archer = new Archer(50, 20);
        cavalry = new Cavalry(50, 15);
        siege= new Siege(50,15);
        villager2= new Villager(50,3);
        barracks= new Barracks(50, 110);
        monk= new Monk(50,7);
    }

    @Test
    public void getHitPoint(){
        assertEquals(50,villager.getHitPoints(),0.002);
    }

    public void setHitPoints() {
        villager.setHitPoints(0);
        assertEquals(0,villager.getHitPoints(),0.002);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(10,villager.getAttackPoints(),0.001);
    }

    @Test
    public void isAlive(){
        villager.setHitPoints(0);
        assertFalse(villager.isAlive());
    }

    @Test
    public void attack() {
        villager.attack(infantry);
        assertEquals(42,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCastle() {
        villager.receiveAttackCastle(castle);
        assertEquals(26,villager.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCavalry() {
        villager.receiveAttackCavalry(cavalry);
        assertEquals(27.5,villager.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackMonk() {
        villager.receiveAttackMonk(monk);
        assertEquals(53.5,villager.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackInfantry() {
        villager.receiveAttackInfantry(infantry);
        assertEquals(12.5,villager.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackSiege() {
        villager.receiveAttackSiege(siege);
        assertEquals(27.5,villager.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackVillager() {
        villager.receiveAttackVillager(villager2);
        assertEquals(47,villager.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackArcher() {
        villager.receiveAttackArcher(archer);
        assertEquals(20,villager.getHitPoints(),0.001);
    }
}