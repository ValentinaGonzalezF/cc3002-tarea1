package cc3002;

public interface Attackable{
   double getHitPoints();
   void receiveAttackCastle(Castle atacante);

   void receiveAttackCavalry(Cavalry atacante);

   void receiveAttackMonk(Monk atacante);

   void receiveAttackInfantry(Infantry atacante);

   void receiveAttackSiege(Siege atacante);

   void receiveAttackVillager(Villager atacante);

   void receiveAttackArcher(Archer atacante);
   boolean isAlive();
}
