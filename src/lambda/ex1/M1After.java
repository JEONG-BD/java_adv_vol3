package lambda.ex1;

public class M1After {

    public static void greet(String str){
        System.out.println("=== 시작 ====");
        System.out.println(str);
        System.out.println("=== 끝 ====");
    }
    public static void greetAfternoon(){
        System.out.println("=== 시작 ====");
        System.out.println("Good afternoon");
        System.out.println("=== 끝 ====");
    }
    public static void greetEvening(){
        System.out.println("=== 시작 ====");
        System.out.println("Good evening");
        System.out.println("=== 끝 ====");
    }

    public static void greetMorning(){
        System.out.println("=== 시작 ====");
        System.out.println("Good morning");
        System.out.println("=== 끝 ====");
    }

    public static void main(String[] args) {
        //greetMorning();
        //greetEvening();
        //greetAfternoon();
        greet("Good morning");
        greet("Good evening");
        greet("Good afternoon");
    }

}
