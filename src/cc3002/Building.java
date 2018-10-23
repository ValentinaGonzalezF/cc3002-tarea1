package cc3002;

public abstract class Building implements Attackable {
    private double maxPoint;
    private double hitPoints;
    private boolean destroyed;

    //ver si puede atacar
    public Building(){//mejorar
        destroyed=false;
        hitPoints=0;
        maxPoint=0;
    }

    public double getMaxPoint() {
        return maxPoint;
    }
    public double getHitPoints(){
        return hitPoints;
    }
    public boolean isDestroyed(){
        return destroyed;
    }
    public void setMaxPoint(double maxPoint){
        this.maxPoint=maxPoint;
    }
    public void setHitPoints(double hitPoints){
        this.hitPoints=hitPoints;
    }
    public void setDestroyed(boolean destroyed){
        this.destroyed=destroyed;
    }
    public void setPointsattack(double pointsattack){
        this.pointsAttack=pointsattack;
    }
}
