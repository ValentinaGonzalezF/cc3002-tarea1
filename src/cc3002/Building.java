package cc3002;

public abstract class Building implements Attackable {
    private double maxPoint;
    private double hitPoints;

    protected Building(double hitPoints,double maxPoint){
        this.hitPoints=hitPoints;
        this.maxPoint=maxPoint;
    }

    public void setHitPoints(double hp) {
        if (hp>maxPoint){
            hitPoints=maxPoint;
        }
        else if(hp<0){
            hitPoints=0;
        }
        else{hitPoints=hp;}}
    public double getMaxPoint() {
        return maxPoint;
    }
    @Override
    public double getHitPoints(){
        return hitPoints;
    }
    @Override
    public boolean isAlive(){
         return hitPoints>0;
    }
    @Override
    public abstract void receiveAttackCastle(final Castle atacante);
    @Override
    public abstract void receiveAttackCavalry(final Cavalry atacante);
    @Override
    public abstract void receiveAttackMonk(final Monk atacante);
    @Override
    public abstract void receiveAttackInfantry(final Infantry atacante);
    @Override
    public abstract void receiveAttackSiege(final Siege atacante);
    @Override
    public abstract void receiveAttackVillager(final Villager atacante);
    @Override
    public abstract void receiveAttackArcher(final Archer atacante);

    protected void receiveDamage(final double attackPoints) {
        if (isAlive()) {
            hitPoints -= attackPoints;
            if (hitPoints<0){
                hitPoints=0;
            }
            if (hitPoints>maxPoint){
                hitPoints=maxPoint;
            }
        }
    }




}
