package cc3002;
public abstract class Unit implements Attacker{
    private double hitPoints;
    private boolean alive;
    private double attackPoints;
    //ver si puede atacar
    //

    public Unit(){ //TODO: mejorar
        alive=true;
        hitPoints=0;
        attackPoints=0;
    }

    public double getHitPoints(){
        return hitPoints;
    }

    public double getAttackPoints(){
        return attackPoints;
    }
    public boolean isAlive(){
        return alive;
    }

    public void setHitPoint(double point){
        hitPoints=point;
    }
    public void setAlive(boolean alive){
        this.alive=alive;
    }
    public void setAttackPoints(double attackPoints){
        this.attackPoints=attackPoints;
    }
}
