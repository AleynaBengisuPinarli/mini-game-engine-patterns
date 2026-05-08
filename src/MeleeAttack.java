public class MeleeAttack implements AttackStrategy {
    @Override
    public void attack(GameObject attacker, GameObject target) {
        target.health -= attacker.damage;
        System.out.println("Melee attack executed");
    }
}