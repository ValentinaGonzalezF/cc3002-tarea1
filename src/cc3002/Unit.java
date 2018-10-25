package cc3002;
/**
 * Clase Abstracta que se crea para poder hacer luego especializaciones de las Unidades. Se hace una extension
 * de los que son Attacker, para poder compartir métodos.
 * @author vale
 */

public abstract class Unit implements Attacker{
    private double hitPoints;
    private final double attackPoints;
    private final double maxHitPoints;
    /**
     * Constructor de Unit,recibe los siguiente parametros
     * @param hitPoints  puntos de vida
     * @param attackPoints puntos de ataque de Cavalry
     * Este constructor inicializa los atributos con los parametros
     * Por ultimo se inicializa el atributo maxHitPoints como el doble de los HitPoints iniciales
     */
    protected Unit(double hitPoints,double attackPoints){
        this.attackPoints=attackPoints;
        this.hitPoints=hitPoints;
        maxHitPoints=2*hitPoints;
    }
    /**
     * Método que retorna el atributo hitPoints
     * @return  hitPoints del objeto al que se le aplica el metodo
     */
    public double getHitPoints(){
        return hitPoints;
    }
    /**
     * Método que setea el atributo hitPoints al igualarlo con el parametro que recibe el método, el cual es hp.
     * @param hp nuevo valor de los hitPoints
     * Si el valor a setear supera el valor maximo de hitPoints, se setea hitPoints con maxHitpoints. Luego si el valor
     * a setear es menor a cero, los hitPoints se setean en O. Finalmente si no se cumplen las condiciones anteriores
     * se setea hitPoints con el parametro.
     */
    public void setHitPoints(double hp){
        if (hp>maxHitPoints){
            hitPoints=maxHitPoints;
        }
        else if(hp<0){
            hitPoints=0;
        }
        else{hitPoints=hp;}}

    /**
     * Método que retorna el atributo attacktPoints
     * @return  attackPoints del objeto al que se le aplica el metodo
     */
    public double getAttackPoints(){
        return attackPoints;
    }
    /**
     * Método que permite saber si el objeto al que se le aplica el metod esta vivo o no
     * @return  true o false, segun si esta vivo o muerto.
     */
    public boolean isAlive(){
        return hitPoints > 0;
    }

    /**
     * Método abstracto attack que recibe un objeto attacable llamado atacado para que unit lo pueda atacar.
     *@param atacado es el objeto que es atacado por archer
     */
    @Override
    public abstract void attack(final Attackable atacado);
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
            if (hitPoints>maxHitPoints){
                hitPoints=maxHitPoints;
            }

        }
    }
}

