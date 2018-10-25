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
    @Before
    public void create() {
        archer = new Archer(50, 20);
        castle = new Castle(50, 120, 10);
        cavalry = new Cavalry(50, 15);
        infantry=new Infantry(50,20);
        monk=new Monk(50,7);
        siege= new Siege(50,15);
        villager= new Villager(50,3);
        barracks= new Barracks(50, 110);
    }

    @Test
    public void getHitPoints() {
        assertEquals(50, barracks.getHitPoints(),0.002);
    }

    @Test
    public void setHitPoints() {
        barracks.setHitPoints(60);
        assertEquals(60,barracks.getHitPoints(),0.002);
    }

    @Test
    public void getMaxPoint() {
        assertEquals(110,barracks.getMaxPoint(),0.001);
    }
    @Test
    public void isAlive(){
        assertTrue(barracks.isAlive());
    }

    @Test
    public void receiveAttackCavalry() {
        barracks.receiveAttackCavalry(cavalry);
        assertEquals(39.5,barracks.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackMonk() {
        barracks.receiveAttackMonk(monk);
        assertEquals(50,barracks.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackInfantry() {
        barracks.receiveAttackInfantry(infantry);
        assertEquals(36,barracks.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackSiege() {
        barracks.receiveAttackSiege(siege);
        assertEquals(20,barracks.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackVillager() {
        barracks.receiveAttackVillager(villager);
        assertEquals(52.1,barracks.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackArcher() {
        barracks.receiveAttackArcher(archer);
        assertEquals(36,barracks.getHitPoints(),0.001);
    }
    public void receiveAttackCastle(){
        barracks.receiveAttackCastle(castle);
        assertEquals(43,barracks.getHitPoints(),0.001);
    }
}