package cc3002;

import java.util.Calendar;

public class Monk extends Unit {
    public Monk(double hitPoints,double attackPoints,boolean canAttack){
        super(hitPoints,attackPoints,canAttack);
    }

    @Override
    public void attack(final Attackable atacado){
        atacado.receiveAttackMonk(this);
    }
    @Override
    public void receiveAttackCastle(Castle castle) {
        //receiveDamage(castle.getAttackPoints()*0.0);        lo mato
    }

    @Override
    public void receiveAttackCavalry(Cavalry cavalry) {
        //receiveDamage(cavalry.getAttackPoints()*1.5);
    }

    @Override
    public void receiveAttackMonk(Monk monk) {
        receiveDamage(monk.getAttackPoints()*-0.5);
    }

    @Override
    public void receiveAttackInfantry(Infantry infantry) {
        //receiveDamage(infantry.getAttackPoints()*1.5);
    }

    @Override
    public void receiveAttackSiege(Siege siege) {
        //receiveDamage(siege.getAttackPoints()*1.5);
    }

    @Override
    public void receiveAttackVillager(Villager villager) {
        receiveDamage(villager.getAttackPoints()*0.0);
    }

    @Override
    public void receiveAttackArcher(Archer archer) {
        //receiveDamage(archer.getAttackPoints()*1.5);
    }
}
