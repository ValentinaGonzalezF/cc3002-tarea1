package cc3002;
/**
 *  Clase que se crea para hacer una especializacion de la clase Abstracta Unit. Al hacer esto, permite heredar todos
 *  los métodos de la clase padre.
 * @author vale
 */

public class Monk extends Unit {
    /**
     * Constructor de Monk,recibe los siguiente parametros
     * @param hitPoints  puntos de vida
     * @param attackPoints puntos de ataque de Monk
     * Este constructor hace un llamado al constructor de la clase padre, el cual tiene los mismos parametros
     * e inicializa los atributos
     */
    public Monk(double hitPoints,double attackPoints){
        super(hitPoints,attackPoints);
    }
    /**
     * Método attack que recibe un objeto attacable llamado atacado para que monk lo ataque.
     * restandole a atacado puntos de vida segun el método receiveAttackMonk. El que ataca debe estar vivo
     * para que pueda atacar.
     *@param atacado es el objeto que es atacado por monk
     * En este método se hace un double Dispatch para no revisar que tipo de objeto es el atacado
     */
    @Override
    public void attack(final Attackable atacado){
        if (isAlive()){atacado.receiveAttackMonk(this);}
    }
    /**Método en donde el objeto this recibe un ataque de un castle,el cual lo mata instantaneamente, por lo cual se
     * setean los HitPoints de Monk en O.
     * @param castle objeto de tipo Castle ,el cual ataca a this
     */
    @Override
    public void receiveAttackCastle(Castle castle) {
        this.setHitPoints(0);
    }
    /**Método en donde el objeto this recibe un ataque de un cavalry,el cual lo mata instantaneamente, por lo cual se
     * setean los HitPoints de Monk en O.
     * @param cavalry objeto de tipo Cavalry ,el cual ataca a this
     */
    @Override
    public void receiveAttackCavalry(Cavalry cavalry) {
        this.setHitPoints(0);
    }
    /**Método en donde el objeto this recibe un ataque de un monk,el cual le sube los HitPoints, por lo cual se
     * le suma los AttacksPoints y se le multiplica -0.5
     * @param monk objeto de tipo Monk ,el cual ataca a this
     */
    @Override
    public void receiveAttackMonk(Monk monk) {
        receiveDamage(monk.getAttackPoints()*-0.5);
    }
    /**Método en donde el objeto this recibe un ataque de un infantry,el cual lo mata instantaneamente, por lo cual se
     * setean los HitPoints de Monk en O.
     * @param infantry objeto de tipo Infantry ,el cual ataca a this
     */
    @Override
    public void receiveAttackInfantry(Infantry infantry) {
        this.setHitPoints(0);
    }
    /**Método en donde el objeto this recibe un ataque de un siege,el cual lo mata instantaneamente, por lo cual se
     * setean los HitPoints de Monk en O.
     * @param siege objeto de tipo Siege ,el cual ataca a this
     */
    @Override
    public void receiveAttackSiege(Siege siege) {
        this.setHitPoints(0);
    }
    /**Método en donde el objeto this recibe un ataque de un villager,el cual no le hace daño, por lo cual se
     * se le restara 0.
     * @param villager objeto de tipo Villager ,el cual ataca a this
     */
    @Override
    public void receiveAttackVillager(Villager villager) {
        receiveDamage(villager.getAttackPoints()*0.0);
    }
    /**Método en donde el objeto this recibe un ataque de un archer,el cual lo mata instantaneamente, por lo cual se
     * setean los HitPoints de Monk en O.
     * @param archer objeto de tipo Archer ,el cual ataca a this
     */
    @Override
    public void receiveAttackArcher(Archer archer) {
        this.setHitPoints(0);
    }
}
