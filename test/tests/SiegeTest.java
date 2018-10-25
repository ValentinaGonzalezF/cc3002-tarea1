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
        infantry= new Infantry(50,25);
        castle= new Castle(50, 100,20);
        archer = new Archer(50, 20);
        cavalry = new Cavalry(50, 15);
        siege2= new Siege(50,15);
        villager= new Villager(50,3);
        barracks= new Barracks(50, 110);
        monk=new Monk(50,7);
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
        siege.attack(infantry);
        assertEquals(26,infantry.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCastle() {
        siege.receiveAttackCastle(castle);
        assertEquals(40,siege.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackCavalry() {
        siege.receiveAttackCavalry(cavalry);
        assertEquals(32,siege.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackMonk() {
        siege.receiveAttackMonk(monk);
        assertEquals(50,siege.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackInfantry() {
        siege.receiveAttackInfantry(infantry);
        assertEquals(20,siege.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackSiege() {
        siege.receiveAttackSiege(siege2);
        assertEquals(27.5,siege.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackVillager() {
        siege.receiveAttackVillager(villager);
        assertEquals(51.5,siege.getHitPoints(),0.001);
    }

    @Test
    public void receiveAttackArcher() {
        siege.receiveAttackArcher(archer);
        assertEquals(34,siege.getHitPoints(),0.001);
    }
}