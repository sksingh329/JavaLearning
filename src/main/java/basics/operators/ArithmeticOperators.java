package basics.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int e = 5;
        int f = 2;

        int  g = e / f;
        int  h = e % f;

        System.out.println(g); // 2
        System.out.println(h); // 1

        int x = 10;
        x += 5;

        System.out.println(x); //15

        int a = 10;
        int b = ++a;
        System.out.println(b); // 11

        int c = 10;
        int d = c++;
        System.out.println(d); // 10
    }
}
