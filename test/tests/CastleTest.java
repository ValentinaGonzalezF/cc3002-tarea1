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
        archer = new Archer(50, 20);
        castle2 = new Castle(50, 120, 600);
        cavalry = new Cavalry(50, 15);
        infantry=new Infantry(50,20);
        monk=new Monk(50,7);
        siege= new Siege(50,15);
        villager= new Villager(50,3);
        barracks= new Barracks(50, 110);
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
        castle.attack(infantry);
        assertEquals(26,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCastle() {
        castle.receiveAttackCastle(castle2);
        assertEquals(0,castle.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCavalry() {
        castle.receiveAttackCavalry(cavalry);
        assertEquals(45.5,castle.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackMonk() {
        castle.receiveAttackMonk(monk);
        assertEquals(50,castle.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackInfantry() {
        castle.receiveAttackInfantry(infantry);
        assertEquals(44,castle.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackSiege() {
        castle.receiveAttackSiege(siege);
        assertEquals(20.0,castle.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackVillager() {
        castle.receiveAttackVillager(villager);
        assertEquals(50.9,castle.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackArcher() {
        castle.receiveAttackArcher(archer);
        assertEquals(48,castle.getHitPoints(),0.001);
    }
}