public class Main {
    public static void main(String[] args) {

        GameObject player = new GameObject("Player", 100, 20);
        GameObject enemy = new GameObject("Enemy", 80, 10);

        System.out.println("=== Strategy Pattern Test ===");

        player.setAttackStrategy(new MeleeAttack());
        player.performAttack(enemy);

        System.out.println("Enemy health: " + enemy.health);

        player.setAttackStrategy(new RangedAttack());
        player.performAttack(enemy);

        System.out.println("Enemy health: " + enemy.health);


        System.out.println("\n=== Observer Pattern Test ===");

        GameEventManager manager = new GameEventManager();

        PlayerObserver playerObserver = new PlayerObserver();
        EnemyObserver enemyObserver = new EnemyObserver();

        manager.subscribe(playerObserver);
        manager.subscribe(enemyObserver);

        manager.notifyObservers("Enemy defeated!");
        manager.notifyObservers("Player took damage!");

        manager.unsubscribe(enemyObserver);

        manager.notifyObservers("New boss spawned!");
    }
}