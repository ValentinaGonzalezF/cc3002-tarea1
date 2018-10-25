package tests;
import cc3002.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryTest {
    private Infantry infantry;
    private Archer archer;
    private Cavalry cavalry;
    private Castle castle;
    private Infantry infantry2;
    private Monk monk;
    private Siege siege;
    private Villager villager;
    private Barracks barracks;
    @Before
    public void create() {
        infantry= new Infantry(50,25);
        castle= new Castle(50, 100,20);
        archer = new Archer(50, 20);
        cavalry = new Cavalry(50, 15);
        infantry2=new Infantry(50,20);
        monk=new Monk(50,7);
        siege= new Siege(50,15);
        villager= new Villager(50,3);
        barracks= new Barracks(50, 110);
    }

    @Test
    public void getHitPoints() {
        assertEquals(50, infantry.getHitPoints(),0.002);
    }

    @Test
    public void setHitPoints() {
        infantry.setHitPoints(130);
        assertEquals(100,infantry.getHitPoints(),0.002);
    }

    @Test
    public void getAttackPoints() {
        assertEquals(25,infantry.getAttackPoints(),0.001);
    }

    @Test
    public void isAlive(){
        infantry.setHitPoints(-23);
        assertFalse(infantry.isAlive());
    }
    @Test
    public void attack() {
        infantry.attack(infantry2);
        assertEquals(25,infantry2.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCastle() {
        infantry.receiveAttackCastle(castle);
        assertEquals(26,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCavalry() {
        infantry.receiveAttackCavalry(cavalry);
        assertEquals(35,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackMonk() {
        infantry.receiveAttackMonk(monk);
        assertEquals(53.5,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackInfantry() {
        infantry.receiveAttackInfantry(infantry2);
        assertEquals(30,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackSiege() {
        infantry.receiveAttackSiege(siege);
        assertEquals(27.5,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackVillager() {
        infantry.receiveAttackVillager(villager);
        assertEquals(47.6,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackArcher() {
        infantry.receiveAttackArcher(archer);
        assertEquals(26,infantry.getHitPoints(),0.001);
    }



}