package lambda.ex1;

public class M2After {

    public static void print1() {
        System.out.println("무게 10kg");

    }
    public static void print2() {
        System.out.println("무게 20kg");
    }
    public static void print3() {
        System.out.println("무게 30kg");
    }
    public static void print4() {
        System.out.println("무게 40kg");
    }

    public static void print(int weight, String unit){
        System.out.println("무게 " + weight + unit );
    }

    public static void main(String[] args) {
        print(1, "g");
        print(2, "kg");
        print(3, "g");

        print(4, "mg");

    }

}
