package advanced.lambdaexpressions;

public class LambdaExpressionExamples {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum =() -> 123.45;

        System.out.println(myNum.getValue());
    }
}
