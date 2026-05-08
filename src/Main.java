public class Main {

    public static void main(String[] args) {

        GameObjectComponent player = new Player();

        player = new ShieldDecorator(player);

        GameObject gameObject = new GameObject(player);

        gameObject.update();
    }
}