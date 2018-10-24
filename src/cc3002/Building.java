package cc3002;

public abstract class Building implements Attackable {
    private double maxPoint;
    private double hitPoints;
    private double damageCounter;

    //ver si puede atacar
    protected Building(double hitPoints,double maxPoint){
        this.hitPoints=hitPoints;
        this.maxPoint=maxPoint;
        this.damageCounter=0;
    }

    public double getMaxPoint() {
        return maxPoint;
    }
    public double getHitPoints(){
        return hitPoints;
    }
    public boolean isDestroyed(){
         return hitPoints <= damageCounter;
    }

    public abstract void receiveAttackCastle(final Castle atacante);

    public abstract void receiveAttackCavalry(final Cavalry atacante);

    public abstract void receiveAttackMonk(final Monk atacante);

    public abstract void receiveAttackInfantry(final Infantry atacante);

    public abstract void receiveAttackSiege(final Siege atacante);

    public abstract void receiveAttackVillager(final Villager atacante);

    public abstract void receiveAttackArcher(final Archer atacante);

    protected void receiveDamage(final double attackPoints) {
        if (!isDestroyed()) {
            damageCounter += attackPoints;
        }
    }




}
