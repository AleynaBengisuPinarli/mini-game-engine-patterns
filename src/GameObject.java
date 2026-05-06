public class GameObject {

    String type;
    int health;
    int damage;

    public GameObject(String type) {
        this.type = type;

        if (type.equals("player")) {
            health = 100;
            damage = 20;
        } 
        else if (type.equals("enemy")) {
            health = 50;
            damage = 10;
        } 
        else if (type.equals("boss")) {
            health = 200;
            damage = 40;
        }
    }

    public void update() {
        if (type.equals("player")) {
            System.out.println("Player moves with WASD");
        } 
        else if (type.equals("enemy")) {
            System.out.println("Enemy chases player");
        } 
        else if (type.equals("boss")) {
            System.out.println("Boss uses special attack");
        }
    }

    public void attack(GameObject target) {
        if (type.equals("player")) {
            target.health -= damage;
        } 
        else if (type.equals("enemy")) {
            target.health -= damage / 2;
        } 
        else if (type.equals("boss")) {
            target.health -= damage * 2;
        }
    }
}