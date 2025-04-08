package lambda.ex2;

public class BuildGreeterExample {
    public static void main(String[] args) {
        StringFunction hellloGretter = buildGreeter("hello");
        System.out.println("hellloGretter.apply(\"Java\") = " + hellloGretter.apply("Java"));

    }
    
    public static StringFunction buildGreeter(String greeting){
           
        return str -> greeting + " " + str;

    }
}
