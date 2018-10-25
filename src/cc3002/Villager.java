package cc3002;
/**
 * Clase que se crea para hacer una especializacion de la clase Abstracta Unit. Al hacer esto, permite heredar todos
 * los métodos de la clase padre.
 * @author vale
 */

public class Villager extends Unit {
    /**
     * * Constructor de Villager,recibe los siguiente parametros
     * @param hitPoint  puntos de vida
     * @param attackPoint puntos de ataque de Villager
     * Este constructor hace un llamado al constructor de la clase padre, el cual recibe los mismos parametros
     * e inicializa los atributos
     */
    public Villager(double hitPoint,double attackPoint){
        super(hitPoint,attackPoint);
    }
    /**
     * Método attack que recibe un objeto attacable llamado atacado para que villager lo ataque.
     * restandole a atacado puntos de vida segun el método receiveAttackVillager.
     *@param atacado es el objeto que es atacado por villager
     * En este método se hace un double Dispatch para no revisar que tipo de objeto es el atacado
     */
    @Override
    public void attack(Attackable atacado) {
        if(isAlive()){//ver si esta el otro
        atacado.receiveAttackVillager(this);}
    }
    /**Método en donde el objeto this recibe un ataque de un castle, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (castle) y multiplicarlos por 1.2
     * @param castle objeto de tipo Castle ,el cual ataca a this
     */
    @Override
    public void receiveAttackCastle(Castle castle) {
        receiveDamage(castle.getAttackPoints()*1.2);
    }
    /**Método en donde el objeto this recibe un ataque de un cavalry, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (cavalry) y multiplicarlos por 1.5
     * @param cavalry objeto de tipo Cavalry,el cual ataca a this
     */
    @Override
    public void receiveAttackCavalry(Cavalry cavalry) {
        receiveDamage(cavalry.getAttackPoints()*1.5);
    }
    /**Método en donde el objeto this recibe un ataque de un monk, por lo cual, a el objeto this se le sumaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (monk) y multiplicarlos por -0.5
     * @param monk objeto de tipo Monk ,el cual ataca a this
     */
    @Override
    public void receiveAttackMonk(Monk monk) {
        receiveDamage(monk.getAttackPoints()*-0.5);
    }
    /**Método en donde el objeto this recibe un ataque de un infantry, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (infantry) y multiplicarlos por 1.5
     * @param infantry objeto de tipo Infantry ,el cual ataca a this
     */
    @Override
    public void receiveAttackInfantry(Infantry infantry) {
        receiveDamage(infantry.getAttackPoints()*1.5);
    }
    /**Método en donde el objeto this recibe un ataque de un siege, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (siege) y multiplicarlos por 1.5
     * @param siege objeto de tipo Siege ,el cual ataca a this
     */
    @Override
    public void receiveAttackSiege(Siege siege) {
        receiveDamage(siege.getAttackPoints()*1.5);
    }
    /**Método en donde el objeto this recibe un ataque de un villager, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (villager) y multiplicarlos por 1.0
     * @param villager objeto de tipo Villager ,el cual ataca a this
     */
    @Override
    public void receiveAttackVillager(Villager villager) {
        receiveDamage(villager.getAttackPoints()*1.0);
    }
    /**Método en donde el objeto this recibe un ataque de un archer, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (archer) y multiplicarlos por 1.5
     * @param archer objeto de tipo archer ,el cual ataca a this
     */
    @Override
    public void receiveAttackArcher(Archer archer) {
        receiveDamage(archer.getAttackPoints()*1.5);
    }
}
