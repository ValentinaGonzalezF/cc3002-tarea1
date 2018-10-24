package cc3002;

public interface Attacker extends Attackable{
    void attack(Attackable atacado);
    double getAttackPoints();
}
