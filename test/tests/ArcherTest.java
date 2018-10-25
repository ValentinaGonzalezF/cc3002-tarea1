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
        archer= new Archer(50, 20);
        castle=new Castle(50,120,10);
        cavalry=new Cavalry(50,15);
        archer2=new Archer(50,10);
        infantry=new Infantry(50,20);
        monk=new Monk(50,7);
        siege= new Siege(50,15);
        villager= new Villager(50,3);
        barracks=new Barracks(50,120);
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
        assertEquals(20,archer.getAttackPoints(),0.001);
    }

    @Test
    public void isAlive(){
        assertTrue(archer.isAlive());
    }
    @Test
    public void attack() {
        archer.attack(castle);
        assertEquals(48,castle.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCastle() {
        archer.receiveAttackCastle(castle);
        assertEquals(38,archer.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCavalry() {
        archer.receiveAttackCavalry(cavalry);
        assertEquals(27.5,archer.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackMonk() {
        archer.receiveAttackMonk(monk);
        assertEquals(53.5,archer.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackInfantry() {
        archer.receiveAttackInfantry(infantry);
        assertEquals(26,archer.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackSiege() {
        archer.receiveAttackSiege(siege);
        assertEquals(27.5,archer.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackVillager() {
        archer.receiveAttackVillager(villager);
        assertEquals(47,archer.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackArcher() {
        archer.receiveAttackArcher(archer2);
        assertEquals(38,archer.getHitPoints(),0.001);
    }
}