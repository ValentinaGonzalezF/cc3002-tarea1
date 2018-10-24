package cc3002;
public abstract class Unit implements Attacker{
    private double hitPoints;
    private final double attackPoints;
    private final boolean canAttack;

    protected Unit(double hitPoints,double attackPoints,boolean canAttack){
        this.attackPoints=attackPoints;
        this.hitPoints=hitPoints;
        this.canAttack=canAttack;
    }

    public double getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(double hp){hitPoints=hp;}
    public double getAttackPoints(){
        return attackPoints;
    }
    public boolean isAlive(){
        return hitPoints > 0;
    }

    public abstract void attack(final Attackable atacado);

    public abstract void receiveAttackCastle(final Castle atacante);

    public abstract void receiveAttackCavalry(final Cavalry atacante);

    public abstract void receiveAttackMonk(final Monk atacante);

    public abstract void receiveAttackInfantry(final Infantry atacante);

    public abstract void receiveAttackSiege(final Siege atacante);

    public abstract void receiveAttackVillager(final Villager atacante);

    public abstract void receiveAttackArcher(final Archer atacante);

    protected void receiveDamage(final double attackPoints) {
        if (isAlive()) {
            hitPoints -= attackPoints;
            if (hitPoints<0){
                hitPoints=0;
            }
        }
    }
}

