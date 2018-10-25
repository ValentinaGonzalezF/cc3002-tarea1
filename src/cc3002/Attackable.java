package cc3002;
/**
 * @author vale
 * Interfaz que construye para que todos las unidades o edificios que sean atacables compartan todos los métodos
 */

public interface Attackable{
   /**
    * Método que retorna los HitPoints al objeto que se le aplica
    * @return hitPoints
    */
   double getHitPoints();
   /**
    * Método que recibe ataque de Castle que es el atacante, el cual restará hitPoints
    * @param atacante es el que ataca al que se le aplicara el metodo
    */
   void receiveAttackCastle(Castle atacante);
   /**
    * Método que recibe ataque de Cavalry que es el atacante, el cual restará hitPoints
    * @param atacante es el que ataca al que se le aplicara el metodo
    */
   void receiveAttackCavalry(Cavalry atacante);
   /**
    * Método que recibe ataque de Monk que es el atacante, el cual restará hitPoints
    * @param atacante es el que ataca al que se le aplicara el metodo
    */

   void receiveAttackMonk(Monk atacante);
   /**
    * Método que recibe ataque de Infantry que es el atacante, el cual restará hitPoints
    * @param atacante es el que ataca al que se le aplicara el metodo
    */

   void receiveAttackInfantry(Infantry atacante);
   /**
    * Método que recibe ataque de Siege que es el atacante, el cual restará hitPoints
    * @param atacante es el que ataca al que se le aplicara el metodo
    */

   void receiveAttackSiege(Siege atacante);
   /**
    * Método que recibe ataque de Villager que es el atacante, el cual restará hitPoints
    * @param atacante es el que ataca al que se le aplicara el metodo
    */

   void receiveAttackVillager(Villager atacante);
   /**
    * Método que recibe ataque de Archer que es el atacante, el cual restará hitPoints
    * @param atacante es el que ataca al que se le aplicara el metodo
    */

   void receiveAttackArcher(Archer atacante);
   /**
    * Método que pregunta al que se le aplicara el método si está vivo o no.
    * @return  objeto retorna si esta vivo o no
    */
   boolean isAlive();
}
