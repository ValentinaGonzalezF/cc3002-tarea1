package cc3002;

public class Monk extends Unit {
    public Monk(double hitPoints,double attackPoints){
        super(hitPoints,attackPoints);
    }

    @Override
    public void attack(final Attackable atacado){
        if (isAlive()){atacado.receiveAttackMonk(this);}
    }
    @Override
    public void receiveAttackCastle(Castle castle) {
        this.setHitPoints(0);
    }

    @Override
    public void receiveAttackCavalry(Cavalry cavalry) {
        this.setHitPoints(0);
    }

    @Override
    public void receiveAttackMonk(Monk monk) {
        receiveDamage(monk.getAttackPoints()*-0.5);
    }

    @Override
    public void receiveAttackInfantry(Infantry infantry) {
        this.setHitPoints(0);
    }

    @Override
    public void receiveAttackSiege(Siege siege) {
        this.setHitPoints(0);
    }

    @Override
    public void receiveAttackVillager(Villager villager) {
        receiveDamage(villager.getAttackPoints()*0.0);
    }

    @Override
    public void receiveAttackArcher(Archer archer) {
        this.setHitPoints(0);
    }
}
