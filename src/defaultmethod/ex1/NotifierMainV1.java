package defaultmethod.ex1;

import java.util.List;

public class NotifierMainV1 {
    public static void main(String[] args) {
        List<Notifier> notifiers = List.of(
                new EmailNotifier(),
                new AppPushNotifier(),
                new SMSNotifier());

//        for (Notifier notifier : notifiers) {
//            notifier.notify("서비스 가입을 환영합니다");
//        }

        notifiers.forEach(n -> n.notify("서비스 가입을 환영합닏다"));
    }
}
