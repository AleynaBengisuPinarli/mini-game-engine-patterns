public class ShieldDecorator extends GameObjectDecorator {

    public ShieldDecorator(GameObjectComponent obj) {
        super(obj);
    }

    @Override
    public void update() {
        super.update();
        System.out.println("Shield active");
    }
}