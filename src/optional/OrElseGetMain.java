package optional;

import java.util.Optional;
import java.util.Random;

public class OrElseGetMain {
    public static void main(String[] args) {
        Optional<Integer> optValue = Optional.of(100);
        Optional<Integer> optEmpty = Optional.empty();

        System.out.println("단순 계산");
        Integer i1 = optValue.orElse(10 + 20);
        Integer i2 = optEmpty.orElse(10 + 20);
        System.out.println("i2 = " + i2);
        System.out.println("i1 = " + i1);

        System.out.println("orElse");
        System.out.println("값이 있을 경우");
        Integer value1 = optValue.orElse(createdData());
        System.out.println("value1 = " + value1);
        System.out.println("값이 없을 경우");
        Integer value2 = optEmpty.orElse(createdData());
        System.out.println("value2 = " + value2);

        System.out.println("orElseGet");
        System.out.println("값이 있을 경우");
        Integer value3 = optValue.orElseGet(() -> createdData());
        System.out.println("value3 = " + value3);
        System.out.println("값이 없을 경우");
        Integer value4 = optEmpty.orElseGet(() -> createdData());
        System.out.println("value4 = " + value4);


    }

    static  int createdData(){
        System.out.println("데이터를 생성한다");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        int createdValue = new Random().nextInt(100);
        System.out.println("데이터 생성이 완료 되었습니다 생성 값 " + createdValue);
        return  createdValue;
    }
}
