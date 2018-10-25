package cc3002;
/**
 *   Clase que se crea para hacer una especializacion de la clase Abstracta Building. Al hacer esto, permite heredar todos
 *   los métodos de la clase padre.
 * @author vale
 */

public class Castle extends Building implements Attacker{
    private double pointsAttack;
    /**
     * Constructor de Castle,recibe los siguiente parametros
     * @param hitPoint  puntos de vida
     * @param maxP puntos maximo de vida
     * @param pointsAttack puntos de ataque de Castle
     * Este constructor hace un llamado al constructor de la clase padre, el cual tiene los mismos parametros e inicializa los atributos
     * Como el constructor es de la clase padre builing, se debe inicializar el atributo pointsAttack para que
     * pueda tener puntos de ataque, ya que un Castle es Attacker.
     */
    public Castle(double hitPoint, double maxP, double pointsAttack){
        super(hitPoint,maxP);
        this.pointsAttack=pointsAttack;
    }
    /**
     * Método attack que recibe un objeto attacable llamado atacado para que Castle lo ataque.
     * restandole a atacado puntos de vida según el método receiveAttackCastle.
     *@param atacado es el objeto que es atacado por Castle
     * En este método se hace un double Dispatch para no revisar que tipo de objeto es el atacado
     */
    @Override
    public void attack(final Attackable atacado){
        if (isAlive()){atacado.receiveAttackCastle(this);}
    }
    /**
     * Método getAttackPoints que retorna los pointsAttack del objeto.
     *@return pointsAttacks
     */
    @Override
    public double getAttackPoints() {
        return pointsAttack;
    }
    /**Método en donde el objeto this recibe un ataque de un castle, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (castle) y multiplicarlos por 0.1
     * @param castle objeto de tipo castle, el cual ataca a this
     */
    @Override
    public void receiveAttackCastle(Castle castle){
        receiveDamage(castle.getAttackPoints()*0.1);
    }
    /**Método en donde el objeto this recibe un ataque de un cavalry, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (cavalry) y multiplicarlos por 0.3
     * @param cavalry objeto de tipo cavalry, el cual ataca a this
     */
    @Override
    public void receiveAttackCavalry(Cavalry cavalry){
        receiveDamage(cavalry.getAttackPoints()*0.3);
    }
    /**Método en donde el objeto this recibe un ataque de un Monk, pero en este caso el monk no le hace daño a Castle,
     * por lo que los AttacksPoints se ponderan por 0
     * @param monk objeto de tipo Monk, el cual ataca a this
     */
    @Override
    public void receiveAttackMonk(Monk monk){
        receiveDamage(monk.getAttackPoints()*0.0);
    }
    /**Método en donde el objeto this recibe un ataque de un infantry, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (infantry) y multiplicarlos por 0.3
     * @param infantry objeto de tipo infantry, el cual ataca a this
     */
    @Override
    public void receiveAttackInfantry(Infantry infantry){
        receiveDamage(infantry.getAttackPoints()*0.3);
    }
    /**Método en donde el objeto this recibe un ataque de un siege, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (siege) y multiplicarlos por 2.0
     * @param siege objeto de tipo Siege, el cual ataca a this
     */
    @Override
    public void receiveAttackSiege(Siege siege){
        receiveDamage(siege.getAttackPoints()*2.0);
    }
    /**Método en donde el objeto this recibe un ataque de un villager, por lo cual, a el objeto this se sumaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (villager) y multiplicarlos por -0.3
     * @param villager objeto de tipo Villager, el cual ataca a this
     */
    @Override
    public void receiveAttackVillager(Villager villager){
        receiveDamage(villager.getAttackPoints()*-0.3);
    }
    /**Método en donde el objeto this recibe un ataque de un archer, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (archer) y multiplicarlos por 0.1
     * @param archer objeto de tipo archer, el cual ataca a this
     */
    @Override
    public void receiveAttackArcher(Archer archer){
        receiveDamage(archer.getAttackPoints()*0.1);
    }


}
