public class EnemyObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Enemy received event: " + event);
    }
}