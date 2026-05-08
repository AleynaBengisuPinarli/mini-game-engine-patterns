public class GameObject {
    public String name;
    public int health;
    public int damage;

    private AttackStrategy attackStrategy;

    public GameObject(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    public void performAttack(GameObject target) {
        if (attackStrategy != null) {
            attackStrategy.attack(this, target);
        }
    }
}