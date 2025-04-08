package lambda.ex2;

public class ComposeExample {
    public static void main(String[] args) {
        String test ="Hello";
        MyTransformer myTransformer1 = (str) -> str.toUpperCase();
        MyTransformer myTransformer2 = (str) -> "**" + str + "**";
 //       MyTransformer compose = compose(myTransformer1, myTransformer2);
        MyTransformer compose = compose((str) -> str.toUpperCase(), (str) -> "**" + str + "**");

        String transform = compose.transform(test);
        System.out.println("transform = " + transform);
    }


    public static MyTransformer compose(MyTransformer f1, MyTransformer f2){
//
//        return new MyTransformer() {
//            @Override
//            public String transform(String s) {
//                String itermediated = f1.transform(s);
//                return f2.transform(itermediated);
//            }
//        };
        return (String s) -> {
                String itermediated = f1.transform(s);
                return f2.transform(itermediated);
        };
    }
}
