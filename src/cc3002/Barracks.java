package cc3002;
/**
 *  Clase que se crea para hacer una especializacion de la clase Abstracta Building. Al hacer esto, permite heredar todos
 *  los métodos de la clase padre.
 * @author vale
 */

public class Barracks extends Building{
    /**
     * Constructor de Barracks,recibe los siguiente parametros
     * @param hitPoint  puntos de vida
     * @param maxP puntos maximo de vida
     * Este constructor hace un llamado al constructor de la clase padre, el cual tiene los mismos parametros
     * e inicializa los atributos
     */
    public Barracks(double hitPoint,double maxP){
        super(hitPoint,maxP);
    }
    /**Método en donde el objeto this recibe un ataque de un castle, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (castle) y multiplicarlos por 0.7
     * @param castle objeto de tipo castle, el cual ataca a Barracks.
     */
    @Override
    public void receiveAttackCastle(Castle castle){
        receiveDamage(castle.getAttackPoints()*0.7);
    }
    /**Método en donde el objeto this recibe un ataque de un cavalry, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (cavalry) y multiplicarlos por 0.7
     * @param cavalry objeto de tipo cavalry, el cual ataca a this
     */
    @Override
    public void receiveAttackCavalry(Cavalry cavalry){
        receiveDamage(cavalry.getAttackPoints()*0.7);
    }
    /**Método en donde el objeto this recibe un ataque de un monk,en este caso, el monk no le hace nada a barracks por
     * lo cual su attackPoints se pondrerá por 0.0
     * @param monk objeto de tipo castle, el cual ataca a this
     */
    @Override
    public void receiveAttackMonk(Monk monk){
        receiveDamage(monk.getAttackPoints()*0.0);
    }
    /**Método en donde el objeto this recibe un ataque de un infantry, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (infantry) y multiplicarlos por 0.7
     * @param infantry objeto de tipo infantry, el cual ataca a this
     */
    @Override
    public void receiveAttackInfantry(Infantry infantry){
        receiveDamage(infantry.getAttackPoints()*0.7);
    }
    /**Método en donde el objeto this recibe un ataque de un siege, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (siege) y multiplicarlos por 2.0
     * @param siege objeto de tipo siege, el cual ataca a this
     */
    @Override
    public void receiveAttackSiege(Siege siege){
        receiveDamage(siege.getAttackPoints()*2.0);
    }
    /**Método en donde el objeto this recibe un ataque de un villager, por lo cual, a el objeto this se sumarán
     * HitPoints,lo que equivale a obtener los puntos del enemigo (villager) y multiplicarlos por -0.7
     * @param villager objeto de tipo villager, el cual ataca a this
     */
    @Override
    public void receiveAttackVillager(Villager villager){
        receiveDamage(villager.getAttackPoints()*-0.7);
    }
    /**Método en donde el objeto this recibe un ataque de un archer, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (archer) y multiplicarlos por 0.7
     * @param archer objeto de tipo archer, el cual ataca a this
     */
    @Override
    public void receiveAttackArcher(Archer archer ) {
        receiveDamage(archer.getAttackPoints()*0.7);
    }
}
