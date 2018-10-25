package cc3002;

/**
 * Clase que se crea para hacer una especializacion de la clase Abstracta Unit. Al hacer esto, permite heredar todos
 * los métodos de la clase padre.
 * @author vale
 */

public class Archer extends Unit {
    /**
     * Constructor de Archer,recibe los siguiente parametros
     * @param hitPoint  puntos de vida
     * @param attackPoint puntos de ataque
     * Este constructor hace un llamado al constructor de la clase padre, el cual tiene los mismos parametros
     *  e inicializa los atributos
     */
    public Archer(double hitPoint,double attackPoint){
        super(hitPoint,attackPoint);
    }
    /**
     * Método attack que recibe un objeto attacable llamado atacado para que archer lo ataque.
     * restandole a atacado puntos de vida segun el método receiveAttackArcher.
     *@param atacado es el objeto que es atacado por archer
     * En este método se hace un double Dispatch para no revisar que tipo de objeto es el atacado
     */
    @Override
    public void attack(Attackable atacado) {
        atacado.receiveAttackArcher(this);
    }
    /**Método en donde el objeto this recibe un ataque de un castle, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (castle) y multiplicarlos por 1.2
     * @param castle objeto de tipo castle, el cual ataca a this
     */
    @Override
    public void receiveAttackCastle(Castle castle) {
        receiveDamage(castle.getAttackPoints() * 1.2);
    }
    /**Método en donde el objeto this recibe un ataque de un cavalry, por lo cual, a el objeto this se le descontaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (cavalry) y multiplicarlos por 1.5
     * @param cavalry objeto de tipo cavalry, el cual ataca a this
     */
    @Override
    public void receiveAttackCavalry(Cavalry cavalry) {
        receiveDamage(cavalry.getAttackPoints()*1.5);
    }
    /**Método en donde el objeto this recibe un ataque de un monk, por lo cual, a el objeto this se le sumaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (monk) y multiplicarlos por -0.5.Esto es debido a
     * monk tiene propiedades curativas
     * @param monk objeto de tipo monk, el cual ataca a this
     */
    @Override
    public void receiveAttackMonk(Monk monk) {
        receiveDamage(monk.getAttackPoints()*-0.5);
    }
    /**Método en donde el objeto this recibe un ataque de un infantry, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (infantry) y multiplicarlos por 1.2
     * @param infantry objeto de tipo infantry ,el cual ataca a this
     */
    @Override
    public void receiveAttackInfantry(Infantry infantry) {
        receiveDamage(infantry.getAttackPoints()*1.2);
    }
    /**Método en donde el objeto this recibe un ataque de un siege, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (siege) y multiplicarlos por 1.5
     * @param siege objeto de tipo infantry ,el cual ataca a this
     */
    @Override
    public void receiveAttackSiege(Siege siege) {
        receiveDamage(siege.getAttackPoints()*1.5);
    }
    /**Método en donde el objeto this recibe un ataque de un villager, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (villager) y multiplicarlos por 1.0
     * @param villager objeto de tipo archer ,el cual ataca a this
     */
    @Override
    public void receiveAttackVillager(Villager villager) {
        receiveDamage(villager.getAttackPoints()*1.0);
    }
    /**Método en donde el objeto this recibe un ataque de un archer, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (archer) y multiplicarlos por 1.2
     * @param archer objeto de tipo archer ,el cual ataca a this
     */
    @Override
    public void receiveAttackArcher(Archer archer) {
        receiveDamage(archer.getAttackPoints()*1.2);
    }

}
