package advanced.generic;

public class BoundedWildcard {
    static void showXY(Coords<?> c){
        System.out.println("X Y coordinates");
        for(int i=0;i < c.coords.length;i++)
            System.out.println(c.coords[i].x + " "+c.coords[i].y);
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("X Y Z coordinates");
        for(int i=0;i < c.coords.length;i++)
            System.out.println(c.coords[i].x + " "+c.coords[i].y + " "+c.coords[i].z);
        System.out.println();
    }
    static void showAll(Coords<? extends FourD> c){
        System.out.println("X Y Z coordinates");
        for(int i=0;i < c.coords.length;i++)
            System.out.println(c.coords[i].x + " "+c.coords[i].y + " "+c.coords[i].z+" "+c.coords[i].t);
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0,0),
                new TwoD(7,9),
                new TwoD(18,4)
        };
        Coords<TwoD> tdlocs = new Coords<>(td);

        System.out.println("Content of tdlocs.");
        showXY(tdlocs);
        //showXYZ(tdlocs); //Compile time error
        //showAll(tdlocs); //Compile time error

        FourD fd[] = {
                new FourD(0,0,0,0),
                new FourD(1,2,3,4),
                new FourD(18,4,23,32)
        };
        Coords<FourD> fdlocs = new Coords<FourD>(fd);

        System.out.println("Content of fdlocs.");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
