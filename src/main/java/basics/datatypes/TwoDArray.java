package basics.datatypes;

/*
This class will create two-dimensional array of different lengths and assign value and print array
 */
public class TwoDArray {

    public static void main(String[] args) {
        int[][] grades = new int[5][];
        grades[0] = new int[5];
        grades[1] = new int[6];
        grades[2] = new int[7];
        grades[3] = new int[8];
        grades[4] = new int[9];
        int k = 0;
        for(int i = 0; i < grades.length; i++){ //length is count of row
            for(int j = 0; j< grades[i].length; j++){ // length is count of column of each row
                k++;
                grades[i][j] = k;
            }
        }

        for (int[] std : grades){
            for (int marks : std){
                System.out.print(marks + " ");
            }
            System.out.println();
        }
    }
}
