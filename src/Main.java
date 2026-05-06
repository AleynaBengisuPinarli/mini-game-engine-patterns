public class Main {
    public static void main(String[] args) {

        GameObject player = GameObjectFactory.create("player");
        GameObject enemy = GameObjectFactory.create("enemy");
        GameObject boss = GameObjectFactory.create("boss");

        player.update();
        enemy.update();
        boss.update();

        player.attack(enemy);
        boss.attack(player);
    }
}