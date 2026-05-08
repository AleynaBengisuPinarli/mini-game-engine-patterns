public class EnemyAdapter implements GameObjectComponent {

    private LegacyEnemy legacyEnemy;

    public EnemyAdapter(LegacyEnemy legacyEnemy) {
        this.legacyEnemy = legacyEnemy;
    }

    @Override
    public void update() {
        legacyEnemy.attackPower();
    }
}