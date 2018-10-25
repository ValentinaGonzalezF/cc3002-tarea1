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
        infantry= new Infantry(50,25);
        castle= new Castle(50, 100,20);
        archer = new Archer(50, 20);
        cavalry = new Cavalry(50, 15);
        monk2=new Monk(10,7);
        siege= new Siege(50,15);
        villager= new Villager(50,3);
        barracks= new Barracks(50, 110);
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
       monk.attack(monk2);
        assertEquals(12.5,monk2.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCastle() {
       monk.receiveAttackCastle(castle);
        assertEquals(0,monk.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCavalry() {
       monk.receiveAttackCavalry(cavalry);
        assertEquals(0,monk.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackMonk() {
        monk.receiveAttackMonk(monk2);
        assertEquals(53.5,monk.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackInfantry() {
        monk.receiveAttackInfantry(infantry);
        assertEquals(0,monk.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackSiege() {
        monk.receiveAttackSiege(siege);
        assertEquals(0,monk.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackVillager() {
        monk.receiveAttackVillager(villager);
        assertEquals(50,monk.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackArcher() {
        monk.receiveAttackArcher(archer);
        assertEquals(0,monk.getHitPoints(),0.001);
    }
}