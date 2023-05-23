package basics.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        byte b = 10;
        System.out.println(Integer.toBinaryString(b));//1010

        byte c = -10;
        System.out.println(Integer.toBinaryString(c)); //11110110 - ignore higher bits

        byte x = 4;
        byte y = 2;

        System.out.println(x & y); // 0
        System.out.println(x | y); // 0
        System.out.println(x ^ y); // 6
        System.out.println(~x); // -5
    }
}
