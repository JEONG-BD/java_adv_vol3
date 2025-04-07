package lambda.ex1;

import lambda.MyFunction;

public class M5Return {

    public static MyFunction getOperator(String operator){
        switch (operator){
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            case "mul":
                return (a, b) -> a * b;
            case "div":
                return (a, b) -> a / b;
            default:
                return (a, b) -> 0;
        }
    }

    public static MyFunction getOperatorV2(String operator){
        return switch (operator){
            case "add" -> (a, b) -> a + b;
            case "sub" -> (a, b) -> a - b;
            case "mul" -> (a, b) -> a * b;
            case "div" -> (a, b) -> a / b;
            default -> (a, b) -> 0;
        };
    }

    public static void main(String[] args) {
        MyFunction add = getOperatorV2("add");
        int apply = add.apply(1, 2);
        System.out.println(apply);
    }
}
