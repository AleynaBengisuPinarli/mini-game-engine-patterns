public class GameObject {

    private GameObjectComponent component;

    public GameObject(GameObjectComponent component) {
        this.component = component;
    }

    public void update() {
        component.update();
    }
}