package optional;

import optional.model.Address;
import optional.model.User;

import java.util.Optional;

public class AddressMain2 {
    public static void main(String[] args) {

        User user1 = new User("user", null);
        User user2 = new User("user", new Address("Hello Street"));

        printStreet(user1);
        printStreet(user2);

    }

    private static void printStreet(User user) {
        Optional<String> userStreet = getUserStreet(user);
        userStreet.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Unknwon")
        );
    }

    static Optional<String> getUserStreet(User user){
        return Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getStreet);
    }
}
