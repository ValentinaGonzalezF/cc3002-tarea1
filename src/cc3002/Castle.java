package cc3002;

public class Castle extends Building implements Attacker{
    private double pointsAttack;

    public Castle(double hitPoint, double maxP, double pointAttack){
        super(hitPoint,maxP);
        this.pointsAttack=pointsAttack;
    }
    @Override
    public void attack(final Attackable atacado){
        if (isAlive()){atacado.receiveAttackCastle(this);}
    }
    @Override
    public double getAttackPoints() {
        return pointsAttack;
    }
    @Override
    public void receiveAttackCastle(Castle castle){
        receiveDamage(castle.getAttackPoints()*0.1);
    }
    @Override
    public void receiveAttackCavalry(Cavalry cavalry){
        receiveDamage(cavalry.getAttackPoints()*0.3);
    }
    @Override
    public void receiveAttackMonk(Monk monk){
        receiveDamage(monk.getAttackPoints()*0.0);
    }
    @Override
    public void receiveAttackInfantry(Infantry infantry){
        receiveDamage(infantry.getAttackPoints()*0.3);
    }
    @Override
    public void receiveAttackSiege(Siege siege){
        receiveDamage(siege.getAttackPoints()*2.0);
    }
    @Override
    public void receiveAttackVillager(Villager villager){
        receiveDamage(villager.getAttackPoints()*-0.3);
    }
    @Override
    public void receiveAttackArcher(Archer archer){
        receiveDamage(archer.getAttackPoints()*0.1);
    }


}
