public class GameObject {

    String type;
    int health;
    int damage;

    public GameObject(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    public void update() {
        System.out.println(type + " is updating...");
    }

    public void attack(GameObject target) {
        target.health -= this.damage;
    }
}