package cc3002;
/**
 * Clase Abstracta que se crea para poder hacer luego especializaciones de los Edificios. Se hace una extension
 * de los que son Attackable, para poder compartir métodos.
 * @author vale
 */

public abstract class Building implements Attackable {
    private double maxPoint;
    private double hitPoints;
    /**
     * Constructor de Building,recibe los siguiente parametros
     * @param hitPoints  puntos de vida
     * @param maxPoint puntos maximo de vida
     * e inicializa los atributos
     */
    protected Building(double hitPoints,double maxPoint){
        this.hitPoints=hitPoints;
        this.maxPoint=maxPoint;
    }

    /**
     * Método que setea el atributo hitPoints al igualarlo con el parametro que recibe el método, el cual es hp.
     * @param hp nuevo valor de los hitPoints
     * Si el valor a setear supera el valor maximo de hitPoints, se setea hitPoints con maxHitpoints. Luego si el valor
     * a setear es menor a cero, los hitPoints se setean en O. Finalmente si no se cumplen las condiciones anteriores
     * se setea hitPoints con el parametro.
     */
    public void setHitPoints(double hp) {
        if (hp>maxPoint){
            hitPoints=maxPoint;
        }
        else if(hp<0){
            hitPoints=0;
        }
        else{hitPoints=hp;}}
    /**
     * Método que permite obtener el maximo valor de los hitPoints
     * @return maxPoint
     */
    public double getMaxPoint() {
        return maxPoint;
    }
    /**
     * Método que retorna el atributo hitPoints
     * @return  hitPoints del objeto al que se le aplica el metodo
     */
    @Override
    public double getHitPoints(){
        return hitPoints;
    }
    /**
     * Método que permite saber si el objeto al que se le aplica el metod esta vivo o no
     * @return  true o false, segun si esta vivo o muerto.
     */
    @Override
    public boolean isAlive(){
         return hitPoints>0;
    }
    /**
     * Método abstracto que recibe un objeto que es tipo Castle llamado atacante para que le reste hitPoints al
     * objeto que se le aplique el metodo
     *@param atacante es el objeto que ataca al objeto que se le aplicara el metodo
     */
    @Override
    public abstract void receiveAttackCastle(final Castle atacante);
    /**
     * Método abstracto que recibe un objeto que es tipo Cavalry llamado atacante para que le reste hitPoints al
     * objeto que se le aplique el metodo
     *@param atacante es el objeto que ataca al objeto que se le aplicara el metodo
     */
    @Override
    public abstract void receiveAttackCavalry(final Cavalry atacante);
    /**
     * Método abstracto que recibe un objeto que es tipo Monk llamado atacante para que le reste hitPoints al
     * objeto que se le aplique el metodo
     *@param atacante es el objeto que ataca al objeto que se le aplicara el metodo
     */
    @Override
    public abstract void receiveAttackMonk(final Monk atacante);
    /**
     * Método abstracto que recibe un objeto que es tipo Infantry llamado atacante para que le reste hitPoints al
     * objeto que se le aplique el metodo
     *@param atacante es el objeto que ataca al objeto que se le aplicara el metodo
     */
    @Override
    public abstract void receiveAttackInfantry(final Infantry atacante);
    /**
     * Método abstracto que recibe un objeto que es tipo Siege llamado atacante para que le reste hitPoints al
     * objeto que se le aplique el metodo
     *@param atacante es el objeto que ataca al objeto que se le aplicara el metodo
     */
    @Override
    public abstract void receiveAttackSiege(final Siege atacante);
    /**
     * Método abstracto que recibe un objeto que es tipo Villager llamado atacante para que le reste hitPoints al
     * objeto que se le aplique el metodo
     *@param atacante es el objeto que ataca al objeto que se le aplicara el metodo
     */
    @Override
    public abstract void receiveAttackVillager(final Villager atacante);
    /**
     * Método abstracto que recibe un objeto que es tipo Archer llamado atacante para que le reste hitPoints al
     * objeto que se le aplique el metodo
     *@param atacante es el objeto que ataca al objeto que se le aplicara el metodo
     */
    @Override
    public abstract void receiveAttackArcher(final Archer atacante);
    /**
     * Método que recibe una variable double attacksPoints, la cual permite que si el objeto al que se le aplica
     * el metodo esta vivo, le restara a los hitPoints los attacksPoints. Luego si los hitPoints se vuelven menor que cero
     * se setean en 0.Por ultimo si los hitPoints sobrepasan el maximo valor que pueden tener, se setearan en el maximo.
     * objeto que se le aplique el metodo
     *@param attackPoints son los puntos de ataque del objeto que ataco y le restan vida al objeto al que se le aplica el metodo
     */
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
