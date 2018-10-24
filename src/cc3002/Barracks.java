package cc3002;

public class Barracks extends Building{
    public Barracks(double hitPoint,double maxP){
        super(hitPoint,maxP);
    }
    @Override
    public void receiveAttackCastle(Castle castle){
        receiveDamage(castle.getAttackPoints()*0.7);
    }
    @Override
    public void receiveAttackCavalry(Cavalry cavalry){
        receiveDamage(cavalry.getAttackPoints()*0.7);
    }
    @Override
    public void receiveAttackMonk(Monk monk){
        receiveDamage(monk.getAttackPoints()*0.0);
    }
    @Override
    public void receiveAttackInfantry(Infantry infantry){
        receiveDamage(infantry.getAttackPoints()*0.7);
    }
    @Override
    public void receiveAttackSiege(Siege siege){
        receiveDamage(siege.getAttackPoints()*2.0);
    }
    @Override
    public void receiveAttackVillager(Villager villager){
        receiveDamage(villager.getAttackPoints()*-0.7);
    }

    @Override
    public void receiveAttackArcher(Archer villager ) {
        receiveDamage(villager.getAttackPoints()*-0.7);

    }
}
