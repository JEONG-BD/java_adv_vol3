package defaultmethod.ex1;

public class EmailNotifier implements Notifier{

    @Override
    public void notify(String message) {
        System.out.println("[Email] " + message);
    }
}
