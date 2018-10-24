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

    @Test
    public void receiveDamage(){

    }
}