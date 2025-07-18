package defaultmethod.ex2;

import java.time.LocalDateTime;

public interface Notifier {

    void notify(String message);

    default void scheduleNotification(String message, LocalDateTime localDateTime){
        System.out.println("[기본 스케줄링] message " + message + " time " + localDateTime );
    }
}
