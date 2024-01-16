package advanced.generic;

public class NonGen {
    private Object ob;

    NonGen(Object o){
        this.ob = o;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of ob is: "+ob.getClass().getName());
    }
}
