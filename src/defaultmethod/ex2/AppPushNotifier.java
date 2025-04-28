package defaultmethod.ex2;

import java.time.LocalDateTime;

public class AppPushNotifier implements Notifier {
    @Override
    public void notify(String message) {
        System.out.println("[App] " + message);
    }

    @Override
    public void scheduleNotification(String message, LocalDateTime localDateTime) {
        System.out.println("[App 전용 스케줄링] message " + message + " time " + localDateTime );
    }
}
