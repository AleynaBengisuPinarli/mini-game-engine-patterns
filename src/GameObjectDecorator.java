public abstract class GameObjectDecorator implements GameObjectComponent {

    protected GameObjectComponent obj;

    public GameObjectDecorator(GameObjectComponent obj) {
        this.obj = obj;
    }

    @Override
    public void update() {
        obj.update();
    }
}