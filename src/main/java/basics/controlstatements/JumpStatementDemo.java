package basics.controlstatements;

public class JumpStatementDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0) continue; // if i is divisible by 2, iteration will be skipped
            if(i > 15) break; // loop will be terminated when i > 15
            System.out.println(i);
        }
    }
}
