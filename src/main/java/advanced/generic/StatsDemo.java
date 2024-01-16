package advanced.generic;

public class StatsDemo {
    public static void main(String[] args) {
        Integer[] iNums = {1,2,3,4,5};
        Stats<Integer> iStat = new Stats<>(iNums);

        double v = iStat.average();
        System.out.println("Average is: "+v);

        Double[] dNums = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> dStat = new Stats<>(dNums);

        v = dStat.average();
        System.out.println("Average is: "+v);

        if(iStat.sameAvg(dStat))
            System.out.println("iStat and dStat average is same");
        else
            System.out.println("iStat and dStat average is not same");
    }
}
