package cc3002;
public abstract class Unit implements Attacker{
    private double hitPoints;
    private final double attackPoints;
    private final double maxHitPoints;

    protected Unit(double hitPoints,double attackPoints){
        this.attackPoints=attackPoints;
        this.hitPoints=hitPoints;
        maxHitPoints=2*hitPoints;
    }
    public double getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(double hp){
        if (hp>maxHitPoints){
            hitPoints=maxHitPoints;
        }
        else if(hp<0){
            hitPoints=0;
        }
        else{hitPoints=hp;}}

    public double getAttackPoints(){
        return attackPoints;
    }
    public boolean isAlive(){
        return hitPoints > 0;
    }

    @Override
    public abstract void attack(final Attackable atacado);

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
            if (hitPoints>maxHitPoints){
                hitPoints=maxHitPoints;
            }

        }
    }
}

