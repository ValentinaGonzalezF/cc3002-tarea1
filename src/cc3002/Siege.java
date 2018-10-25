package cc3002;
/**
 *  Clase que se crea para hacer una especializacion de la clase Abstracta Unit. Al hacer esto, permite heredar todos
 *  los métodos de la clase padre.
 * @author vale
 */

public class Siege extends Unit{
    /**
     * Constructor de Siege,recibe los siguiente parametros
     * @param hitPoint  puntos de vida
     * @param attackPoint puntos de ataque de Siege
     * Este constructor hace un llamado al constructor de la clase padre, el cual recibe los mismos parametros
     * e inicializa los atributos
     */
    public Siege(double hitPoint,double attackPoint){
        super(hitPoint,attackPoint);
    }
    /**
     * Método attack que recibe un objeto attacable llamado atacado para que siege lo ataque.
     * restandole a atacado puntos de vida segun el método receiveAttackSiege
     *@param atacado es el objeto que es atacado por siege
     * En este método se hace un double Dispatch para no revisar que tipo de objeto es el atacado
     */
    @Override
    public void attack(final Attackable atacado){
        if(isAlive()){atacado.receiveAttackSiege(this);}
    }

    @Override
    public void receiveAttackCastle(Castle castle) {
        receiveDamage(castle.getAttackPoints()*0.5);
    }

    @Override
    public void receiveAttackCavalry(Cavalry cavalry) {
        receiveDamage(cavalry.getAttackPoints()*1.2);
    }

    @Override
    public void receiveAttackMonk(Monk monk) {
        receiveDamage(monk.getAttackPoints()*0.0);
    }

    @Override
    public void receiveAttackInfantry(Infantry infantry) {
        receiveDamage(infantry.getAttackPoints()*1.2);
    }

    @Override
    public void receiveAttackSiege(Siege siege) {
        receiveDamage(siege.getAttackPoints()*1.5);
    }

    @Override
    public void receiveAttackVillager(Villager villager) {
        receiveDamage(villager.getAttackPoints()*-0.5);
    }
    /**Método en donde el objeto this recibe un ataque de un archer, por lo cual, a el objeto this se le restaran
     * HitPoints,lo que equivale a obtener los puntos del enemigo (archer) y multiplicarlos por 0.8
     * @param archer objeto de tipo archer ,el cual ataca a siege.
     */
    @Override
    public void receiveAttackArcher(Archer archer) {
        receiveDamage(archer.getAttackPoints()*0.8);
    }
}
