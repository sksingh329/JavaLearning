package advanced.generic;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb(); //cast from Object to Integer

        System.out.println("Value: "+v);

        NonGen strOb;

        strOb = new NonGen("Non-Generics test");

        iOb.showType();

        String str = (String) strOb.getOb(); //cast from Object to String

        System.out.println("Value: "+str);

        iOb = strOb; // it will compile
        v = (Integer) iOb.getOb(); //run-time error
    }
}
