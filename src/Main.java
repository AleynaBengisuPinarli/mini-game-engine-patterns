public class Main {
    public static void main(String[] args) {

        GameObject player = new GameObject("player");
        GameObject enemy = new GameObject("enemy");
        GameObject boss = new GameObject("boss");

        player.update();
        enemy.update();
        boss.update();

        player.attack(enemy);
        boss.attack(player);

        System.out.println("Game simulation finished.");
    }
}