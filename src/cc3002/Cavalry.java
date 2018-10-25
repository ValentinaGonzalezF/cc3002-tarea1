package cc3002;

public class Cavalry extends Unit {
    public Cavalry(double hitPoint,double attackPoint){
        super(hitPoint,attackPoint);
    }

    @Override
    public void attack(final Attackable atacado){
        if(isAlive()){
        atacado.receiveAttackCavalry(this);}
    }

    @Override
    public void receiveAttackCastle(Castle castle) {
        receiveDamage(castle.getAttackPoints()*1.2);
    }

    @Override
    public void receiveAttackCavalry(Cavalry cavalry) {
        receiveDamage(cavalry.getAttackPoints()*1.0);
    }

    @Override
    public void receiveAttackMonk(Monk monk) {
        receiveDamage(monk.getAttackPoints()*-0.5);
    }

    @Override
    public void receiveAttackInfantry(Infantry infantry) {
        receiveDamage(infantry.getAttackPoints()*1.2);
    }

    @Override
    public void receiveAttackSiege(Siege siege) {
        receiveDamage(siege.getAttackPoints()*1.0);
    }

    @Override
    public void receiveAttackVillager(Villager villager) {
        receiveDamage(villager.getAttackPoints()*0.5);
    }

    @Override
    public void receiveAttackArcher(Archer archer) {
        receiveDamage(archer.getAttackPoints()*1.0);
    }
}
