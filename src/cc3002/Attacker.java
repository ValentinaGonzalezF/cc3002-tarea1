package cc3002;
/**
 * @author vale
 * Interfaz que se construye para que todos las unidades o edificios que puedan atacar compartan todos los métodos
 * Ademas la interfaz attacker comparte los metodos de Attackable, ya que si puede atacar, puede ser atacado.
 */

public interface Attacker extends Attackable{
    /**
     * Método que permitira atacar a atacado
     * @param atacado Objeto attacable que sera atacado
     */
    void attack(Attackable atacado);
    /** Método que permitira obtener los AttacksPoints del objeto al que se le aplique el método
     *
     * @return AttackPoints del objeto que se le aplica método
     */
    double getAttackPoints();
}
