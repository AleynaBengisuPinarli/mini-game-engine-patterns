public class PlayerObserver implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Player received event: " + event);
    }
}