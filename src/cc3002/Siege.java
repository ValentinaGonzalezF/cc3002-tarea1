package cc3002;

public class Siege extends Unit{
    public Siege(double hitPoint,double attackPoint,boolean canAt){
        super(hitPoint,attackPoint,canAt);
    }

    @Override
    public void attack(final Attackable atacado){
        if(isAlive()){atacado.receiveAttackSiege(this);}
    }

    @Override
    public void receiveAttackCastle(Castle castle) {
        receiveDamage(castle.getAttackPoints()*0.5);
    }

    @Override
    public void receiveAttackCavalry(Cavalry cavalry) {
        receiveDamage(cavalry.getAttackPoints()*1.2);
    }

    @Override
    public void receiveAttackMonk(Monk monk) {
        receiveDamage(monk.getAttackPoints()*0.0);
    }

    @Override
    public void receiveAttackInfantry(Infantry infantry) {
        receiveDamage(infantry.getAttackPoints()*1.2);
    }

    @Override
    public void receiveAttackSiege(Siege siege) {
        receiveDamage(siege.getAttackPoints()*1.5);
    }

    @Override
    public void receiveAttackVillager(Villager villager) {
        receiveDamage(villager.getAttackPoints()*-0.5);
    }

    @Override
    public void receiveAttackArcher(Archer archer) {
        receiveDamage(archer.getAttackPoints()*0.8);
    }
}
