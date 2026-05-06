public class GameObjectFactory {

    public static GameObject create(String type) {

        if (type.equals("player")) {
            return new GameObject("player", 100, 20);
        }

        if (type.equals("enemy")) {
            return new GameObject("enemy", 50, 10);
        }

        if (type.equals("boss")) {
            return new GameObject("boss", 200, 40);
        }

        throw new IllegalArgumentException("Unknown type: " + type);
    }
}