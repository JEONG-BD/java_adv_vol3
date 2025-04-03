package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Procedure procedure){
        long startNs = System.nanoTime();
        procedure.run();
        long endNs = System.nanoTime();

        System.out.println("실행 시간 " + (endNs - startNs) + " ns");
    }

    static class Dice implements Procedure {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("Random value" + randomValue);
            long endNs = System.nanoTime();
        }
    }

    static class Sum implements Procedure {
        @Override
        public void run() {
            for (int i = 0; i <=3 ; i++) {
                System.out.println("i = " + i);
            }
        }
    }
    public static void helloDice(){
        long startNs = System.nanoTime();

        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("Random value" + randomValue);
        long endNs = System.nanoTime();

        System.out.println("실행 시간 " + (endNs - startNs) + " ns");
    }

    public static void helloSum(){
        long startNs = System.nanoTime();

        for (int i = 0; i <=3 ; i++) {
            System.out.println("i = " + i);
        }
        long endNs = System.nanoTime();

        System.out.println("실행 시간 " + (endNs - startNs) + " ns");

    }

    public static void main(String[] args) {

        hello(new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("Random value" + randomValue);
                long endNs = System.nanoTime();
            }
        });
        hello(new Procedure() {
            @Override
            public void run() {
                for (int i = 0; i <=3 ; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
